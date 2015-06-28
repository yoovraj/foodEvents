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
    String[] recipeIngredient; //Ingredients used in the recipe
    String[] recipeInstructions; //A step or instruction involved in making the recipe
    Comment[] comments; //Comments, typically from users.
    String description;

    public String[] getRecipeIngredient() {
        return recipeIngredient;
    }

    public String[] getRecipeInstructions() {
        return recipeInstructions;
    }

    public Comment[] getComments() {
        return comments;
    }

    public String getDescription() {
        return description;
    }

    public void setRecipeIngredient(String[] recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
    }

    public void setRecipeInstructions(String[] recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RecipeDetails{" + "recipeIngredient=" + recipeIngredient + ", recipeInstructions=" + recipeInstructions + ", comments=" + comments + ", description=" + description + '}';
    }

}
