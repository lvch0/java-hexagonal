package com.lvch0.hexagonal.infrastructure.inputadapter.http;

import java.math.BigDecimal;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lvch0.hexagonal.domain.Orders;
import com.lvch0.hexagonal.infrastructure.inputport.OrderInputPort;

@RestController
@RequestMapping("order")
public class OrderAPI {

    @Autowired
    OrderInputPort orderInputPort;

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Orders create(@RequestParam String customerId, @RequestParam BigDecimal total) {
        return orderInputPort.createOrder(customerId, total);
    }
}
