package com.aeolus.lifeproject;

import android.app.Application;

import org.xutils.x;

/**
 * 程序入口
 * Created by aeolus.qian on 2016/9/14.
 */
public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
