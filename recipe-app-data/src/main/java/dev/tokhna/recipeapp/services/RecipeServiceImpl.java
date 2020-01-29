package dev.tokhna.recipeapp.services;

import dev.tokhna.recipeapp.model.Recipe;
import dev.tokhna.recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> findAll() {
        log.debug("I'm in the service");
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }

    @Override
    public Recipe findById(Long aLong) {
        return null;
    }

    @Override
    public Recipe save(Recipe object) {
        return null;
    }

    @Override
    public void delete(Recipe object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
