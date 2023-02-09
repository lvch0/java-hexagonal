package com.lvch0.hexagonal.infrastructure.inputadapter.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.lvch0.hexagonal.domain.Customer;
import com.lvch0.hexagonal.infrastructure.inputport.CustomerInputPort;

@RestController
@RequestMapping(value = "costumer")
public class CustomerAPI {

    @Autowired
    CustomerInputPort customerInputPort;

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer create(@RequestParam String name, @RequestParam String country) {
        return customerInputPort.createCostumer(name, country);
    }

    @PostMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer get(@RequestParam String customerId) {
        return customerInputPort.getById(customerId);
    }

    @PostMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAll() {
        return customerInputPort.getAll();
    }
}
