package com.lvch0.hexagonal.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvch0.hexagonal.domain.Orders;
import com.lvch0.hexagonal.infrastructure.inputport.OrderInputPort;
import com.lvch0.hexagonal.infrastructure.outputport.EntityRepository;

@Component
public class OrderUseCase implements OrderInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders order = Orders.builder()
                .id(UUID.randomUUID().toString())
                .customerId(customerId)
                .total(total)
                .build();

        return entityRepository.save(order);
    }
}
