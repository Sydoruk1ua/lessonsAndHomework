package com.sydoruk1ua.homework.home18;

/**
 * @param <T>
 * @see com.sydoruk1ua.lessons.lesson17.Regex //just for test
 */
public interface MyList<T> {
    /**
     * @return the number of elements in this list
     */
    int size();

    void add(T item);

    /**
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    T get(int index);

    T remove(int index);

    void clear();
}
