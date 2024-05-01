package com.zaid.musicstoremanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Purchase_History {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

}
