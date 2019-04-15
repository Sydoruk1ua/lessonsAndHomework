package com.sydoruk1ua.lessons.lesson6;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

    }

    public static HashMap<String, Integer> getMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            map.put("min", min);
            map.put("max", max);
        }
        return map;
    }
}
