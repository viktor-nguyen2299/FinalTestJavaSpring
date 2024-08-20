package com.samsung.finaltestjavaspring.repositories.services;



import com.samsung.finaltestjavaspring.repositories.CatalogRepository;
import com.samsung.finaltestjavaspring.repositories.ProductRepository;
import com.samsung.finaltestjavaspring.repositories.models.Catalog;
import com.samsung.finaltestjavaspring.repositories.models.Products;
import com.samsung.finaltestjavaspring.repositories.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// ProductService.java
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CatalogRepository catalogRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Products> searchProducts(String name) {
        return productRepository.findByNameContaining(name);
    }

    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }

    public List<Catalog> getProductsByCatalog(Long catalogId) {
        return catalogRepository.findAll();
    }
}
