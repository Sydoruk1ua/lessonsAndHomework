package com.sydoruk1ua.lessons.lesson13.example3.predicates;

import com.sydoruk1ua.lessons.lesson13.example3.Product;
import com.sydoruk1ua.lessons.lesson13.example3.Size;

import java.util.function.Predicate;

public class SizePredicate implements Predicate<Product> {
    private Size size;

    public SizePredicate(Size size) {
        this.size = size;
    }

    @Override
    public boolean test(Product product) {
        return product.getSize() == size;
    }
}
