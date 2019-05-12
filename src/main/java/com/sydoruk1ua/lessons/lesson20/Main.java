package com.sydoruk1ua.lessons.lesson20;

import com.sydoruk1ua.lessons.lesson20.synchr.ThreadUtil;
import com.sydoruk1ua.lessons.lesson20.thread.MyRunnableImpl;
import com.sydoruk1ua.lessons.lesson20.thread.MyThread;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setPriority(10);
        myThread1.start();
        myThread2.start();
        System.out.println(myThread1.getPriority());
        ThreadUtil.sleep(100L);
        System.out.println("main end");

        Runnable myRunnable = new MyRunnableImpl();
        Thread thread = new Thread(myRunnable);
        thread.start();
        //Runnable lambda implementation
        Thread threadA = new Thread(() -> System.out.println("Hi"));
        threadA.start();
    }



    public class Inner {
        static final int f = 3;
//        static int p =3;    }
//
    }

    class ClassA<U> implements Comparable<U> {
        @Override
        public int compareTo(U o) {
            return 0;
        }
    }

    class ClassF<U extends Comparable<U> & Serializable> extends ClassA<Number> {

    }
}

/*
class ClassH<U extends Comparable<U>> extends ClassA<? extends Number> {

}*/
