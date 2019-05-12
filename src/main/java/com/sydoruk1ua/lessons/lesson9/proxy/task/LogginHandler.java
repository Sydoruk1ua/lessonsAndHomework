package com.sydoruk1ua.lessons.lesson9.proxy.task;

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
        Long start = System.currentTimeMillis();
        if (methodName.contains("foo100")) {
            return calls.toString();
        }
        Long end = System.currentTimeMillis();
        calls.merge(methodName, 1, Integer::sum);
        System.out.println("foo100 time: " + (end - start) );
        return method.invoke(target, (end - start));
    }
}
