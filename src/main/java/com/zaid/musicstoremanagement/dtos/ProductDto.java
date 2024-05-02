package com.zaid.musicstoremanagement.dtos;

//import com.zaid.musicstoremanagement.models.Popularity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDto {
    private String name;
    private String description;
    private Double price;
    private String category;
    private String supplier;
    private Long stockLevel;


}


