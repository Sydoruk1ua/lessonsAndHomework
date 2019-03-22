package com.sydoruk1ua.entity;

public class Item {
    private final Long itemId;
    private final String name;
    private final Integer price;

    public Item(Long itemId, String name, Integer price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
