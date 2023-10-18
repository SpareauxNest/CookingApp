package me.model;

import java.util.List;
import java.util.UUID;

public class Recipe {
    private UUID id;

    private String name;

    public UUID getId() {
        return id;
    }

    private List<Ingredient> ingredients;

    private String link;

    public Recipe(String name, List<Ingredient> ingredients, String link) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.ingredients = ingredients;
        this.link = link;
    }

    public static Recipe build(String name, List<Ingredient> ingredients, String link){
        return new Recipe(name, ingredients, link);
    }
}