package com.sydoruk1ua.service;

import com.sydoruk1ua.entity.user.User;

public interface UserService {

    User findByEmail(String email);

    User findByUserId(Long userId);

    User save(User user);

    boolean login(String email, String password);
}
