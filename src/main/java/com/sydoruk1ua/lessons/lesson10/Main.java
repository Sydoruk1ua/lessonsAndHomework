package com.sydoruk1ua.lessons.lesson10;

import com.sydoruk1ua.lessons.lesson10.example1.*;

public class Main {
    public static void main(String[] args) {

        IntContainer intContainer = new IntContainer(1);
        int intValue = intContainer.getA();

        StringContainer stringContainer = new StringContainer("string");
        String stringValue = stringContainer.getA();

        AContainer aContainer = new AContainer(new A());
        A aValue = aContainer.getA();

        ObjectContainer intObjectContainer = new ObjectContainer(1);
        Integer intObjectValue = (Integer) intObjectContainer.getA();

        ObjectContainer stringObjectContainer = new ObjectContainer("string");
        String stringObjectValue = (String) stringObjectContainer.getA();
        // Integer stringObjectValueFake = (Integer) stringObjectContainer.getA();

        GenericContainer<Integer> genericContainer = new GenericContainer<>(1);
        Integer a = genericContainer.getA();

        GenericContainer<A> aGenericContainer = new GenericContainer<>(new A());
        A a1 = aGenericContainer.getA();
        GenericContainer<A> bGenericContainer = new GenericContainer<>(new B());
       /* B b = (B) aGenericContainer.getA();
        b.methodB();*/

        Number[] numberArray = {1, 2.0, 3.0};
        ArrayContainer<Number> numberArrayContainer = new ArrayContainer<>(numberArray);

        ArrayContainer<Integer> integerArrayContainer = new ArrayContainer<>(new Integer[]{1, 2, 3});
        System.out.println(numberArrayContainer.sum());

        System.out.println(numberArrayContainer.isEquals(integerArrayContainer));
        //  System.out.println(integerArrayContainer.isEquals(numberArrayContainer));
    }
}
