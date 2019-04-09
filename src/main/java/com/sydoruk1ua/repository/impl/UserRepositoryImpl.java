package com.sydoruk1ua.repository.impl;

import com.sydoruk1ua.entity.user.User;
import com.sydoruk1ua.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    private User[] users;

    public UserRepositoryImpl(User[] users) {
        this.users = users;
    }

    @Override
    public User findByEmail(String email) {
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void save(User user) {
        System.out.println("user was created in db");
    }

    @Override
    public User findByUserId(Long userId) {
        for (User user : users) {
            if (userId.equals(user.getUserId())) {
                return user;
            }
        }
        return null;
    }
}
