package com.sydoruk1ua.lessons.lesson9.proxy.staticks;

public class Demo {
    public static void main(String[] args) {
        Payable payableWithoutProxy = new RealPayImpl();
        Payable payableWithProxy = new ProxyPayImpl(payableWithoutProxy);
        payableWithoutProxy.pay(100);
        payableWithProxy.pay(100);
    }
}
