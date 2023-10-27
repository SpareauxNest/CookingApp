package me;

import me.model.Ingredient;
import me.model.Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        RecipeBook recipeBook = new RecipeBook();

        List<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(Ingredient.build("garlic", 3, "cloves"));

        ingredients.add(Ingredient.build("butter", 4, "tablespoons"));

        Recipe garlicButter = Recipe.build("Garlic Butter", ingredients,"betterbutter.com");
        Recipe butteredGarlic = Recipe.build("buttered Garlic", ingredients, "godilovegarlic.tv");
        recipeBook.addRecipe(garlicButter);
        recipeBook.addRecipe(butteredGarlic);



        List<Recipe> recipes1 = recipeBook.deleteRecipe(garlicButter.getId());
        System.out.println(recipes1.size());
        recipes1.stream().forEach(recipe -> System.out.println(recipe.getId()));
    }
}