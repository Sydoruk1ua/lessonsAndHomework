package com.sydoruk1ua.homework.home1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Sum of a,b: " + (a + b));
    }
}
