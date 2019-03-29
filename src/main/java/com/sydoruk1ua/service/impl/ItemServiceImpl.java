package com.sydoruk1ua.service.impl;

import com.sydoruk1ua.entity.Item;
import com.sydoruk1ua.repository.ItemRepository;
import com.sydoruk1ua.service.ItemService;

public class ItemServiceImpl implements ItemService {
    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item findByItemId(Long itemId) {
        return itemRepository.findByItemId(itemId);
    }
}
