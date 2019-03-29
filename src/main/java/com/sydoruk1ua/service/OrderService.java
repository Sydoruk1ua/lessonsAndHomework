package com.sydoruk1ua.service;

import com.sydoruk1ua.entity.Order;

public interface OrderService {
    Order findByOrderId(Long orderId);

    Order findByUserId(Long userId);
}
