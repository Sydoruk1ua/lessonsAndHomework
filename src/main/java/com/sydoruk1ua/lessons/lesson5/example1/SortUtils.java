package com.sydoruk1ua.lessons.lesson5.example1;

public final class SortUtils {

    private SortUtils() {

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
