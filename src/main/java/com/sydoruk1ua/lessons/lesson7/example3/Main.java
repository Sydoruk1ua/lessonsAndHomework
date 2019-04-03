package com.sydoruk1ua.lessons.lesson7.example3;

public class Main {
    private static final int A = 10;

    public static void main(String[] args) {
        int a = 1;
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("print" + A + a);
            }

            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
    }
}
