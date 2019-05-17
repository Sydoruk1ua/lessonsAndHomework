package com.sydoruk1ua.homework.tests;

import java.io.IOException;

interface Quest10 {
    Number returner();
}

abstract class Quest100 {
    public abstract Integer returner();
}

public class Quest1 extends Quest100 implements Quest10 {//line 1

    public static void main(String[] args) throws IOException {
    /*    Scanner sc1 = new Scanner(System.in);
        int x1 = 0;
        x1 = sc1.nextInt();
        sc1.close();*/
        int x2 = 0;
        System.out.write(50);
        System.out.println((char) x2);
        // System.out.println(x1+" "+(char)x2);
    }

    @Override //line 2
    public Integer returner() {// line 3
        return new Integer(6);
    }
}
