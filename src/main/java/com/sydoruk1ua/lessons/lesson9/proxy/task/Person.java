package com.sydoruk1ua.lessons.lesson9.proxy.task;

public class Person implements Human {
    @Override
    public void foo100() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void foo1500() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
