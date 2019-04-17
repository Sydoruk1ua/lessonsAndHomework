package com.sydoruk1ua.lessons.lesson13.example3.filter;

import com.sydoruk1ua.lessons.lesson13.example3.Product;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductFilterImpl implements ProductFilter {
    private Collection<Product> products;

    public ProductFilterImpl(Collection<Product> products) {
        this.products = products;
    }

    @Override
    public Collection<Product> filterProducts(Predicate<Product> predicate) {
        return products.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
