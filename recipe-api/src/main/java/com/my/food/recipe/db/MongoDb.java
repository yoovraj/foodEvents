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
import com.mongodb.client.model.UpdateOptions;
import com.my.food.base.model.RecipeSummary;
import org.bson.BsonDocument;
import org.bson.BsonString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yoovrajshinde
 */
public class MongoDb {

    static final Logger LOG = LoggerFactory.getLogger(MongoDb.class);

    static final MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase database = null;

    public MongoDb() {
        LOG.info("getting database");
        database = mongoClient.getDatabase("foodEvents");
    }

    public void putRecipeSummary(RecipeSummary recipeSummary) {
        MongoCollection<BsonDocument> collectionRecipeSummary = database.getCollection("recipeSummary", BsonDocument.class);
        BsonDocument bsonDocument = BsonDocument.parse(recipeSummary.toJson());
        bsonDocument.put("_id", new BsonString(recipeSummary.getRecipeId()));
        LOG.info("put bsonDocument = {}", bsonDocument.toString());

        collectionRecipeSummary.replaceOne(eq("_id", recipeSummary.getRecipeId()), bsonDocument, new UpdateOptions().upsert(true));
//        collectionRecipeSummary.insertOne(bsonDocument);
    }

    public RecipeSummary getRecipeSummary(String recipeId) {
        MongoCollection<BsonDocument> collectionRecipeSummary = database.getCollection("recipeSummary", BsonDocument.class);
        BsonDocument document = collectionRecipeSummary.find(eq("_id", recipeId)).first();
        if (document != null) {
            LOG.info("get document = {}", document.toString());
            return new RecipeSummary().fromJson(document.toJson());
        } else {
            LOG.info("Null Document for recipeId={}", recipeId);
            return null;
        }

    }
}
