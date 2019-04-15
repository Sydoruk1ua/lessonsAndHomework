package com.sydoruk1ua.lessons.lesson12.example1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        // A a = new A();

        //  a.method();

        Class<A> aClazz = A.class;

        Constructor<A> constructor = aClazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        A a = constructor.newInstance();

        Class<? extends A> aClass = a.getClass();

        Method method = aClass.getDeclaredMethod("method");
        method.setAccessible(true);
        method.invoke(a);

        Class<B> bClass = B.class;
        Constructor<B> constructorB = bClass.getDeclaredConstructor(String.class, int.class);
        constructorB.setAccessible(true);
        B b = constructorB.newInstance("name", 3);
        Method messageMethod = bClass.getDeclaredMethod("message", int.class);
        messageMethod.setAccessible(true);
        String invoke = (String) messageMethod.invoke(b, 2);
        System.out.println(invoke);
        //   System.out.println(messageMethod.invoke(b, 2));
    }
}

class B {
    private String name;
    private int age;

    private B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String message(int n) {
        String result = name + " " + age;
        StringBuilder resultBuilder = new StringBuilder();
        //result.append(name).append(" ").append(age);

        for (int i = 0; i < n; i++) {
//            result.append(" ").append(name).append(" ").append(age);
            resultBuilder.append(result);
        }
        return resultBuilder.toString();
    }
}

class A {
    private A() {

    }

    private void method() {
        System.out.println("Hi");
    }
}
