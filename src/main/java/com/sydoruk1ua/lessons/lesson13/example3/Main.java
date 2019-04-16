package com.sydoruk1ua.lessons.lesson13.example3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("A",Colour.BLUE, Size.BIG));
        list.add(new Product("B",Colour.GREEN, Size.SMALL));
    }
}
