package dev.zymixon.e_commerce.services;

import dev.zymixon.e_commerce.exceptions.ItemNotFoundException;
import dev.zymixon.e_commerce.models.entities.ItemEntity;
import java.util.List;

public interface ItemService {

    ItemEntity getItem(Long itemId) throws ItemNotFoundException;

    List<ItemEntity> getItems();

    ItemEntity saveItem(ItemEntity item);

    void  deleteItem(Long itemId);
}
