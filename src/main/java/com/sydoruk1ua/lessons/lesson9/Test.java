package com.sydoruk1ua.lessons.lesson9;

public class Test {
    public static void main(String[] args) {
        switch (new Integer(4)) {
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println(3);
        }
        //3 d
        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                //continue outer;
                break;
            }
            System.out.println("outer");
        }
        System.out.println("Good-Bye");
    }
}
