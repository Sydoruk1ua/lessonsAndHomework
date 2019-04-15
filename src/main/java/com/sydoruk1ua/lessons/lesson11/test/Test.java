package com.sydoruk1ua.lessons.lesson11.test;

public class Test {
    public static void main(String[] args) {
        /*double p = Double.POSITIVE_INFINITY;
        double n = Double.NEGATIVE_INFINITY;
        System.out.println((long) p);
        System.out.println((long) n);
        System.out.println((short) p);
        System.out.println((short) n);
        System.out.println((byte) p);
        System.out.println((byte) n);
        System.out.println((char) p > (char) n);
        System.out.println((char) n);

        byte i = 0;
        Integer i2 = 127;
        var(i, i2);*/

        String str = "19";
        str.concat(".5");
    }

    public static void var(Integer i, int k) {
        System.out.println("Integer");
    }

    public static void var(Object... k) {
        System.out.println("Object");
    }

   /* public static void var(int... k) {
        System.out.println("int");
    }*/

    public static void var(Integer... k) {
        System.out.println("integer arr");
    }
}
