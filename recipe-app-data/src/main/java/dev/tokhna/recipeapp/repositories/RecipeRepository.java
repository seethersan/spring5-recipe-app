package dev.tokhna.recipeapp.repositories;

import dev.tokhna.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
