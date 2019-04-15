package com.sydoruk1ua.homework.tests;

class A {
    public A() {
        System.out.print("A");
    }
}

class B {
    public B() {
        System.out.print("B");
    }
}

class C {
    public C() {
        System.out.print("C");
    }
}

public class D extends C {
    private static B objB = new B();
    private A objA = new A();

    public D() {
        System.out.print("D");
    }

    public static void main(String[] args) {
        new D();
    }
}