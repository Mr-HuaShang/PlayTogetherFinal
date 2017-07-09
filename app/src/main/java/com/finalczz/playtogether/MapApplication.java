package com.finalczz.playtogether;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by 话伤 on 2017/7/3.
 */

public class MapApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SDKInitializer.initialize(this);
    }
}
