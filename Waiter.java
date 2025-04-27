package com.example.jsrestaurantautomation;

import java.util.List;

public class Waiter {
    private String name;
    private String password;
    private List<Integer> assignedTables;

    public Waiter(String name, String password, List<Integer> assignedTables) {
        this.name = name;
        this.password = password;
        this.assignedTables = assignedTables;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Integer> getAssignedTables() {
        return assignedTables;
    }
}