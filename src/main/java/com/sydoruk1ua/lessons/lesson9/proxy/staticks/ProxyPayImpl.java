package com.sydoruk1ua.lessons.lesson9.proxy.staticks;

public class ProxyPayImpl implements Payable {
    private Payable payable;

    public ProxyPayImpl(Payable payable) {
        this.payable = payable;
    }

    @Override
    public void pay(Integer money) {
        //TODO:

        long start = System.currentTimeMillis();
        if (money < 100) {
            payable.pay(money);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Working time: " + (end - start));
    }
}
