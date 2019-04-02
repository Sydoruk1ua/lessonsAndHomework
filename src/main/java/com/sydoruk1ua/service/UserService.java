package com.sydoruk1ua.service;

import com.sydoruk1ua.entity.User;

public interface UserService {
    User findByEmail(String email);

    User findByUserId(Long userId);

    boolean login(String email, String password);
}
