package com.example.homeworkrest.repositories.impl;

import com.example.homeworkrest.models.Products;
import com.example.homeworkrest.repositories.ProductsRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class ProductsRepositoryListImpl extends ProductsRepository {

    private List<Products> product;

    public ProductsRepositoryListImpl() {
        Products products = new Products("Milk",1,2023);
        Products products1 = new Products("Yogurt",2,2022);
        Products products2 = new Products("Cheese",3,2021);
        Products products3 = new Products("Salami",4,2022);
        Products products4 = new Products("Sour cream",5,2021);
        Products products5 = new Products("Ice cream",6,2023);
        this.product = Arrays.asList(products,products1,products2,products3,products4,products5);
    }
    @Override
    public List<Products> findAll() {
        return product;
    }
}

