/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.food.base.model;

/**
 *
 * @author yoovrajshinde
 */
public class RecipeDetails {
    String recipeId; // primary key
    String[] recipeIngredient; //Ingredients used in the recipe
    String[] recipeInstructions; //A step or instruction involved in making the recipe
    String description;

    public String getRecipeId() {
        return recipeId;
    }

    public String[] getRecipeIngredient() {
        return recipeIngredient;
    }

    public String[] getRecipeInstructions() {
        return recipeInstructions;
    }

    public String getDescription() {
        return description;
    }
    
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public void setRecipeIngredient(String[] recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
    }

    public void setRecipeInstructions(String[] recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RecipeDetails{" + "recipeId=" + recipeId + ", recipeIngredient=" + recipeIngredient + ", recipeInstructions=" + recipeInstructions + ", description=" + description + '}';
    }

}
