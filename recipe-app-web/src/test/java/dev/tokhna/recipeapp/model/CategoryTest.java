package dev.tokhna.recipeapp.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {
    Category category;

    @Before
    public void setCategory(){
        category = new Category();
    }

    @Test
    public void getId() {
        long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue, (long) category.getId());
    }

    @Test
    public void getName() {
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}