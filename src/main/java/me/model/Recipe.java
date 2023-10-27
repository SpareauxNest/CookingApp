package me.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Component
public class Recipe {

    private String id;

    private String name;

    private List<Ingredient> ingredients;

    private String link;

    public Recipe(String name, List<Ingredient> ingredients, String link) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.ingredients = ingredients;
        this.link = link;
    }

    public static Recipe build(String name, List<Ingredient> ingredients, String link){
        return new Recipe(name, ingredients, link);
    }
}