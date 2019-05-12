package com.sydoruk1ua.lessons.lesson9.proxy.task2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MessageHandler implements InvocationHandler {
    private final Object target;

    public MessageHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (target.getClass().getMethod(method.getName()).isAnnotationPresent(SecureAnnotation.class)) {
            System.out.println("Send some secure message");
        } else {
            System.out.println("Send just message");
        }

        return method.invoke(target, args);
    }
}
