package com.sydoruk1ua.lessons.lesson20.synchr;

public class Producer implements Runnable{
    private Container container;

    public Producer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
//            ThreadUtil.sleep(1000L);
            container.put();
        }
    }
}
