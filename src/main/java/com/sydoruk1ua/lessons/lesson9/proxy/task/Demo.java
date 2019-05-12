package com.sydoruk1ua.lessons.lesson9.proxy.task;

import com.sydoruk1ua.lessons.lesson9.proxy.dinamic.LogginHandler;

import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args) {
        Human person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.foo100();
        logged.foo1500();

        System.out.println(logged.toString());
    }

    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class[]{itf},
                new LogginHandler(target));
    }
}
