/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.food.recipe.api.response;

import com.my.food.base.model.Comment;
import com.my.food.base.model.RecipeDetails;
import com.my.food.base.model.RecipeSummary;

/**
 *
 * @author yoovrajshinde
 */
public class Recipe {
    RecipeSummary recipeSummary;
    RecipeDetails recipeDetails;
    Comment[] comments;

    public RecipeSummary getRecipeSummary() {
        return recipeSummary;
    }

    public RecipeDetails getRecipeDetails() {
        return recipeDetails;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setRecipeSummary(RecipeSummary recipeSummary) {
        this.recipeSummary = recipeSummary;
    }

    public void setRecipeDetails(RecipeDetails recipeDetails) {
        this.recipeDetails = recipeDetails;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Recipe{" + "recipeSummary=" + recipeSummary + ", recipeDetails=" + recipeDetails + ", comments=" + comments + '}';
    }
    
}
