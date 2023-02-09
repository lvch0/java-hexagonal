package com.lvch0.hexagonal.infrastructure.inputport;

import java.math.BigDecimal;

import com.lvch0.hexagonal.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder(String costumerId, BigDecimal total);
}
