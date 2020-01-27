package dev.tokhna.recipeapp.repositories;

import dev.tokhna.recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
