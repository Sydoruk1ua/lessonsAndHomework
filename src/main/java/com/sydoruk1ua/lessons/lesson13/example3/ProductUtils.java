package com.sydoruk1ua.lessons.lesson13.example3;

import java.util.List;
import java.util.stream.Collectors;

public class ProductUtils {
    public static List<Product> findByColour(List<Product> list, Colour colour) {
        return list.stream()
                .filter(product -> product.getColour() == colour)
                .collect(Collectors.toList());
    }

    public static List<Product> findBySize(List<Product> list, Size size) {
        return list.stream()
                .filter(product -> product.getSize() == size)
                .collect(Collectors.toList());
    }
    //below is bad
    public static List<Product> findBySizeAndColour(List<Product> list, Size size, Colour colour) {
        return list.stream()
                .filter(product -> product.getSize() == size)
                .filter(product -> product.getColour() == colour)
                .collect(Collectors.toList());
    }
}
