package com.sample.mainpoc.components;

import com.sample.mainpoc.model.ItemList;
import com.sample.mainpoc.repository.ItemRepository;
import com.sample.mainpoc.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Mono<ItemList> addData(ItemList itemList) {
        return itemRepository.save(itemList);

    }


    @Override
    public Mono<ItemList> getItemListById(String id) {
        return itemRepository.findById(id);
    }

    @Override
    public Flux<ItemList> getAllItemList() {

        return itemRepository.findAll();
    }

    @Override
    public Mono<ItemList> updateItemList(ItemList itemList) {
        return itemRepository.save(itemList);
    }

    @Override
    public void deleteItemList(String id) {
        itemRepository.deleteById(id);
    }


}
