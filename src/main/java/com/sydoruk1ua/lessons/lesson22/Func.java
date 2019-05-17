package com.sydoruk1ua.lessons.lesson22;

public class Func {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr2 = arr.clone();
        System.out.println(arr[0] == arr2[0] && arr[1] == arr2[1]);
    }

    public int f(int x) {
        if (x % 2 == 0) {
            throw new IllegalArgumentException();
        }
        return x;
    }
}
