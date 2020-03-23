package com.sample.mainpoc.services;

import com.sample.mainpoc.model.ItemList;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface ItemService {

    public Mono<ItemList> addData(ItemList itemList);
    public Mono<ItemList> getItemListById(String id);
    public Flux<ItemList> getAllItemList();
    public Mono<ItemList> updateItemList(ItemList itemList);
    public void deleteItemList(String id);

}
