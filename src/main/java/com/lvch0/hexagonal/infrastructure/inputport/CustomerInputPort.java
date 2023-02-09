package com.lvch0.hexagonal.infrastructure.inputport;

import java.util.List;

import com.lvch0.hexagonal.domain.Customer;

public interface CustomerInputPort {
    
    public Customer createCostumer(String name, String country);
    
    public Customer getById(String custumerId);

    public List<Customer> getAll();
}
