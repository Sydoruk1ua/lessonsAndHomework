package com.sydoruk1ua.lessons.lesson8.patterns.example3;

public class Service {
    //    public static final Service instance = new Service();
    private static Service instance;

    private Service() {

    }

    public static Service getInstance() {
        //TODO: multithreading
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }
}
