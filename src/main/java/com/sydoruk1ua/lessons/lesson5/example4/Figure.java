package com.sydoruk1ua.lessons.lesson5.example4;

public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int perimeter();
}