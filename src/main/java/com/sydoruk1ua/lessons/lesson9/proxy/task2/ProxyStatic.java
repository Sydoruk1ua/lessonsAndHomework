package com.sydoruk1ua.lessons.lesson9.proxy.task2;

public class ProxyStatic implements FooInterface {
    FooInterface fooInterface;

    public ProxyStatic(FooInterface fooInterface) {
        this.fooInterface = fooInterface;
    }


    @Override
    public void foo() {
        try {
            if(fooInterface.getClass().getMethod("foo").isAnnotationPresent(SecureAnnotation.class)){
                System.out.println("annotation is present");
                fooInterface.foo();
            } else {
                System.out.println("annotation isn't present");
                fooInterface.foo();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
