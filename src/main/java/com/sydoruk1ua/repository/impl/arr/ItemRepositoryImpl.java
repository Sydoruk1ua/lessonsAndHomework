package com.sydoruk1ua.repository.impl.arr;

import com.sydoruk1ua.entity.Item;
import com.sydoruk1ua.repository.ItemRepository;

public class ItemRepositoryImpl implements ItemRepository {
    private Item[] items;

    public ItemRepositoryImpl(Item[] items) {
        this.items = items;
    }

    //TODO: CRUD

    @Override
    public Item findByItemId(Long itemId) {
        for (Item item : items) {
            if (itemId.equals(item.getItemId())) {
                return item;
            }
        }
        return null;
    }
}
