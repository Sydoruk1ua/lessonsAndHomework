package com.sydoruk1ua.lessons.lesson11.example1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .withName("Name")
                .build();

        Admin admin = new Admin.AdminBuilder()
                .withPassword(1)
                .withName("Name")
                .build();
    }
}
