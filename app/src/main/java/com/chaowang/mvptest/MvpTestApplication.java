package com.chaowang.mvptest;

import android.app.Application;
import android.content.Context;

/**
 * Created by chao.wang on 2016/10/27.
 */

public class MvpTestApplication extends Application {
    public static Context cxt;
    private Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        if (cxt == null) {//预防传说中的Activity 启动两次
            cxt = getApplicationContext();
        }
    }

    public static Context getCxt() {
        return cxt;
    }
}
