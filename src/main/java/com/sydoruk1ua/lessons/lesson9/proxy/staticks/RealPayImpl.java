package com.sydoruk1ua.lessons.lesson9.proxy.staticks;

public class RealPayImpl implements Payable {
    @Override
    public void pay(Integer money) {
        System.out.println("pay");
    }
}
