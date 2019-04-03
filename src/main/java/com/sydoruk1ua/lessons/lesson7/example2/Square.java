package com.sydoruk1ua.lessons.lesson7.example2;

public class Square extends Figure {
    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public int perimeter() {
        return 4 * a;
    }

    @Override
    public int area() {
        return a * a;
    }
}
