package dev.tokhna.recipeapp.controllers;

import dev.tokhna.recipeapp.model.Category;
import dev.tokhna.recipeapp.model.UnitOfMeasure;
import dev.tokhna.recipeapp.repositories.CategoryRepository;
import dev.tokhna.recipeapp.repositories.RecipeRepository;
import dev.tokhna.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private RecipeRepository recipeRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository,
                           RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByName("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByName("Teaspoon");
        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
