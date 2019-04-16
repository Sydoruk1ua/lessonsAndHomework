package com.sydoruk1ua.homework.tests;

public class Test {
    public static void main(String[] args) {
        System.out.println("Yed");

        Integer x = 456;
        Integer y = x;
        System.out.println(x == y);
        x++;
        System.out.println();
        System.out.println(x == y);
    }

    public int method() {
        return 0;
    }

    private static class Test2 {
        private static final String name = "Name";
    }
}

class A1 extends Test {
    @Override
    public int method() {
        return 0;
    }
}