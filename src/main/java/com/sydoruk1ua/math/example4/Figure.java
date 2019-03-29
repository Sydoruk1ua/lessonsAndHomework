package com.sydoruk1ua.math.example4;

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