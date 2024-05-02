package com.zaid.musicstoremanagement.controllers;

import com.zaid.musicstoremanagement.dtos.ProductDto;
import com.zaid.musicstoremanagement.models.Product;
import com.zaid.musicstoremanagement.services.ProductServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private ProductServiceInterface productService;
    @PostMapping
    ProductDto createProduct(@RequestBody Product product) {
        Product product1 = productService.createProduct(product);
        return convertToDTO(product1);
    }

    @PutMapping
    ProductDto updateProduct(@RequestBody Product product) {
        Product product1 = productService.updateProduct(product);
        return convertToDTO(product1);
    }

    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    ProductDto getProduct(@PathVariable("id") Long id) {
        Product product = productService.getProduct(id);
        return convertToDTO(product);
    }

    private ProductDto convertToDTO(Product product) {
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setStock(product.getStock());
        dto.setCategoryId(product.getCategory().getId());
        dto.setSupplierId(product.getSupplier().getId());

        return dto;
    }
}