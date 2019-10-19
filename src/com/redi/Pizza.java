package com.redi;

import java.util.Collection;
import java.util.Set;

public class Pizza {
    //it's better to define parameter of th class as private
    private String name;
    private Set<String> ingredients;
    private double price;
    private String description;


    public Pizza(String name, Set<String> ingredients, double price, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.description = description;
    }


    public String getName() {
        return name;
    }
    // we can use set instead of collection here but collection is more general and we can for example later use a list instead
    public Collection<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String printIngredients(){
        return name+" "+ingredients+" "+price+" Euro  "+description;
    }
}
