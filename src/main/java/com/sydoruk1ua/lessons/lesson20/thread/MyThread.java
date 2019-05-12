package com.sydoruk1ua.lessons.lesson20.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run.......O my!!!");
    }
}
