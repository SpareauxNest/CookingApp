package me.model;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    private Ingredient testIngredient;

    @Mock
    private Recipe recipe ;

    @Before
    public void setUp() {

        testIngredient = new Ingredient("garlic", 3, "cloves");
    }

    @Test
    public void addIngredientTest() {
        Ingredient result = recipe.addIngredient("garlic", 3, "cloves");
        assertEquals(result, testIngredient);


    }
}