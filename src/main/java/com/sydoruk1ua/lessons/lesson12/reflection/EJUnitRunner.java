package com.sydoruk1ua.lessons.lesson12.reflection;

import com.sydoruk1ua.lessons.lesson12.reflection.annotation.AfterMethod;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.BeforeMethod;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.Ignore;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EJUnitRunner {
    public static void main(String[] args) throws Exception {
        Class<TestClass> testClazz = TestClass.class;

        //create object
        Constructor<TestClass> constructor = testClazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        //instance
        TestClass instance = constructor.newInstance();

        Method[] methods = testClazz.getDeclaredMethods();

        List<Method> beforeMethods = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(BeforeMethod.class))
                .collect(Collectors.toList());

        List<Method> testMethods = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(Test.class))
                .filter(method -> !method.isAnnotationPresent(Ignore.class))
                .collect(Collectors.toList());

        List<Method> afterMethods = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(AfterMethod.class))
                .collect(Collectors.toList());

        for (Method testMethod : testMethods) {
            runMethods(instance, beforeMethods);
            runTestMethods(instance, testMethod);
            runMethods(instance, afterMethods);
        }
    }

    private static void runSingleMethod(Object instance, Method method) {
        try {
            method.invoke(instance);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static void runTestMethods(Object instance, Method method) {
        try {
            method.invoke(instance);
        } catch (Throwable e) {
            Class<? extends Throwable> expectedException = method.getAnnotation(Test.class).expected();
            String expectedMessage = method.getAnnotation(Test.class).message();
            String actualMessage = e.getCause().getMessage() == null ? "" : e.getCause().getMessage();

            if (expectedException.equals(e.getCause().getClass())
                    && actualMessage.equals(expectedMessage)) {
                System.out.println("Test passed.");
            } else {
                System.err.printf("Test failed. Method %s \nthrows %s message `%s` " +
                                "\nexpected %s exception message expected `%s`\n", method.getName(),
                        e.getCause().getClass().getName(), actualMessage, expectedException.getName(),
                        expectedMessage);
                e.printStackTrace();
            }
        }
    }

    private static void runMethods(Object instance, List<Method> beforeMethods) {
        beforeMethods.forEach(method -> runSingleMethod(instance, method));
    }
}
