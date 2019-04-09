package com.sydoruk1ua.lessons.lesson9.example1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phonable bf1 = new TheBestFax();
        bf1.phone();

        ((Scanable) bf1).scan();

        FaxInterface faxInterface = new TheBestFax();
        faxInterface.phone();
        faxInterface.print();
        recall(new TheBestFax(), new NokiaPhone());
    }

    public static void recall(Phonable... phonables) {
        Arrays.stream(phonables).forEach(Phonable::phone);
    }
}
