package com.sydoruk1ua.homework.tests;

public class Test {
    private static void method() {

    }
    public static void main(String[] args) {
        System.out.println("Yed");

        Integer x = 456;
        Integer y = x;
        System.out.println(x == y);
        x++;
        System.out.println();
        System.out.println(x == y);
    }

    private static class Test2 {
        private static final String name = "Name";
    }
}

class A1 extends Test {
    public void method() {

    }
}