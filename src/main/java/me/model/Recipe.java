package me.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;

    private List<Ingredient> ingredients;

    private String link;

    public Recipe(String name, List<Ingredient> ingredients, String link) {
        this.name = name;
        this.ingredients = ingredients;
        this.link = link;
    }

    public static Recipe build(String name, List<Ingredient> ingredients, String link){
        return new Recipe(name, ingredients, link);
    }
}