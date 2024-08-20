package com.samsung.finaltestjavaspring.repositories.services;

import com.samsung.finaltestjavaspring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.catalog.Catalog;
import java.util.List;

public class ProductService extends IProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Products> getAllProducts() {
        return ProductRepository.findAll();
    }
}
