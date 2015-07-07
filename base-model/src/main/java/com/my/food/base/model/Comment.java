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
public class Comment {
    String recipeId; // primary key
    String commentId;
    String comment;
    Long commentTime;

    public String getRecipeId() {
        return recipeId;
    }
    public String getCommentId() {
        return commentId;
    }

    public String getComment() {
        return comment;
    }

    public Long getCommentTime() {
        return commentTime;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCommentTime(Long commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        return "Comment{" + "recipeId=" + recipeId + ", commentId=" + commentId + ", comment=" + comment + ", commentTime=" + commentTime + '}';
    }

}
