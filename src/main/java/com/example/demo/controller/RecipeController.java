package com.example.demo.controller;

import com.example.demo.model.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class RecipeController {

    @GetMapping("/recipe")
    public List<Recipe> getRecipe() {
        return List.of(
                new Recipe(1, "じゃがいもチーズおやき", "じゃがいも・チーズ・片栗粉で作る簡単おやき"),
                new Recipe(2, "鶏むね肉の照り焼き", "甘辛いタレがご飯に合う定番レシピ"),
                new Recipe(3, "豆腐ハンバーグ", "豆腐と鶏ひき肉でヘルシーに仕上げたハンバーグ")
        );
    }
}

