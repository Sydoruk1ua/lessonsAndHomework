package com.sydoruk1ua.lessons.lesson5.example1;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        System.out.println("Quick sort");
    }

    @Override
    public void print(int[] array) {
        throw new UnsupportedOperationException();
    }
}
