package com.sydoruk1ua.lessons.lesson9;

public class B extends A {
    public static void main(String[] args) {
        try {
            ((A) new B()).process();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public void process() throws RuntimeException {
        super.process();
        if (true) throw new RuntimeException();
        System.out.println("B");
    }
}

class A {
    public void process() {
        System.out.println("A");
    }
}