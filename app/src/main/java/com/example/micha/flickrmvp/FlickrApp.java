package com.example.micha.flickrmvp;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by micha on 2/10/2018.
 */

public class FlickrApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if(LeakCanary.isInAnalyzerProcess(this)){
            return;
        }

        LeakCanary.install(this);
    }
}
