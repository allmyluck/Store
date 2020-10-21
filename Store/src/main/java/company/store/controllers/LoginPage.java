package company.store.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginPage {
    @GetMapping("/login")
    public String LoginPage(Model model) {
        return "LoginPage";
    }
}
