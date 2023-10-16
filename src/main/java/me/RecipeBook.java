package me;

import me.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    private List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> addRecipe(Recipe recipe){
        recipes.add(recipe);
        return recipes;
    }
}
