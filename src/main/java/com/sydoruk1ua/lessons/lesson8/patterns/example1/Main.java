package com.sydoruk1ua.lessons.lesson8.patterns.example1;

public class Main {
    public static void main(String[] args) {
       /* User user = new User.Builder()
                .withEmail("a@gmail.com")
                .withName("Alex")
                .withEmail("alex@gmail.com")
                .build();*/

//        User user2 = new User("Alex", null, "Alex@gmail.com",
//                null, null);

        User user3 = User.builder()
                .withNickname("a")
                .withName("Alex")
                .withEmail("alex@gmail.com")
                .build();

        User user4 = new User.Builder("exampl@gmail.com", "password")
                .withName("Bob")
                .build();
    }
}
