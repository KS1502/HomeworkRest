package com.example.homeworkrest.services.impl;

import com.example.homeworkrest.models.Products;
import com.example.homeworkrest.repositories.ProductsRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;


    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;


    }

    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }



}

