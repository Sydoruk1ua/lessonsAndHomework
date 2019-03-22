package com.sydoruk1ua.entity;

public class User {
    private final Long userId;
    private final String email;
    private final String password;

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(Long id, String email, String password) {
        this.userId = id;
        this.email = email;
        this.password = password;
    }
}
