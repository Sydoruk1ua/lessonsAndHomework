package com.sydoruk1ua.lessons.lesson12.reflection;

import com.sydoruk1ua.lessons.lesson12.reflection.annotation.AfterMethod;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.BeforeMethod;
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
                .collect(Collectors.toList());

        List<Method> afterMethods = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(AfterMethod.class))
                .collect(Collectors.toList());

        for (Method testMethod : testMethods) {
            runMethods(instance, beforeMethods);
            runSingleMethod(instance, testMethod);
            runMethods(instance, afterMethods);
        }
    }

    private static void runSingleMethod(Object instance, Method method) {
        try {
            method.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runMethods(Object instance, List<Method> beforeMethods) {
        beforeMethods.forEach(method -> runSingleMethod(instance, method));
    }
}
