package me.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;

    private List<Ingredient> ingredients;

    private String link;

    public Recipe(String name, String link, List<Ingredient> ingredients) {
        this.name = name;
        this.link = link;
        this.ingredients = ingredients;
    }

    public Ingredient addIngredient(String name, int quantity, String unit) {
        return new Ingredient(name, quantity, unit);

    }
}