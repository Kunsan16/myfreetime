package com.start.myfreetime.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.app.db.NewsDao;
import com.start.myfreetime.bean.Api;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;
import com.start.myfreetime.bean.ZhihuDailyStory;
import com.start.myfreetime.http.CommonOkHttpClient;
import com.start.myfreetime.http.listener.DisposeDataHandle;
import com.start.myfreetime.http.listener.DisposeDataListener;
import com.start.myfreetime.http.request.ConmonRequest;

import java.util.List;

import io.realm.Realm;

/**
 * Created by w on 2017/4/15.
 */

public class CacheService extends Service {

    public static final int TYPE_ZHIHU = 0x00;
    private NewsDao newsDao;
    private Realm mRealm;


    @Override
    public void onCreate() {
        super.onCreate();

        IntentFilter filter = new IntentFilter();
        filter.addAction("com.start.myfreetime.LOCAL_BROADCAST");
        LocalBroadcastManager manager = LocalBroadcastManager.getInstance(this);
        manager.registerReceiver(new LocalReceiver(), filter);
        mRealm = Realm.getDefaultInstance();
        newsDao = new NewsDao(mRealm);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    class LocalReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            int id = intent.getIntExtra("id",-1);
            switch (intent.getIntExtra("type", -1)) {
                case TYPE_ZHIHU:
                    startZhihuCache(id);
                    break;

                default:
                case -1:
                    break;
            }
        }
    }

    private void startZhihuCache(final int id) {

//        Realm realm = Realm.getDefaultInstance();
//        List<Question> idList= realm.where(Question.class).findAll();
//        Logger.i("请求内容详情的ID:",id);
//        for (Question story:idList){

            if (newsDao.ifNeedGetContent(id)){
                CommonOkHttpClient.get(ConmonRequest.createGetRequest(Api.ZHIHU_NEWS_DETAIL+id,null),new DisposeDataHandle(new DisposeDataListener() {
                    @Override
                    public void onSuccess(String responseObj) {
                        Log.e("请求知乎日报内容详情",responseObj);
                        Gson gson=new Gson();
                        final ZhihuDailyStory post = gson.fromJson(responseObj, ZhihuDailyStory.class);
                        newsDao.addOneContent(id,post.getBody());

                    }

                    @Override
                    public void onFailure(String reasonObj) {
                        Logger.e("reasonObj",reasonObj);

                    }
                }));
            }else {
                List<ZhihuDailyStory> list = mRealm.where(ZhihuDailyStory.class).findAll();

            }



    }



}
