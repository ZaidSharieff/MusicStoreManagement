package com.zaid.musicstoremanagement.services;

import com.zaid.musicstoremanagement.models.Product;

public interface ProductServiceInterface {
    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
    Product getProduct(Long id);
}
