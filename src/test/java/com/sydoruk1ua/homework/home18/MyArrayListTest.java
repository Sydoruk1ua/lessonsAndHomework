package com.sydoruk1ua.homework.home18;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    public static final int LIST_SIZE = 11;
    private MyArrayList<Integer> list;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    public void shouldBeEmptyForNewList() {
        list = new MyArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void shouldReturnRealSize() {
        list = new MyArrayList<>();
        list.add(1);
        list.add(2);

        assertEquals(2, list.size());
    }

    @Test
    public void shouldAddElementsWithoutIncreaseArray() {
        list.add(1);
        list.add(2);

        assertEquals(2, list.size());
        assertEquals(new Integer(1), list.get(0));
        assertEquals(new Integer(2), list.get(1));
    }


    @Test
    public void shouldAddElementWithArrayIncreased() {
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(i);
        }
        assertEquals(11, list.size());
        for (int i = 0; i < LIST_SIZE; i++) {
            assertEquals(new Integer(i), list.get(i));
        }
    }

    @Test
    public void shouldClearArray() {
        list.add(1);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void shouldRemoveItem() {
        list.add(1);
        list.add(2);
        assertEquals(new Integer(1), list.get(0));

        list.remove(0);

        assertEquals(new Integer(2), list.get(0));
        assertEquals(1, list.size());
    }
}