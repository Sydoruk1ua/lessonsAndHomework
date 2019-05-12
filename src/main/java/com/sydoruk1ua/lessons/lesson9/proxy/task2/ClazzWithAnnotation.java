package com.sydoruk1ua.lessons.lesson9.proxy.task2;

public class ClazzWithAnnotation implements FooInterface{

    @SecureAnnotation
    @Override
    public void foo() {
        System.out.println("ClazzWithAnnotation");
    }
}
