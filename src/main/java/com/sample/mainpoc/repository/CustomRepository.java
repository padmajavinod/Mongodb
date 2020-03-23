package com.sample.mainpoc.repository;

import com.sample.mainpoc.model.CustomerDetails;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CustomRepository extends ReactiveMongoRepository<CustomerDetails,String> {

    Flux<CustomerDetails> findAllByName(String name);

    Mono<CustomerDetails> findFirstByphoneNum(String phoneNum);




}
