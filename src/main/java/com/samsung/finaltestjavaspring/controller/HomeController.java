package com.samsung.finaltestjavaspring.controller;

import com.samsung.finaltestjavaspring.repositories.ProductRepository;
import com.samsung.finaltestjavaspring.repositories.models.Products;
import com.samsung.finaltestjavaspring.repositories.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserService userService;

    //Demo nen dung truc tiep product repository
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String welcome(final Model model)
    {
        List<Products> lstProducts = productRepository.getDummyProducts();
        model.addAttribute("products", lstProducts);

        return "welcome";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "welcome";
    }
}
