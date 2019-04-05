package com.sydoruk1ua.lessons.lesson8.patterns.example2;

public class Main {
    public static void main(String[] args) {
        RegistrationForm registrationForm = new RegistrationForm("a@gmail.com", "Alex", "11",
                "11");
        User user = mapRegistrationFormToUser(registrationForm);
    }

    private static User mapRegistrationFormToUser(RegistrationForm registrationForm) {
        return User.builder()
                .withEmail(registrationForm.getEmail())
                .withName(registrationForm.getName())
                .withPassword(registrationForm.getPassword1())
                .build();
    }
}
