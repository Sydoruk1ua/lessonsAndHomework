package com.sydoruk1ua.util;

public class Utils {
    public static int add(int a, int b) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    public static int function(int x) {

        if (x < 0) {
            return 0;
        }

        if (x == 0) {
            // return 1;
            throw new RuntimeException("Hello");
        }

        if (x < 2) {
            return 5;
        }

        throw new RuntimeException("Hi");
    }

    public static void main(String[] args) {
        System.out.println("x<0,should be 0 " + function(-1));
        System.out.println("x==0,should be 1 " + function(0));
        System.out.println("0<x<2,should be 5 " + function(1));
        System.out.println("x>2,should be 10 " + function(10));
    }
}
