package com.sydoruk1ua.lessons.lesson7.example4;

public class Main {
    public static void main(String[] args) {
        //1
        MyInterface myInterfaceA1 = new MyInterface() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };

        MyInterface myInterfaceL1 = () -> System.out.println("Hello");

        //2
        MyInterface myInterfaceA2 = new MyInterface() {
            @Override
            public void print() {
                System.out.println("Hello");
                System.out.println("!");
            }
        };

        MyInterface myInterfaceL2 = () -> {
            System.out.println("Hello");
            System.out.println("!");
        };

        //3
        MyInterface1 myInterfaceA3 = new MyInterface1() {
            @Override
            public void print(String name) {
                System.out.println(name);
            }
        };

        MyInterface1 myInterfaceL3 = name -> System.out.println(name);
        MyInterface1 myInterfaceL31 = System.out::println;

        //4
        MyInterface2 myInterfaceA4 = new MyInterface2() {
            @Override
            public String getMessage(int n, String name) {
                return "message";
            }
        };

        MyInterface2 myInterfaceL4 = (n, name) -> "message";

        //5
        MyInterface2 myInterfaceA5 = new MyInterface2() {
            @Override
            public String getMessage(int n, String name) {
                System.out.println("...");
                return "message";
            }
        };

        MyInterface2 myInterfaceL5 = (n, name) -> {
            System.out.println("...");
            return "message";
        };
    }
}
