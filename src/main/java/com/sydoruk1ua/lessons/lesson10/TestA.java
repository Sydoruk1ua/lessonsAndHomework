package com.sydoruk1ua.lessons.lesson10;

public class TestA {
    private <K> K method(K k) {
        return null;
    }

    public static void main(String[] args) {
        TestA testA = new TestA();
        String string = testA.method(new String("string"));

        Test a = new Test();
      //  String string1 = a.<String>method1("dfd");
    }
}
