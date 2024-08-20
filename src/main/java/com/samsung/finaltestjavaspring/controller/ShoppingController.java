package com.samsung.finaltestjavaspring.controller;

import com.google.gson.Gson;
import com.samsung.finaltestjavaspring.repositories.ProductRepository;
import com.samsung.finaltestjavaspring.repositories.models.Products;
import com.samsung.finaltestjavaspring.repositories.models.ShoppingCart;
import com.samsung.finaltestjavaspring.repositories.models.ShoppingCartItem;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShoppingController {

    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/shopping/addtocart")
    public String AddToCart(Long productId, HttpSession session)
    {
        Gson gson = new Gson();
        //Get shopping cart from session

        ShoppingCart cart=null;
        //khoi tao neu chua co
        cart = new ShoppingCart();
        Products product = productRepository.getProductById(productId);
        ShoppingCartItem cartItem = new ShoppingCartItem();
        cartItem.product = product;
        cartItem.Qty =1;
        cart.items.add(cartItem);

        return "redirect:/shopping/view";
    }

    @GetMapping("/shopping/view")
    public String ViewShopping(final Model model, HttpSession session)
    {
        Gson gson = new Gson();
        return "shoppingcart";
    }
}
