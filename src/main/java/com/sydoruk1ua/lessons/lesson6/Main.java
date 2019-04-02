package com.sydoruk1ua.lessons.lesson6;

public class Main {
    public static void main(String[] args) {/*
        char c = '0';
        System.out.println(Integer.valueOf(c));
        for (; c <= 9; c++) {
            System.out.println();
        }*/
    ClassA a = new ClassB();
        System.out.println(a.x);
     /*   Integer i = new Integer("10");
        if (i.toString() == i.toString()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }*/
    }
}

class Car {

}
class ClassA {
    int x = 1;
}

class ClassB extends ClassA {
    int x = 2;
}

