/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.food.recipe.api.application;

import com.my.food.recipe.api.resource.RecipeResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author yoovrajshinde
 */
@ApplicationPath("resources")
public class RecipeApiApplication extends Application{
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<>();
        s.add(RecipeResource.class);
        return s;
    }
}
