package com.sample.mainpoc.components;

import com.sample.mainpoc.model.CustomerDetails;
import com.sample.mainpoc.repository.CustomRepository;
import com.sample.mainpoc.services.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CustmServiceImpl implements CustomService {

    @Autowired
    private CustomRepository customRepository;

    @Override
    public Mono<CustomerDetails> addData(CustomerDetails CustomerDetails) {
        return customRepository.save(CustomerDetails);

    }


    @Override
    public Mono<CustomerDetails> getCustDetailsById(String id) {
        return customRepository.findById(id);
    }

    @Override
    public Flux<CustomerDetails> getAllCustDetails() {

        return  customRepository.findAll();
    }

    @Override
    public Mono<CustomerDetails> updateDetails(CustomerDetails customerDetails) {
        return customRepository.save(customerDetails);
    }

    @Override
    public void deleteCustom(String id) {
        customRepository.deleteById(id);
    }

    @Override
    public Mono<CustomerDetails> getCustByItemId(String cid) {
        return null;
    }
}
