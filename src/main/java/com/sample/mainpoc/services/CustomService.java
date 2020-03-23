package com.sample.mainpoc.services;

import com.sample.mainpoc.model.CustomerDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface CustomService {

    public Mono<CustomerDetails> addData(CustomerDetails customerDetails);
    public Mono<CustomerDetails> getCustDetailsById(String id);
    public Flux<CustomerDetails> getAllCustDetails();
    public Mono<CustomerDetails> updateDetails(CustomerDetails customerDetails);
    public void deleteCustom(String id);
    public Mono<CustomerDetails> getCustByItemId(String cid);

}
