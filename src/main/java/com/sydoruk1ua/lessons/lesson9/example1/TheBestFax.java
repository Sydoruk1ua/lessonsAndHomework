package com.sydoruk1ua.lessons.lesson9.example1;

public class TheBestFax implements Printable, Scanable, FaxInterface {
    @Override
    public void phone() {
        System.out.println("phone");
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void scan() {
        System.out.println("scan");
    }
}
