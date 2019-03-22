package com.sydoruk1ua.lessons.lesson2;

public class Calculator {

    public static final String PLUS = "+";
    public static final String MULT = "*";
    public static final String MINUS = "-";
    public static final String DIV = "/";

    public double calc(double arg1, String operation, double arg2) {
     /*   if ("+".equals(operation)) {
            return arg1 + arg2;
        }
        if ("-".equals(operation)) {
            return arg1 - arg2;
        }
        if ("*".equals(operation)) {
            return arg1 * arg2;
        }
        if ("/".equals(operation)) {
            return arg1 / arg2;
        }

        throw new IllegalArgumentException("There is no such operator");*/

        switch (operation) {
            case PLUS:
                return arg1 + arg2;
            case MULT:
                return arg1 * arg2;
            case MINUS:
                return arg1 - arg2;
            case DIV:
                return arg1 / arg2;
            default:
                throw new IllegalArgumentException("There is no such operator");
        }
    }
}
