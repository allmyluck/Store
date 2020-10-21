package company.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// controller with file loading and saving in the database
//posts/login
@Controller
public class PersonPage {
    @GetMapping("/lk")
    public String PersonPage(Model model) {
        return "LkPage";
    }
}
