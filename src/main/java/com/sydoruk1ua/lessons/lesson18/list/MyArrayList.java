package com.sydoruk1ua.lessons.lesson18.list;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] array;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        if (array.length == size) {
            increaseArray();
        }
        System.out.println("test");
        array[size] = item;
        System.out.println("after");
        size++;

    }

    private void increaseArray() {
      /*  Object[] objects = new Object[size * 3 / 2];
        System.arraycopy(array, 0, objects, 0, size);
        this.array = objects;*/

        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // minCapacity is usually close to size, so this is a win:
        array = Arrays.copyOf(array, newCapacity);
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        return (T) array[index];
    }

    private void validateIndex(int index) {
        if (index >= 0 && index < size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    @Override
    public T remove(int index) {
        validateIndex(index);

        T oldValue = get(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(array, index+1, array, index,
                    numMoved);
        array[--size] = null;

        return oldValue;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Object[DEFAULT_CAPACITY];
    }
}
