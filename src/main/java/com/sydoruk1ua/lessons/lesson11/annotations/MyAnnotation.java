package com.sydoruk1ua.lessons.lesson11.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

enum MyEnum {
    MY_A, MY_B
}

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, FIELD})
public @interface MyAnnotation {
    String value(); //this is field

    MyEnum type() default MyEnum.MY_A;

    int number() default 1;
}

