package com.sydoruk1ua.service.impl;

import com.sydoruk1ua.entity.Order;
import com.sydoruk1ua.repository.OrderRepository;
import com.sydoruk1ua.service.OrderService;

public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findByOrderId(Long orderId) {
        return orderRepository.findByOrderId(orderId);
    }

    @Override
    public Order findByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
