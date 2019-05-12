package com.sydoruk1ua.lessons.lesson20.synchr;

public class Container {
    private static final int MAX_NUMBER = 5;
    private int counter;

    public Container(int counter) {
        this.counter = counter;
    }

    public synchronized void put() {
        while (counter >= MAX_NUMBER) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      //  ThreadUtil.sleep(100L);
        System.out.println(Thread.currentThread().getName() + " " + ++counter);
        notifyAll();
    }

    public synchronized void get() {
        while (counter <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    //    ThreadUtil.sleep(100L);
        System.out.println(Thread.currentThread().getName() + " " + --counter);
        notifyAll();
    }
}
