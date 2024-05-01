package com.zaid.musicstoremanagement.models;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String description;
    private double price;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Supplier supplier;
    private Long stockLevel;



}
