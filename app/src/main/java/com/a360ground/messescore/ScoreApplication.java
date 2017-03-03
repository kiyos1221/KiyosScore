package com.a360ground.messescore;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Kiyos Solomon on 2/25/2017.
 */

public class ScoreApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
