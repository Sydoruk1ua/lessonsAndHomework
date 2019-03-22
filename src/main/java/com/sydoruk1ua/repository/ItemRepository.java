package com.sydoruk1ua.repository;

import com.sydoruk1ua.entity.Item;

public class ItemRepository {
    private Item[] items;

    public ItemRepository( Item [] items) {
        this.items = items;
    }

    //TODO: CRUD

    public Item findByItemId(Long itemId) {
        for (Item item : items) {
            if (itemId.equals(item.getItemId())) {
                return item;
            }
        }
        return null;
    }
}
