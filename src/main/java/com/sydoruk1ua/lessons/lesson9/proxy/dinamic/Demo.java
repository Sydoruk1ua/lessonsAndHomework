package com.sydoruk1ua.lessons.lesson9.proxy.dinamic;

import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {
        Human person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.talk();
        logged.talk();
        logged.walk();

        System.out.println(logged.toString());
    }

    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class[]{itf},
                new LogginHandler(target));
    }
}
