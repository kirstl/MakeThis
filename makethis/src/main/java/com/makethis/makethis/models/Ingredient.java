package com.makethis.makethis.models;

import javax.persistence.Entity;

@Entity
public class Ingredient extends AbstractEntity {

    private String name;

    private Recipe recipe;


    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return  name;
    }
}
