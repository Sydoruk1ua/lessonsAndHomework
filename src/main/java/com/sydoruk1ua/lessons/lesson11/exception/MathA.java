package com.sydoruk1ua.lessons.lesson11.exception;

public class MathA {
    public static void main(String[] args) {
        try {
            validator(1);
        } catch (BException | AException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void validator(int a) throws Exception {
        if (a == 0) {
            throw new AException();
        }
        if (a == 1) {
            throw new BException();
        }
        if (a == 2) {
            throw new Exception();
        }
    }
}
