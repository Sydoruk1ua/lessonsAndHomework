package com.sydoruk1ua.lessons.lesson7;

public class Test {
    static void m(Long... a) {
        System.out.println("1");
    }

    static void m(Integer... a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        // System.out.println(~220 == -110);
        Integer i1 = new Integer(1);
        m(1, 2);
    }
}
