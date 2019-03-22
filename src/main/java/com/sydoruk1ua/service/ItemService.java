package com.sydoruk1ua.service;

import com.sydoruk1ua.entity.Item;
import com.sydoruk1ua.repository.ItemRepository;

public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item findByItemId(Long itemId) {
        return itemRepository.findByItemId(itemId);
    }
}
