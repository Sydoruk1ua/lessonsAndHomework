package com.sydoruk1ua.lessons.lesson13.example3.filter;

import com.sydoruk1ua.lessons.lesson13.example3.Product;

import java.util.Collection;
import java.util.function.Predicate;

public interface ProductFilter {
    Collection<Product> filterProducts(Predicate<Product> predicate);
}
