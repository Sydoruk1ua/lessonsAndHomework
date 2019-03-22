package com.sydoruk1ua.service;

import com.sydoruk1ua.entity.User;
import com.sydoruk1ua.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findByUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }

    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }
}
