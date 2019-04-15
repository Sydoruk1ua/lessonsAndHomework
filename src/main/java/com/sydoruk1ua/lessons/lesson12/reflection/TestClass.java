package com.sydoruk1ua.lessons.lesson12.reflection;

import com.sydoruk1ua.lessons.lesson12.reflection.annotation.AfterMethod;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.BeforeMethod;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.Ignore;
import com.sydoruk1ua.lessons.lesson12.reflection.annotation.Test;

public class TestClass {

    @BeforeMethod
    public void init() {
        System.out.println("before method");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @BeforeMethod
    public void init2() {
        System.out.println("before method2");
    }

    @Ignore
    @Test
    public void testIgnore() {
        System.out.println("Shouldn't see this: test Ignore");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test(expected = RuntimeException.class, message = "some message")
    public void shouldGetException() {
        throw new RuntimeException("some message");
    }


    @AfterMethod
    public void clean() {
        System.out.println("after method");
    }
}
