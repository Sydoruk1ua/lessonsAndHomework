package com.sydoruk1ua.lessons.lesson9.proxy.dinamic;

public class Person implements Human {
    @Override
    public void walk() {
        System.out.println("I'm waking");
    }

    @Override
    public void talk() {
        System.out.println("I'm talking");
    }
}
