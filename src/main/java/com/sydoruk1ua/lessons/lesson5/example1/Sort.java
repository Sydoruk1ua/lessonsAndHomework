package com.sydoruk1ua.lessons.lesson5.example1;

public interface Sort extends Print, A {
    void sort(int[] array);

    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
