package com.sydoruk1ua.lessons.lesson10;

public class Test<K> {
    public <K> K method1(K k) {
        return null;
    }

    public static void main(String[] args) {
        Test a = new Test();
      //  String string = a.method1(new String("string")); // todo
    }
}
