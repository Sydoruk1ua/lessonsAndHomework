package com.sydoruk1ua.lessons.lesson20.synchr;

public class ThreadUtil {
    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
