package me.model;

public class Ingredient {
    private String name;

    private int quantity;

    private String unit;

    public Ingredient(String name, int quantity, String unit){
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }

    public static Ingredient build(String name, int quantity, String unit){
        return new Ingredient(name, quantity, unit);
    }
}
