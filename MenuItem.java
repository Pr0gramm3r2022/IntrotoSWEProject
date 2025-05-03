package com.example.jsrestaurantautomation;

public class MenuItem {
    private String category;
    private String name;

    public MenuItem(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}