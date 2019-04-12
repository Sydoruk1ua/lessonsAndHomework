package com.sydoruk1ua.lessons.lesson11.test;

public class X {
    public <X> X(X x) {
        System.out.println("generic constructor");
    }

    public X(X x) {
        System.out.println("simpl");
    }

    public X() {

    }

    public static void main(String[] args) {
        X x = new X(new Integer(5));
        X x1 = new X(x);
    }
}
