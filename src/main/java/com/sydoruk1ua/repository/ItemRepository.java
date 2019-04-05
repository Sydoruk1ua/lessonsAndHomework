package com.sydoruk1ua.repository;

import com.sydoruk1ua.entity.Item;

public interface ItemRepository {
    Item findByItemId(Long itemId);
}
