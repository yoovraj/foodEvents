/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.food.recipe.db;

import com.my.food.base.model.RecipeSummary;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author yoovrajshinde
 */
public class MongoDbTest {
    @Test
    public void testMongoConnection() {
        System.out.println("test");
        MongoDb mongoDb = new MongoDb();
        RecipeSummary recipeSummary = new RecipeSummary();
        recipeSummary.setRecipeId("3000");
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
        mongoDb.putRecipeSummary(recipeSummary);
        
        String exptectedJson = recipeSummary.toJson();
        RecipeSummary updatedRecipeSummary = mongoDb.getRecipeSummary("3000");
        String actualJson = updatedRecipeSummary.toJson();
        System.out.println(actualJson);
        Assert.assertEquals(exptectedJson, actualJson);
        
    }
    
    @Test
    public void testGetRecord() {
        MongoDb mongoDb = new MongoDb();
        RecipeSummary recipeSummary = mongoDb.getRecipeSummary("101001");
        Assert.assertEquals(null, recipeSummary);
    }
}
