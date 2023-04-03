package de.ait.simple.controllers;

import de.ait.simple.models.User;
import de.ait.simple.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUpUser(User user) {
        usersRepository.save(user);
        return "signUp";
    }

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }
}
