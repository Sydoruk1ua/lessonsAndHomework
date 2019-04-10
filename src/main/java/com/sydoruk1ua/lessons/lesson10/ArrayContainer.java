package com.sydoruk1ua.lessons.lesson10;

public class ArrayContainer<T extends Number> {
    private T[] array;

    public ArrayContainer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double sum() {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum;
    }

    public boolean isEquals(ArrayContainer<? extends T> arrayContainer) {
        return this.sum() == arrayContainer.sum();
    }
}
