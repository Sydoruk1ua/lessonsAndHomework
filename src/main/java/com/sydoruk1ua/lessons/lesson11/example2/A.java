package com.sydoruk1ua.lessons.lesson11.example2;

public class A {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        try {
//            return 1;
            throw null;
        } finally {
            throw new RuntimeException();
        }
    }
}
