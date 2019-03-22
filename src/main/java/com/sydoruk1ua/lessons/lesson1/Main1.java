package com.sydoruk1ua.lessons.lesson1;

public class Main1 {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static void main(String[] args) {
        long factorial = factorial(15);
        System.out.println(factorial);
        System.out.println(factorialR(15));
        int a = 0;

        System.out.println(a > 0 ? YES : NO);
    }

    private static long factorial(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static long factorialR(int number) {
        return (number == 0 || number == 1) ? 1 : number * factorialR(number - 1);
    }
}
