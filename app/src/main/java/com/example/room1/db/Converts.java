package com.example.room1.db;

import androidx.room.TypeConverter;

import com.google.gson.Gson;

public class Converts {
    @TypeConverter
    public String fromUserToString (User user){
        return new Gson().toJson(user);
    }
    @TypeConverter
    public User fromStringToUser(String stringUser){
        return new Gson().fromJson(stringUser,User.class);
    }
}
