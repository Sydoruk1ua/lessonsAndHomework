package com.sydoruk1ua.math.example3;

public class MainRunner {
    public static void main(String[] args) {
        Repository aRepository = new ARepository();
        Repository bRepository = new BRepository();

        Service service = new Service(bRepository);

        service.print("");
    }
}
