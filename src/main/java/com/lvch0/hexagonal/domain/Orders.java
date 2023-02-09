package com.lvch0.hexagonal.domain;

import java.math.BigDecimal;

import lombok.*;

@Builder
@Data
public class Orders {
    private String id;
    private String customerId;
    private BigDecimal total;
}
