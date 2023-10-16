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

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
