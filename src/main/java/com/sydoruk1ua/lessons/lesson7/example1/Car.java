package com.sydoruk1ua.lessons.lesson7.example1;

public class Car {

    private String name;
    private Motor motor;

    public Car(String name, int volume) {
        this.name = name;
        this.motor = new Motor(volume);
    }

    private static void print() {
        System.out.println("static method");
    }

    public void print(String name) {
        System.out.println("not static method");
//        new Car("df", 3).new Motor(4).method1();
    }

    public class Motor {
        private int volume;
//        private

        public Motor(int volume) {
            this.volume = volume;
        }

        private void method1() {

        }

        public void method() {
            print();
            print("Hello");
//            new Car("Mersedes", 3).print("Hello");
        }
    }
}
