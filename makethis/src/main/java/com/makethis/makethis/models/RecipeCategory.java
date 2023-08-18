package com.makethis.makethis.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RecipeCategory extends AbstractEntity {

    public String categoryName;

    private final List<Recipe> recipes = new ArrayList<>();

    public RecipeCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public RecipeCategory() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;

    }



}

