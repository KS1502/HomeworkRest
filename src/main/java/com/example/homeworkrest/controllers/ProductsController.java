package com.example.homeworkrest.controllers;

import com.example.homeworkrest.models.Products;
import com.example.homeworkrest.services.impl.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class ProductsController {

    private final ProductsService productService;

    public ProductsController(ProductsService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    @ResponseBody
    public List<Products> getAllProducts() {

        return productService.getAllProducts();
    }
}
