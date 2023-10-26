package com.example.hellospring.services;


import com.example.hellospring.models.Product;
import com.example.hellospring.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Declare dia sebagai service
@RequiredArgsConstructor// Automitically create constructor and Inject Dependency // Lombok Automitically create constructor for us
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;

    //Create

    public Product createProduct(Product newProduct){
        return productRepository.save(newProduct);
    }

    //Read
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }


    //Read by Id



    //Update



    //Delete


}
