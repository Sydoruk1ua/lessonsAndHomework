package com.sydoruk1ua.lessons.lesson10;

public class GenericContainer<T> {
    private T a;

    public GenericContainer(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }
}
