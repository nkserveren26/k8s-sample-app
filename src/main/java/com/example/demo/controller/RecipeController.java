package com.example.demo.controller;

import com.example.demo.model.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RecipeController {

    @GetMapping("/recipe")
    public Recipe getRecipe() {
        return new Recipe(1, "Potato Cheese Oyaki", "Mashed potato pancake with melted cheese inside.");
    }
}

