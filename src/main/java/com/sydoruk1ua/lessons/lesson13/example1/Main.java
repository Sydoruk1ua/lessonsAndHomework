package com.sydoruk1ua.lessons.lesson13.example1;

public class Main {

    public static final int N = 10_000_000;

    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        //
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < N; i++) {
            stringBuffer.append("Hi");
        }
        long end1 = System.currentTimeMillis();

        System.out.println("String buffer " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        //
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder.append("Hi");
        }
        long end2 = System.currentTimeMillis();

        System.out.println("String builder " + (end2 - start2));

    }

    private static long method() {
        long start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < N; i++) {
            stringBuffer.append("Hi");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    class StringWrapper {
        private StringBuilder stringBuilder = new StringBuilder();
        private StringBuffer stringBuffer = new StringBuffer();

        public StringWrapper append(String str, StringBuilderType type) {
            if(type == StringBuilderType.STRING_BUILDER){
                stringBuilder.append(str);
            } else {
                stringBuffer.append(str);
            }
            return this;
        }

    }

}
