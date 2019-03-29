package com.sydoruk1ua.math.example1;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {
        int k;
        for (int m = array.length; m >= 0; m--) {
            for (int i = 0; i < array.length - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.println("Bubble sort");
        swap(array, 1, 1);
    }

    @Override
    public void swap(int[] array, int i, int j) {
        array[i] ^= array[j];
        array[j] ^= array[i];
        array[i] ^= array[j];
    }

    @Override
    public void print(int[] array) {
        throw new UnsupportedOperationException();
    }
}
