package com.sydoruk1ua.math.example2;

public interface MyInterfaceA {

    int USER_AGE = 10;

    static int sum(int a, int b) {
        return a + b;
    }

    void print(String message);

    default void print(String message, int number) {
        for (int i = 0; i < number; i++) {
            print(message);
        }
    }
}
