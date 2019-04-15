package com.sydoruk1ua.lessons.lesson4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arrC = new int[]{49, 50, 51, 52, 53, 54, 55, 56, 57};
        String b = Arrays.toString(arrC);
        System.out.println(b);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Integer.MAX_VALUE + 10);
        Integer i = 5000;
        System.out.println(i.hashCode());

        int f;
        f = 5;
        f = ++f + f++;
        System.out.println(f);
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}
