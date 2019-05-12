package com.sydoruk1ua.repository;

import com.sydoruk1ua.entity.user.User;

public interface UserRepository {
    User findByEmail(String email);

    default User create(User user) {
        throw new UnsupportedOperationException();
    }

    void save(User user);

    User findByUserId(Long userId);
}
