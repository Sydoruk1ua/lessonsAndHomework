package com.sydoruk1ua.homework.tests;

public class Test {
    private static class Test2 {
        private static final String name = "Name";
    }

    public static void main(String[] args) {
        System.out.println("Yed");

        Integer x = new Integer( 456);
        Integer y = x;
        System.out.println(x == y);
        y++;
        System.out.println();
        System.out.println(x == y);
    }
}