package com.sydoruk1ua.repository;

import com.sydoruk1ua.entity.Order;

public interface OrderRepository {
    Order findByOrderId(Long orderId);

    Order findByUserId(Long userId);
}
