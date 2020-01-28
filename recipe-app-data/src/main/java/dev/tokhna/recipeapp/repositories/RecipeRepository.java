package dev.tokhna.recipeapp.repositories;

import dev.tokhna.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Recipe> findByName(String name);
}
