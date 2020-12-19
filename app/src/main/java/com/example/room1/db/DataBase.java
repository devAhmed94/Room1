package com.example.room1.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = Post.class ,version = 1)
@TypeConverters(Converts.class)
public abstract class DataBase extends RoomDatabase {
    private static DataBase instance;
    public abstract DataAccess dataAccess();
    public static synchronized DataBase getInstance(Context context){
        if (instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext()
            ,DataBase.class,"posts_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }


}
