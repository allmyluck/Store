package company.store.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexPage {
    @GetMapping("/")
    public String PostsPage(Model model) {
        return "IndexPage";
    }
}
