package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class object {
    @SerializedName("error")
    public  int error;
    @SerializedName("iscomment")
    public  int iscomment;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getIscomment() {
        return iscomment;
    }

    public void setIscomment(int iscomment) {
        this.iscomment = iscomment;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public List<DATA> getData() {
        return data;
    }

    public void setData(List<DATA> data) {
        this.data = data;
    }

    @SerializedName("errorDescription")
    public  String errorDescription;
    @SerializedName("data")
    public List<DATA> data = null;

    public class DATA {
        @SerializedName("total")
        public  int total;
        @SerializedName("totalitem")
        public  int totalitem;
        @SerializedName("items")
        public List<ITEM> items = null;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getTotalitem() {
            return totalitem;
        }

        public void setTotalitem(int totalitem) {
            this.totalitem = totalitem;
        }

        public List<ITEM> getItems() {
            return items;
        }

        public void setItems(List<ITEM> items) {
            this.items = items;
        }
    }
    public class ITEM {
        @SerializedName("comment_id")
        public  float commentId;
        @SerializedName("parent_id")
        public  float parentId;
        @SerializedName("article_id")
        public  float articleId;
        @SerializedName("content")
        public  String content;
        @SerializedName("full_name")
        public  float fullName;
        @SerializedName("creation_time")
        public  String creationTime;
        @SerializedName("time")
        public  String time;
        @SerializedName("userlike")
        public  int userLike;
        @SerializedName("replys")
        public List<Replys> replys = null;
        @SerializedName("userid")
        public  float userId;
        @SerializedName("type")
        public  int Type;
        @SerializedName("like_ismember")
        public  boolean likeIsmember;

        public float getCommentId() {
            return commentId;
        }

        public void setCommentId(float commentId) {
            this.commentId = commentId;
        }

        public float getParentId() {
            return parentId;
        }

        public void setParentId(float parentId) {
            this.parentId = parentId;
        }

        public float getArticleId() {
            return articleId;
        }

        public void setArticleId(float articleId) {
            this.articleId = articleId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public float getFullName() {
            return fullName;
        }

        public void setFullName(float fullName) {
            this.fullName = fullName;
        }

        public String getCreationTime() {
            return creationTime;
        }

        public void setCreationTime(String creationTime) {
            this.creationTime = creationTime;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getUserLike() {
            return userLike;
        }

        public void setUserLike(int userLike) {
            this.userLike = userLike;
        }

        public List<Replys> getReplys() {
            return replys;
        }

        public void setReplys(List<Replys> replys) {
            this.replys = replys;
        }

        public float getUserId() {
            return userId;
        }

        public void setUserId(float userId) {
            this.userId = userId;
        }

        public int getType() {
            return Type;
        }

        public void setType(int type) {
            Type = type;
        }

        public boolean isLikeIsmember() {
            return likeIsmember;
        }

        public void setLikeIsmember(boolean likeIsmember) {
            this.likeIsmember = likeIsmember;
        }
    }
    public class Replys {
        @SerializedName("total")
        public  int total;
        @SerializedName("items")
        public  int items;
    }

}
