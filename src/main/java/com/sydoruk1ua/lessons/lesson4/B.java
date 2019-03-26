package com.sydoruk1ua.lessons.lesson4;

public class B {
    static {
        A[] A = new A[3];

        for (int i = 0; i < 3; i++) {
            A[i] = new A(i);
        }
       // System.out.println(A.b);
    }
        public static void main (String[]args){
            B pb = new B();
        }
    }


class A {
    int a;
    static int b = 23;

    A(int s) {
        a = s;
    }

    int getA() {
        return a;
    }
}