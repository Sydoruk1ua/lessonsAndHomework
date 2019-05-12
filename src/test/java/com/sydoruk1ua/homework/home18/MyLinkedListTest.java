package com.sydoruk1ua.homework.home18;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    private MyLinkedList<Integer> list;

    @Before
    public void setUp() {
        list = new MyLinkedList<>();
    }

    @Test
    public void shouldAddElement() {
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void shouldBeEmptyForNewList() {
        list = new MyLinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void shouldClearArray() {
        list.add(1);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void shouldGetElementByIndex() {
        list.add(1);
        assertEquals(new Integer(1), list.get(0));
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