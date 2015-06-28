/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.food.recipe.api.resource;

import com.my.food.base.model.Comment;
import com.my.food.base.model.RecipeDetails;
import com.my.food.base.model.RecipeSummary;
import com.my.food.recipe.api.response.Recipe;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yoovrajshinde
 */
@Path("recipe")
public class RecipeResource {
    
    static final Logger LOG = LoggerFactory.getLogger(RecipeResource.class);
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Recipe putRecipe(Recipe recipe) {
        return new Recipe();
    }
    
    @Path("/{recipeId}/summary")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Recipe updateRecipeSummary(
            @PathParam("recipeId") String recipeId,
            RecipeSummary recipeSummary) {
        return new Recipe();
    }

    @Path("/{recipeId}/details")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Recipe updateRecipeDetails(
            @PathParam("recipeId") String recipeId,
            RecipeDetails recipeDetails) {
        return new Recipe();
    }
    
    @Path("/{recipeId}/comments")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Recipe putRecipeComment(
            @PathParam("recipeId") String recipeId,
            Comment comment) {
        return new Recipe();
    }
    
    @Path("/{recipeId}/{commentId}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Recipe updateRecipeComment(
            @PathParam("recipeId") String recipeId,
            @PathParam("commentId") String commentId,
            Comment comment) {
        return new Recipe();
    }
    
    @Path("/{recipeId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe getRecipe(@PathParam("recipeId") String recipeId) {
        return new Recipe();
    }
    
    @Path("/{recipeId}/summary")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe getRecipeSummary(@PathParam("recipeId") String recipeId) {
        return new Recipe();
    }

    @Path("/{recipeId}/details")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe getRecipeDetails(@PathParam("recipeId") String recipeId) {
        return new Recipe();
    }
    
    @Path("/{recipeId}/comments")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe getRecipeComments(@PathParam("recipeId") String recipeId) {
        return new Recipe();
    }
    
    @Path("/{recipeId}/{commentId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe getRecipeComment(
            @PathParam("recipeId") String recipeId,
            @PathParam("commentId") String commentId) {
        return new Recipe();
    }
}
