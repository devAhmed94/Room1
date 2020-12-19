package com.example.room1.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;


@Dao
public interface DataAccess {

    @Insert
    Completable insertPost(Post post);

    @Query("select * from table_name")
    Single<List<Post>> getPosts();

}
