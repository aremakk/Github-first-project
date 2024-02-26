package com.example.Tattistom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class RegistrationController {

    @GetMapping()
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping()
    public String submitRegistrationForm(User user) {
        // Здесь можно добавить логику для сохранения пользователя в базе данных или другие действия
        return "registrationSuccess";
    }
}
