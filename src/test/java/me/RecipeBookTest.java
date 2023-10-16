package me;

import me.model.Ingredient;
import me.model.Recipe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class RecipeBookTest {
    private Ingredient testIngredient1;
    private Ingredient testIngredient2;
    private List<Ingredient> ingredients;
    private Recipe testRecipe1;
    private Recipe testRecipe2;
    private List<Recipe> testRecipes;

    private RecipeBook recipeBook;
    @BeforeAll
    public void setUp(){
        testIngredient1 = Ingredient.build("garlic", 3, "cloves");
        testIngredient2 = Ingredient.build("butter", 4, "Tablespoons");
        ingredients.add(testIngredient1);
        ingredients.add(testIngredient2);
        testRecipe1 = Recipe.build("Garlic Butter", ingredients, "betterbutter.com");
        testRecipes.add(testRecipe1);
        testRecipe2 = Recipe.build("Buttered Garlic", ingredients, "badbreath.com");
        testRecipes.add(testRecipe2);
    }
    @Test
    public void createRecipeTest(){
        recipeBook.addRecipe(testRecipe1);
        List<Recipe> actual = recipeBook.addRecipe(testRecipe2);
        Assertions.assertEquals(actual, testRecipes);
    }
}