package com.sydoruk1ua.lessons.lesson13.example3.predicates;

import com.sydoruk1ua.lessons.lesson13.example3.Colour;
import com.sydoruk1ua.lessons.lesson13.example3.Product;
import com.sydoruk1ua.lessons.lesson13.example3.Size;

import java.util.function.Predicate;

public class ColourAndSizePredicate implements Predicate<Product> {
    private Colour colour;
    private Size size;

    public ColourAndSizePredicate(Colour colour, Size size) {
        this.colour = colour;
        this.size = size;
    }


    @Override
    public boolean test(Product product) {
        return colour == product.getColour() && size == product.getSize();
    }
}
