package com.sydoruk1ua.lessons.lesson13.example3.predicates;

import com.sydoruk1ua.lessons.lesson13.example3.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CompositeProductPredicate implements Predicate<Product> {
    List<Predicate<Product>> predicates = new ArrayList<>();

    public CompositeProductPredicate addProductPredicate(Predicate<Product> predicate) {
        predicates.add(predicate);
        return this;
    }

    @Override
    public boolean test(Product product) {
        return predicates.stream().allMatch(predicate -> predicate.test(product));
    }
}
