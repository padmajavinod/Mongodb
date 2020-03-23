package com.sample.mainpoc.controlers;

import com.sample.mainpoc.model.ItemList;
import com.sample.mainpoc.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/Item",produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemControler {

    @Autowired
    private ItemService itemService;

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(value = "/addDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ItemList> addData(@RequestBody ItemList itemList)
    {
        return itemService.addData(itemList);
    }

    @GetMapping("/getItemListById/{id}")
    public Mono<ItemList> getItemListById(@PathVariable("id") String id)
    {
        return itemService.getItemListById(id);
    }

    @GetMapping(value="/getAllItemList",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ItemList> getAllItemList()
    {

        return itemService.getAllItemList();
    }

    @PutMapping(value = "/updateItemList",consumes=MediaType.APPLICATION_JSON_VALUE)
    public Mono<ItemList> updateItemList(ItemList itemList)
    {
        return itemService.updateItemList(itemList);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value="/deleteItemList/{id}")
    public void deleteItemList(String id)
    {
        itemService.deleteItemList(id);
    }


}
