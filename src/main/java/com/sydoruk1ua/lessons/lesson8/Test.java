package com.sydoruk1ua.lessons.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        System.out.println(args.length);
        String s2 = "STRINg";
        System.out.println(s2.charAt(s2.length() - 1) == 'g');
        StringBuilder sb1 = new StringBuilder("test");
        StringBuilder sb2 = new StringBuilder("test");
        System.out.println(sb1.equals(sb2));
        int var1 = 1;
        System.out.println("df" + var1++);
        System.out.println("df" + ++var1);
//        System.out.println((a, b) );
        /*int a = 5;
        int b = 6;
        Sum sum = (a1, b1) -> a1 + b1;
        System.out.println(sum);*/
//        System.out.println(4|5);
        A a = new B();
        a.m(new Double(5.0));
        Sum sum = (a1, b1) -> a1 + b1;
        int sum1 = sum.sum(4, 6);
    }
}

class A {
    public void m(Double number) {
        number = number / 3;
        System.out.println("class A " + number);
    }
}

class B extends A {
    public void m(Double d) {
        d = d / 3;
        System.out.println("class B " + d);
        Map<? super Integer, ? super Integer> map = new HashMap<Number, Number>();
    }
}