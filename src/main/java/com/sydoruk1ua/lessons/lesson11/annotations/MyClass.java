package com.sydoruk1ua.lessons.lesson11.annotations;

public class MyClass {
    //  @MyAnnotation
    private int age;

    @MyAnnotation(value = "Hello", type = MyEnum.MY_B)
    public void method() {

    }
}
