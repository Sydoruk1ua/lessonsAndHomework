package com.sydoruk1ua.lessons.lesson1;

public class Main {
    private static final int N = 127;

    public static void main(String[] args) {
        byte ba;
        short sa;
        int ia;
        long la;

        byte b1 = 120;
        byte b2 = 120;
        byte b12 = (byte) (200 + 200);
        // System.out.println(b12);

        int i1 = 10;
        int i2 = 0;

        long l1 = 100_000_000_000_000_00L;
/*
        double f1 = 10.0;
        double f2 = -10.0;

        System.out.println(f1 + f2);
        System.out.println(f1 - f2);
        System.out.println(f1 * f2);
        System.out.println(f1 / f2);

        System.out.println(Math.sqrt(f2));*/

        char ch = 'a';
        char cl = '\u0001';

        System.out.println(cl);

        boolean bo1 = true;
        boolean bo2 = false;

        /*int[] arr1 = new int[10];
        int[] arr2 = new int[10];*/

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
    }
}
