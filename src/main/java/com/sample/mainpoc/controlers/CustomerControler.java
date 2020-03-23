package com.sample.mainpoc.controlers;

import com.sample.mainpoc.model.CustomerDetails;
import com.sample.mainpoc.services.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/Rest",produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerControler {

    @Autowired
    private CustomService customService;

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(value = "/addDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CustomerDetails> addData(@RequestBody CustomerDetails customerDetails)
    {
       return customService.addData(customerDetails);
    }

    @GetMapping("/getCustom/{id}")
    public Mono<CustomerDetails> getCustDetailsById(@PathVariable("id") String id)
    {
        return customService.getCustDetailsById(id);
    }

    @GetMapping(value="/getAllCustomDetails",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<CustomerDetails> getAllCustDetails()
    {

        return  customService.getAllCustDetails();
    }

    @PutMapping(value = "/updateDetails",consumes=MediaType.APPLICATION_JSON_VALUE)
    public Mono<CustomerDetails> updateDetails(CustomerDetails customerDetails)
    {
        return customService.updateDetails(customerDetails);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value="/deleteCustom/{id}")
    public void deleteCustom(String id)
    {
        customService.deleteCustom(id);
    }
}
