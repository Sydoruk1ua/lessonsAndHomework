package com.sydoruk1ua.lessons.lesson13.example3.predicates;

import com.sydoruk1ua.lessons.lesson13.example3.Colour;
import com.sydoruk1ua.lessons.lesson13.example3.Product;

import java.util.function.Predicate;

public class ColourPredicate implements Predicate<Product> {
    private Colour colour;

    public ColourPredicate(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean test(Product product) {
        return product.getColour() == colour;
    }
}
