package com.sydoruk1ua.lessons.lesson8.patterns.example2;

public class RegistrationForm {
    private String email;
    private String name;

    private String password1;
    private String password2;

    public RegistrationForm(String email, String name, String password1, String password2) {
        this.email = email;
        this.name = name;
        this.password1 = password1;
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }
}
