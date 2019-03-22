package com.sydoruk1ua.repository;

import com.sydoruk1ua.entity.User;

public class UserRepository {
    private User[] users;

    public UserRepository(User [] users) {
        this.users = users;
    }

    public User findByEmail(String email) {
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                return user;
            }
        }
        return null;
    }

    public User findByUserId(Long userId) {
        for (User user : users) {
            if (userId.equals(user.getUserId())) {
                return user;
            }
        }
        return null;
    }
}
