package com.samsung.finaltestjavaspring.controller;


import ch.qos.logback.core.model.Model;
import com.samsung.finaltestjavaspring.repositories.services.CatalogService;
import com.samsung.finaltestjavaspring.repositories.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ViewProduct(final Model model){
        return "SelectedCatalog";
    }

    // Các endpoint khác
}