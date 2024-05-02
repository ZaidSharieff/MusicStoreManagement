package com.zaid.musicstoremanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long stock;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Supplier supplier;
    @OneToMany(mappedBy = "product")
    private List<Transaction> transactions;
}
