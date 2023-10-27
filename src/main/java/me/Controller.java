package me;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {

    private RecipeBook recipeBook;

    @Autowired
    public Controller(RecipeBook recipeBook){
        this.recipeBook = recipeBook;
    }

}
