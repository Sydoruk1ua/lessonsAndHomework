package com.sydoruk1ua.service;

import com.sydoruk1ua.entity.Order;
import com.sydoruk1ua.repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findByOrderId(Long orderId) {
        return orderRepository.findByOrderId(orderId);
    }

    public Order findByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
