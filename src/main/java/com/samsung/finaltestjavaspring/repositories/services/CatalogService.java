package com.samsung.finaltestjavaspring.repositories.services;

import com.samsung.finaltestjavaspring.repositories.CatalogRepository;
import com.samsung.finaltestjavaspring.repositories.models.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }

    public Catalog getCatalogById(Long id) {
        return catalogRepository.findById(id).orElse(null);
    }
}
