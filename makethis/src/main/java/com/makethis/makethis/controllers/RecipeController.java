package com.makethis.makethis.controllers;

import com.makethis.makethis.data.RecipeCategoryRepository;
import com.makethis.makethis.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private RecipeCategoryRepository recipeCategoryRepository;



    @GetMapping
    public String showAllRecipes(){
        return "recipe";
    }


}
