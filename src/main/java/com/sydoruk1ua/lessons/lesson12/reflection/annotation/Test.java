package com.sydoruk1ua.lessons.lesson12.reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

    Class<? extends Throwable> expected() default None.class;

    String message() default "";

    class None extends Throwable {
        private None() {
        }
    }
}
