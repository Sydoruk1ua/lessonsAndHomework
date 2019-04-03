package com.sydoruk1ua.lessons.lesson7.example2;

public class Main {
    public static void main(String[] args) {

        Figure figure = new Figure(10) {
            @Override
            public int perimeter() {
                return this.size;
            }

            @Override
            public int area() {
                return 100 * this.size;
            }
        };

        System.out.println(figure.area());
    }

    public static Figure findFigure() {
        return new Figure("F") {
            @Override
            public int perimeter() {
                return 0;
            }

            @Override
            public int area() {
                return 0;
            }
        };
    }
}
