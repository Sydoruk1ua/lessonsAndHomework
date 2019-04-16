package com.sydoruk1ua.lessons.lesson13.example2;

public class ImmutableClass {
    private String str;

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "str='" + str + '\'' +
                '}';
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ImmutableClass(String str) {
        this.str = str;
    }
}
