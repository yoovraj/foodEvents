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
import com.my.food.recipe.db.MongoDb;
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

    @Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe test() {
        Recipe recipe = new Recipe();
        RecipeSummary recipeSummary = new RecipeSummary();
        recipeSummary.setRecipeId("1000");
        recipeSummary.setCookTime(100);
        recipeSummary.setCookingMethod(101);
        recipeSummary.setNutrition("wheat");
        recipeSummary.setPrepTime(10000l);
        recipeSummary.setRecipeCategory("Lunch");
        recipeSummary.setRecipeCuisine("Indian");
        recipeSummary.setRecipeYield(10);
        recipeSummary.setCommentCount(50);
        recipeSummary.setPerson("Test");
        recipeSummary.setDateCreated(System.currentTimeMillis() / 1000);
        recipeSummary.setDateModified(System.currentTimeMillis() / 1000);
        recipeSummary.setImageUrl("image");
        recipeSummary.setVideoUrl("video");

        recipe.setRecipeSummary(recipeSummary);

        RecipeDetails recipeDetails = new RecipeDetails();
        recipeDetails.setRecipeId("1000");
        recipeDetails.setRecipeIngredient(new String[]{"item1", "item2"});
        recipeDetails.setRecipeInstructions(new String[]{"step1", "step2"});
        recipeDetails.setDescription("Description");
        
        recipe.setRecipeDetails(recipeDetails);
        
        Comment comment1 = new Comment();
        comment1.setRecipeId("1000");
        comment1.setCommentId("1");
        comment1.setComment("Comment 1 ");
        comment1.setCommentTime(System.currentTimeMillis()/1000);
        
        Comment comment2 = new Comment();
        comment2.setRecipeId("1000");
        comment2.setCommentId("2");
        comment2.setComment("Comment 2 ");
        comment2.setCommentTime(System.currentTimeMillis()/1000);
        
        recipe.setComments(new Comment[] {comment1, comment2});
        return recipe;
    }

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
        long start = System.currentTimeMillis();
        LOG.info("recipeId={}, recipeSummary={}", recipeId, recipeSummary.toString());
        recipeSummary.setRecipeId(recipeId);
        MongoDb dbConnection = new MongoDb();
        dbConnection.putRecipeSummary(recipeSummary);
        RecipeSummary updatedSummary = dbConnection.getRecipeSummary(recipeId);

        Recipe recipe = new Recipe();
        recipe.setRecipeSummary(updatedSummary);
        LOG.info("POST /" + recipeId + "/summary : " + (System.currentTimeMillis() - start) + " ms");
        return recipe;
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
        long start = System.currentTimeMillis();
        LOG.info("recipeId={} ", recipeId);
        RecipeSummary recipeSummary = new MongoDb().getRecipeSummary(recipeId);
        Recipe recipe = new Recipe();
        recipe.setRecipeSummary(recipeSummary);
        LOG.info("GET /" + recipeId + "/summary : " + (System.currentTimeMillis() - start) + " ms");
        return recipe;
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
