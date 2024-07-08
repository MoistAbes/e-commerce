package dev.zymixon.e_commerce.services.impl;

import dev.zymixon.e_commerce.exceptions.ItemNotFoundException;
import dev.zymixon.e_commerce.models.entities.ItemEntity;
import dev.zymixon.e_commerce.repositories.ItemRepository;
import dev.zymixon.e_commerce.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ItemEntity getItem(Long itemId) throws ItemNotFoundException {

        Optional<ItemEntity> item = itemRepository.findById(itemId);

        if (item.isPresent())
            return item.get();
        else
            throw new ItemNotFoundException();
    }

    @Override
    public List<ItemEntity> getItems() {
        return itemRepository.findAll();
    }

    @Override
    public ItemEntity saveItem(ItemEntity item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
