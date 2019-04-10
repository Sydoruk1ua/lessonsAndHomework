package com.sydoruk1ua.lessons.lesson10;

public class Clazz<Parameter> {
    public static void main(String[] args) {
        Clazz<String> clazz = new Clazz<>();
        System.out.println(clazz.isEquals(new Clazz<Object>()));

        Clazz<Object> clazz2 = new Clazz<>();
        Clazz clazz3 = new Clazz<>();
    }

    public boolean isEquals(Clazz<? super Parameter> clazz) {
        return false;
    }
}
