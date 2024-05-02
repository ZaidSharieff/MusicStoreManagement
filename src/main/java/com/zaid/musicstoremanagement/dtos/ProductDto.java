package com.zaid.musicstoremanagement.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long stock;
    private Long categoryId;
    private Long supplierId;
}

