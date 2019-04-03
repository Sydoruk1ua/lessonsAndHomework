package com.sydoruk1ua.lessons.lesson7.example4;

class A {
    static {
        System.out.print("3");
    }

    {
        System.out.print("5");
    }

    public A() {
        System.out.print("4");
    }
}

public class B extends A {
    static {
        System.out.print("6");
    }

    {
        System.out.print("2");
    }

    public B() {
        System.out.print("1");
    }

    public static void main(String[] args) {
        new B();
    }
}