package com.sydoruk1ua.lessons.lesson13.example3;

public class Product {
    private String name;
    private Colour colour;
    private Size size;

    public Product(String name, Colour colour, Size size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Colour getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }
}
