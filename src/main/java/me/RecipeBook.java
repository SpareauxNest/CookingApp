package me;

import me.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeBook {
    private List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> addRecipe(Recipe recipe){
        recipes.add(recipe);
        return recipes;
    }

    public List<Recipe> deleteRecipe(String id){
        recipes.removeIf(recipe -> recipe.getId().equals(id));
        return recipes;
    }
}
