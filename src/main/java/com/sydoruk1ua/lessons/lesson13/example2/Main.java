package com.sydoruk1ua.lessons.lesson13.example2;

public class Main {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("one");

        NotImmutableClass notImmutableClass = new NotImmutableClass("one", 10, immutableClass);
        System.out.println(notImmutableClass);
        immutableClass.setStr("two");
        System.out.println(notImmutableClass);

        ImmutableClass immutableClass1 = notImmutableClass.getImmutableClass();
        immutableClass1.setStr("three");
        System.out.println(notImmutableClass);


    }
}
