package com.sydoruk1ua.homework.home1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacciViaLoop(3));
        System.out.println(getFibonacciViaLoop(4));
        System.out.println(getFibonacciViaLoop(5));
        System.out.println(getFibonacciViaLoop(6));
        System.out.println("--------------------------");
        System.out.println(getFibonacciViaRecursion(3));
        System.out.println(getFibonacciViaRecursion(4));
        System.out.println(getFibonacciViaRecursion(5));
        System.out.println(getFibonacciViaRecursion(6));
    }

    /**
     * Suppose F0 = 0, F1 = 1, F2 = 1, F3 = 2
     */
    private static int getFibonacciViaLoop(int index) {

        if (index <= 1) {
            return index;
        } else {
            int beforeNumber = 0;
            int afterNumber = 1;
            int result = 0;
            for (int i = 0; i < index - 1; i++) {
                result = beforeNumber + afterNumber;
                beforeNumber = afterNumber;
                afterNumber = result;
            }
            return result;
        }
    }

    private static int getFibonacciViaRecursion(int index) {
        if (index <= 1) {
            return index;
        } else {
            return getFibonacciViaRecursion(index - 1) + getFibonacciViaRecursion(index - 2);
        }
    }
}
