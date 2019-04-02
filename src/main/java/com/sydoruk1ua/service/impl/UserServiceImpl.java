package com.sydoruk1ua.service.impl;

import com.sydoruk1ua.entity.User;
import com.sydoruk1ua.repository.UserRepository;
import com.sydoruk1ua.service.UserService;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findByUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email);

        return user != null && user.getPassword().equals(password);
    }
}
