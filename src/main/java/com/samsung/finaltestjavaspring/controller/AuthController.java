package com.samsung.finaltestjavaspring.controller;

import com.samsung.finaltestjavaspring.repositories.models.User;
import com.samsung.finaltestjavaspring.repositories.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String Login()
    {
        return "Auth/login";
    }

    @GetMapping("/register")
    public String Register(final Model model){
        model.addAttribute("newuser", new User());
        return "Auth/register";
    }

    @PostMapping("/register")
    public String CreateAccount(@ModelAttribute User user, final Model model)
    {
        User tmpUser = userService.getUserByUserName(user.getUsername());
        if(tmpUser==null)
        {
            if(user.getPassword().equals(user.getConfirmpassword()))
            {
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                userService.createUser(user);
                return "redirect:/login";
            }
            else
            {
                model.addAttribute("error", "confirm_password_not_matched");
            }
        }
        else {
            model.addAttribute("error", "username_is_in_used");
        }

        model.addAttribute("newuser", user);
        return "Auth/register";

    }
    @GetMapping("/welcome")
    public String Welcome(Principal principal, final Model model)
    {
        String name = principal.getName();
        User user = userService.getUserByUserName(name);
        model.addAttribute("authenticatedUser", user);
        return "Auth/welcome";
    }
}
