package com.shonen.ukr.testformyapp;

public class Dish {
    private String dishName;
    private double dishWeight;
    private double calories;
    private double totalCalories;

    public Dish(String dishName, double dishWeight, double calories) {
        this.dishName = dishName;
        this.dishWeight = dishWeight;
        this.calories = calories;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishWeight() {
        return dishWeight;
    }

    public void setDishWeight(double dishWeight) {
        this.dishWeight = dishWeight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getTotalCalories() {
        totalCalories= (dishWeight*calories)/100;
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
}
