package com.sydoruk1ua.lessons.lesson9.proxy.task2;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        FooInterface clazzWithoutA = new ClazzWithoutAnnotation();
        FooInterface clazzWithA = new ClazzWithAnnotation();
        FooInterface messagedWithoutA = withMessaging(clazzWithoutA, FooInterface.class);
        FooInterface messagedWithA = withMessaging(clazzWithA, FooInterface.class);
        messagedWithoutA.foo();
        messagedWithA.foo();

        //static
        ProxyStatic proxyStatic1 = new ProxyStatic(clazzWithoutA);
        proxyStatic1.foo();

        ProxyStatic proxyStatic2 = new ProxyStatic(clazzWithA);
        proxyStatic2.foo();
    }

    public static <T> T withMessaging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class[]{itf},
                new MessageHandler(target));
    }
}
