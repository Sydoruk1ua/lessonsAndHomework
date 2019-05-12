package com.sydoruk1ua.lessons.lesson9.proxy.dinamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LogginHandler implements InvocationHandler {
    private final Object target;
    private final Map<String, Integer> calls = new HashMap<>();

    public LogginHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();

        if (methodName.contains("toString")) {
            return calls.toString();
        }

        calls.merge(methodName, 1, Integer::sum);
        long start = System.currentTimeMillis();
        Object invoke = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println(methodName + " " + (end - start));
        return invoke;

    }
}
