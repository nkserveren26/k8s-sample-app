package com.example.demo.model;

public class Recipe {
    private int id;
    private String title;
    private String description;

    public Recipe(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getter / Setter
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
}

