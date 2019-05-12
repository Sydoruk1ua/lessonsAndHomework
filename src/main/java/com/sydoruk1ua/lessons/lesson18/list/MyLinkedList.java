package com.sydoruk1ua.lessons.lesson18.list;

import java.util.LinkedList;

public class MyLinkedList<T> implements MyList<T> {
    Node<T> first;
    Node<T> last;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(T item) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, item, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    private void validateIndex(int index) {
        if (index < 0 || index > Integer.MAX_VALUE - 9) {
            throw new RuntimeException("Index: " + index + " is not valid");
        }
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
