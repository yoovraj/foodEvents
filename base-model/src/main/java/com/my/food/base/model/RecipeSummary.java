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
public class RecipeSummary {
    // primary key
    String recipeId;
    
    Integer cookTime; //cooking time in seconds
    Integer cookingMethod; //The method of cooking, such as Frying, Steaming, ...
    String nutrition; //Nutrition information about the recipe.
    Long prepTime; // preparation time in seconds
    String recipeCategory; //The category of the recipe—for example, appetizer, entree, etc.
    String recipeCuisine; //The cuisine of the recipe (for example, French or Ethiopian).
    Integer recipeYield; //The quantity produced by the recipe (for example, number of people served, number of servings, etc).
    Integer commentCount; //The number of comments
    
    //TODO (replace text data bt personal   S
    String person;
    Long dateCreated;
    Long dateModified;
    String imageUrl;
    String videUrl;

    public String getRecipeId() {
        return recipeId;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public Integer getCookingMethod() {
        return cookingMethod;
    }

    public String getNutrition() {
        return nutrition;
    }

    public Long getPrepTime() {
        return prepTime;
    }

    public String getRecipeCategory() {
        return recipeCategory;
    }

    public String getRecipeCuisine() {
        return recipeCuisine;
    }

    public Integer getRecipeYield() {
        return recipeYield;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public String getPerson() {
        return person;
    }

    public Long getDateCreated() {
        return dateCreated;
    }

    public Long getDateModified() {
        return dateModified;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideUrl() {
        return videUrl;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public void setCookingMethod(Integer cookingMethod) {
        this.cookingMethod = cookingMethod;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public void setPrepTime(Long prepTime) {
        this.prepTime = prepTime;
    }

    public void setRecipeCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    public void setRecipeCuisine(String recipeCuisine) {
        this.recipeCuisine = recipeCuisine;
    }

    public void setRecipeYield(Integer recipeYield) {
        this.recipeYield = recipeYield;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public void setDateCreated(Long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateModified(Long dateModified) {
        this.dateModified = dateModified;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setVideUrl(String videUrl) {
        this.videUrl = videUrl;
    }

    @Override
    public String toString() {
        return "RecipeSummary{" + "recipeId=" + recipeId + ", cookTime=" + cookTime + ", cookingMethod=" + cookingMethod + ", nutrition=" + nutrition + ", prepTime=" + prepTime + ", recipeCategory=" + recipeCategory + ", recipeCuisine=" + recipeCuisine + ", recipeYield=" + recipeYield + ", commentCount=" + commentCount + ", person=" + person + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", imageUrl=" + imageUrl + ", videUrl=" + videUrl + '}';
    } 
}
