package com.sydoruk1ua.lessons.lesson11.exception;

public class MyMath {

    static int div(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        return a / b;
    }

    static void method1() throws Exception {
        throw new Exception();
    }

    static void method1Wrapper() {
        try {
            method1();
        } catch (Exception e) {

        } finally {

        }
    }

    static int divWrapper(int a, int b) {
        try {
            return div(a, b);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try {
            int result = 0;
            result = div(1, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(10);
        }
    }
}
