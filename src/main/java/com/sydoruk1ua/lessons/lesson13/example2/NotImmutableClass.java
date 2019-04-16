package com.sydoruk1ua.lessons.lesson13.example2;

import java.util.Objects;

public final class NotImmutableClass {
    private final String str;
    private final int a;
    private final ImmutableClass immutableClass;

    public NotImmutableClass(String str, int a, ImmutableClass immutableClass) {
        this.str = str;
        this.a = a;
        this.immutableClass = copyImmutableClass(immutableClass);
    }

    public String getStr() {
        return str;
    }

    public int getA() {
        return a;
    }

    public ImmutableClass getImmutableClass() {
        return copyImmutableClass(immutableClass);
    }

    public NotImmutableClass setIntA(int a) {
        return new NotImmutableClass(str, a, immutableClass);
    }
    @Override
    public String toString() {
        return "NotImmutableClass{" +
                "str='" + str + '\'' +
                ", a=" + a +
                ", immutableClass=" + immutableClass +
                '}';
    }

    private ImmutableClass copyImmutableClass(ImmutableClass immutableClass) {
        return Objects.isNull(immutableClass) ? null : new ImmutableClass(immutableClass.getStr());
    }
}
