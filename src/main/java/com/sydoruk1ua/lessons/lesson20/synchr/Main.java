package com.sydoruk1ua.lessons.lesson20.synchr;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1);
        Consumer consumer1 = new Consumer(container);
        Consumer consumer2 = new Consumer(container);
        Consumer consumer3 = new Consumer(container);
        Consumer consumer4 = new Consumer(container);
        Producer producer1 = new Producer(container);
        Producer producer2 = new Producer(container);
        Producer producer3 = new Producer(container);

        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();
        new Thread(consumer4).start();
        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
    }
}
