package com.example.room1.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "table_name"
)
public class Post {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public User user;
    private String title;
    private String body;

    public Post() {
    }

    public Post(User user,String title, String body) {
        this.title = title;
        this.body = body;
        this.user = user;
    }

    public Post(int id, User user, String title, String body) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User userId) {
        this.user = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
