package com.samsung.finaltestjavaspring.repositories.services;

import com.samsung.finaltestjavaspring.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.catalog.Catalog;
import java.util.List;

@Service
public class CatalogService implements ICatalogService {
    @Autowired
    private CatalogRepository catalogRepository;


    @Override
    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
