package com.kylin.crashcollection.app;

import android.app.Application;

import com.kylin.crashcollection.utils.CrashHandler;

/**
 * Created by Einstein on 2018/1/5.
 * Application
 */
public class CrashCollectionApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initCrash();
    }

    /**
     * 初始化Crash收集器
     */
    private void initCrash() {
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }
}
