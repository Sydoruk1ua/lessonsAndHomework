package com.sydoruk1ua.homework.home12;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Singleton instance1TheSame = Singleton.getInstance();
        Singleton instance2TheSame = Singleton.getInstance();
        System.out.println("Should return true: " + instance1TheSame.equals(instance2TheSame));

        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance3DiffObject = constructor.newInstance();
        System.out.println("Should return false: " + instance1TheSame.equals(instance3DiffObject));
    }
}
