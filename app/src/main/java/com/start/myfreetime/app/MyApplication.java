package com.start.myfreetime.app;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;


import com.squareup.leakcanary.LeakCanary;
import com.tbruyelle.rxpermissions.RxPermissions;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;


import io.realm.Realm;
import io.realm.RealmConfiguration;


/**
 * Created by w on 2017/4/10.
 */

public class MyApplication extends Application {

    public static final int WRITE_EXTERNAL_STORAGE_REQUEST_CODE=0;

    public static Application instance;

    private static Context context;

    public static Application getInstance() {
        return instance;
    }

    public static Context getContext(){
        return context;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);
        instance = this;
        context=getApplicationContext();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);

        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口

        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device token
                Log.e("deviceToken",deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {
                Log.d("deviceToken获取失败",s);
            }
        });
//        Stetho.initialize(
//                Stetho.newInitializerBuilder(this)
//                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
//                        .build());
    }


}
