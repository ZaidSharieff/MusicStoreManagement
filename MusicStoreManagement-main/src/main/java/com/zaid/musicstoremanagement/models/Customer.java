package com.zaid.musicstoremanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customer_ID;
    String name;
    Long contact_Number;
//    @OneToMany
//    List<Purchase> purchaseHistory;

}
