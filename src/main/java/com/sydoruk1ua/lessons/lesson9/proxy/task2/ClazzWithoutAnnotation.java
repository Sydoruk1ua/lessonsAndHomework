package com.sydoruk1ua.lessons.lesson9.proxy.task2;

public class ClazzWithoutAnnotation implements FooInterface {
    @Override
    public void foo() {
        System.out.println("ClazzWithoutAnnotation");
    }
}
