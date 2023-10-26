package com.example.hellospring.services;

import com.example.hellospring.models.Product;

import java.util.List;

public interface ProductService {

    public Product createProduct(Product newProduct);

    public List<Product> getAllProduct();
}
