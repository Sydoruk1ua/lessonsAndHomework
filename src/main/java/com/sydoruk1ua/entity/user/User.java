package com.sydoruk1ua.entity.user;

import java.util.Objects;

public class User {
    private final Long userId;
    private final String email;
    private final String password;
    private final UserType userType;

    public User(Long userId, String email, String password) {
        this(userId, email, password, UserType.USER);
    }

    public User(Long userId, String email, String password, UserType userType) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(userType, user.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, email, password, userType);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
