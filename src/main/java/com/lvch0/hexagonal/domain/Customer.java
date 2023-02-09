package com.lvch0.hexagonal.domain;

import lombok.*;

@Builder
@Data
public class Customer {
    private Integer id;
    private String name;
    private String country;    
}
