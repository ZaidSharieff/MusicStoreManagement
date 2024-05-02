package com.zaid.musicstoremanagement.models;

import java.util.List;

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
    private Long id;
    private String name;
    private String description;
    private double price;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Supplier supplier;
    private Long stockLevel;
    @OneToMany(mappedBy = "product")
    private List<Transaction> transactions;


}
