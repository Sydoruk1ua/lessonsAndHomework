package com.sydoruk1ua.entity;

import com.sydoruk1ua.entity.user.User;

public class Order {
    private final Long orderId;
    private final Item items;
    private final User user;

    public Order(Long orderId, Item goods, User user) {
        this.orderId = orderId;
        this.items = goods;
        this.user = user;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Item getItem() {
        return items;
    }

    public User getUser() {
        return user;
    }
}
