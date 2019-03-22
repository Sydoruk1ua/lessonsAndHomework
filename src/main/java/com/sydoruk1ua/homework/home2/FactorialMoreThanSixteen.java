package com.sydoruk1ua.homework.home2;

import java.math.BigInteger;

public class FactorialMoreThanSixteen {
    public static void main(String[] args) {
        System.out.println("Factorial of 3 : " + getFactorialOfN(3));
        System.out.println("Factorial of 15 : " + getFactorialOfN(15));
        System.out.println("Factorial of 16 : " + getFactorialOfN(16));
        System.out.println("Factorial of 46 : " + getFactorialOfN(46));
    }

    private static BigInteger getFactorialOfN(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
