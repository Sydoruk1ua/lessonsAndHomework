package com.sydoruk1ua.lessons.lesson7.example2;

public abstract class Figure {
    protected int size;
    private String name;

    public Figure(int size) {
        this.size = size;
    }

    public Figure() {
    }

    public Figure(String name) {
        this.name = name;
    }

    public abstract int perimeter();

    public abstract int area();
}
