package com.sydoruk1ua.repository.impl.list;

import com.sydoruk1ua.entity.user.User;
import com.sydoruk1ua.repository.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<User> users;

    @Override
    public User create(User user) {
        return null;
    }

    public UserRepositoryImpl(List<User> users) {
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
