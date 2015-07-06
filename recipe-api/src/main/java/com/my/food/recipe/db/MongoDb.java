/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.food.recipe.db;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.my.food.base.model.RecipeSummary;
import org.bson.BsonDocument;
/**
 *
 * @author yoovrajshinde
 */
public class MongoDb {
    static final MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    MongoDatabase database = null;
    
    public MongoDb() {
        database = mongoClient.getDatabase("foodEvents");
    }
    
    public void putRecipeSummary(RecipeSummary recipeSummary) {
        MongoCollection<BsonDocument> collectionRecipeSummary = database.getCollection("recipeSummary", BsonDocument.class);
        BsonDocument bsonDocument = BsonDocument.parse(recipeSummary.toJson());
        collectionRecipeSummary.insertOne(bsonDocument);
    }

    public RecipeSummary getRecipeSummary(String recipeId) {
        MongoCollection<BsonDocument> collectionRecipeSummary = database.getCollection("recipeSummary", BsonDocument.class);
        BsonDocument document = collectionRecipeSummary.find(eq("recipeId", recipeId)).first();
        return new RecipeSummary().fromJson(document.toJson());
        
    }
//    RecipeSummary getRecipeSummary(String recipeId) {
//        RecipeSummary recipeSummary = null;
//        MongoCollection<BsonDocument> collectionRecipeSummary = database.getCollection("recipeSummary", BsonDocument.class);
//        collectionRecipeSummary.find().into(new ArrayList<BsonDocument>(), 
//                new SingleResultCallback<List<BsonDocument>>() {
//
//            @Override
//            public void onResult(final List<BsonDocument> t, Throwable thrwbl) {
//                
//            }
//                    
//                });
//        return null;
//
//    } 
}
