package com.a360ground.messescore.databases;

import android.content.Context;

import com.a360ground.messescore.models.News;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Kiyos Solomon on 2/25/2017.
 */

public class CacheScoreManager {

    static RealmConfiguration config = new RealmConfiguration
            .Builder()
            .name("app.realm")
            .deleteRealmIfMigrationNeeded()
            .build();

    private static Realm realm= Realm.getInstance(config);

    public static void insertNews(List<News> news){

       realm.beginTransaction();

       realm.insertOrUpdate(news);

       realm.commitTransaction();

    }



    public static List<News> getNewsByCategory(int categoryId){
        return realm.where(News.class).equalTo("categories",String.valueOf(categoryId)).findAll();
    }

    public static List<News> getAllNews(){
        return realm.where(News.class).findAll();
    }



    public static void deleteAll(){
        realm.beginTransaction();

        realm.deleteAll();

        realm.commitTransaction();
    }



}
