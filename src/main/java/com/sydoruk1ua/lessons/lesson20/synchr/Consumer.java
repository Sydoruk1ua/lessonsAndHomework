package com.sydoruk1ua.lessons.lesson20.synchr;

public class Consumer implements Runnable {
    private Container container;

    public Consumer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
//            ThreadUtil.sleep(2000L);
            container.get();
        }
    }
}
