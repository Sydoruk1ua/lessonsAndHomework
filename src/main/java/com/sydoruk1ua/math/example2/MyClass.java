package com.sydoruk1ua.math.example2;

public class MyClass implements MyInterfaceA, MyInterfaceB {
    @Override
    public void print(String message) {
        System.out.println(MyInterfaceA.USER_AGE);
    }

    @Override
    public void print(String message, int number) {

    }
}
