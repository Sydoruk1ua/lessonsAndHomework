package com.sydoruk1ua.lessons.lesson8.patterns.example3;

public class Service1 {
    private static Service1 ourInstance = new Service1();

    private Service1() {
    }

    public static Service1 getInstance() {
        return ourInstance;
    }
}
