package com.sydoruk1ua.service.impl;

import com.sydoruk1ua.entity.user.User;
import com.sydoruk1ua.exception.EmaiNotValidException;
import com.sydoruk1ua.repository.UserRepository;
import com.sydoruk1ua.service.UserService;
import com.sydoruk1ua.util.Validator;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepositoryImpl) {
        this.userRepository = userRepositoryImpl;
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
    public User save(User user) {
        if (user != null) {
            userRepository.save(user);
            //  userRepository.save(user); //todo: don't forget to comment or delete it
        }
        return user;
    }

    @Override
    public boolean login(String email, String password) {

        User user = userRepository.findByEmail(email);

        return user != null && user.getPassword().equals(password);
    }

    @Override
    public User create(User user) {
        if (!Validator.isEmailValid(user.getEmail())) {
            throw new EmaiNotValidException();
        }

        return userRepository.create(user);
    }
}
