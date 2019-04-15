package com.sydoruk1ua.lessons.lesson3;

public class Test {
    static {
        Byte[][] Byte = {{0}};
        System.out.println(Byte.class);
    }

    float[][] f1;
    float[] f2;
    String[][] names;
    int[][] scores = {{1, 2}, {1, 2, 3, 4}, {1, 2, 3}, {2, 4}, {4, 5}};

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 4};

        int result3 = sum(arr);

        System.out.println(result3);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
