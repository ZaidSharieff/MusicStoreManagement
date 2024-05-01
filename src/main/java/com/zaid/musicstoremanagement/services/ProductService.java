package com.zaid.musicstoremanagement.services;

import com.zaid.musicstoremanagement.exceptions.CategoryNotFoundException;
import com.zaid.musicstoremanagement.exceptions.ProductNotFoundException;
import com.zaid.musicstoremanagement.exceptions.SupplierNotFoundException;
import com.zaid.musicstoremanagement.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(Long id) throws CategoryNotFoundException;
    Product addProduct(Product product) throws CategoryNotFoundException, SupplierNotFoundException;
    Product updateProduct(Product product) throws ProductNotFoundException;
    void deleteProduct(Long id) throws ProductNotFoundException;
    List<Product> sortProductsByPrice() throws ProductNotFoundException;

}
