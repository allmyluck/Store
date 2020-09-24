package company.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {

    @GetMapping("/posts")
    public String PostsPage(Model model) {
        return "PostsPage";
    }
}
