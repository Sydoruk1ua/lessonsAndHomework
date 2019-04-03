package com.sydoruk1ua.lessons.lesson5.example7;

public class B extends A {
    private int i;

    public B(int i, int i1) {
        super(i);
        this.i = i1;
    }

    @Override
    public int getI() {
        return i;
    }
}
