package com.example.hellospring.controllers;

import com.example.hellospring.models.Product;
import com.example.hellospring.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Ini adalah API!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
@RequestMapping("/products") //Ini adalah URL BRO
@RequiredArgsConstructor // Ini adalah automitically crreate controller for me
public class ProductController {

    final ProductService productService;

    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
}
