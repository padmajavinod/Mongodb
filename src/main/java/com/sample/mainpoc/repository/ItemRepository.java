package com.sample.mainpoc.repository;

import com.sample.mainpoc.model.CustomerDetails;
import com.sample.mainpoc.model.ItemList;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ItemRepository extends ReactiveMongoRepository<ItemList,String> {



}
