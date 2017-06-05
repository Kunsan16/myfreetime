package com.start.myfreetime.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;

import com.bumptech.glide.Glide;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.glide.GlideCatchUtil;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by w on 2017/5/31.
 */

public class PersonSettingPresenterImp implements PersonSettingPresenter {

    private Context context;
    private PersonSettingView view;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;



    public PersonSettingPresenterImp(Context context, PersonSettingView view){
        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        sp = context.getSharedPreferences("user_settings",MODE_PRIVATE);
        editor = sp.edit();
    }


    @Override
    public void setNoPictureMode(boolean isCheck) {
        editor.putBoolean("no_picture_mode",isCheck);
        editor.apply();
    }

    @Override
    public void cleanGlideCache() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Glide.get(context).clearDiskCache();
//                Message msg = new Message();
//                msg.what = CLEAR_GLIDE_CACHE_DONE;
//                handler.sendMessage(msg);
//            }
//        }).start();
        if (GlideCatchUtil.getInstance().clearCacheDiskSelf()){
            Logger.i("准备获取大小",GlideCatchUtil.getInstance().getCacheSize());
            view.cleanGlideCacheDone(GlideCatchUtil.getInstance().getCacheSize());
        }
        Glide.get(context).clearMemory();
    }

    @Override
    public void start() {

    }
}
