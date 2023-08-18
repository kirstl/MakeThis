package com.makethis.makethis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recipe")
public class RecipeController {

    @GetMapping
    public String showAllRecipes(){
        return "recipe";
    }


}
