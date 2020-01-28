package dev.tokhna.recipeapp.controllers;

import dev.tokhna.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.findAll());
        return "index";
    }
}
