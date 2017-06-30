package com.start.myfreetime.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.DateFormatter;
import com.start.myfreetime.DetailActivity;
import com.start.myfreetime.OnStringListener;
import com.start.myfreetime.app.Constant;
import com.start.myfreetime.app.db.NewsDao;
import com.start.myfreetime.bean.Api;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.RealmBean;
import com.start.myfreetime.bean.StringModelImpl;
import com.start.myfreetime.bean.TopStoriesBean;
import com.start.myfreetime.bean.ZhihuDailyNews;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;
import com.start.myfreetime.service.CacheService;
import com.start.myfreetime.utils.NetWorkUtils;
import com.start.myfreetime.view.NewsView;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;


/**
 * Created by w on 2017/3/22.
 */

public class NewsPresenterImp implements NewsPresenter {

    NewsView view;
    StringModelImpl model;
    private Context context;
    private Gson gson = new Gson();
    private ArrayList<Question> list = new ArrayList<Question>();
    private ArrayList<TopStoriesBean> topList = new ArrayList<TopStoriesBean>();
    private DateFormatter formatter = new DateFormatter();
    private NewsDao newsDao;
    private Realm mRealm;

    public NewsPresenterImp(Context context, NewsView view) {
        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        model = new StringModelImpl(context);
        mRealm = Realm.getDefaultInstance();
        newsDao = new NewsDao(mRealm);
    }

    /**
     * 获取知乎日报历史消息，并保存数据库
     * @param clearing
     */
    @Override
    public void loadPosts(final long date, final boolean clearing) {
        //view.showLoading();
        if (clearing) {
            view.showLoading();
        }
        if (NetWorkUtils.isConnected(context)) {
            model.load(Api.ZHIHU_NEWS_HISTORY + formatter.ZhihuDailyDateFormat(date), new OnStringListener() {
                @Override
                public void onSuccess(String result) {

                    ZhihuDailyNewsHistory post = gson.fromJson(result, ZhihuDailyNewsHistory.class);

                    if (clearing) {
                        list.clear();
                    }
                    for (int i = 0; i <post.getStories().size() ; i++) {
                        final Question question=new Question();

                        question.setId(post.getStories().get(i).getId());
                        question.setTitle(post.getStories().get(i).getTitle());
                        question.setImages(post.getStories().get(i).getImages().get(0));

                        list.add(question);
                        //添加到数据库
                        newsDao.addOneNews(question.getId(),question.getImages(),question.getTitle());


                        Intent intent = new Intent("com.start.myfreetime.LOCAL_BROADCAST");
                        intent.putExtra("type", CacheService.TYPE_ZHIHU);
                        intent.putExtra("id", question.getId());
                        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                 }
                    view.showResult(list);
                    view.stopLoading();
                }

                @Override
                public void onError(String error) {
                    Log.e("result", error);
                }
            });
        }else {
            if (clearing) {

                list.clear();
                List<Question> questions_list = mRealm.where(Question.class).findAll();
                list.addAll(questions_list);
                view.showResult(list);
            }else {
                view.showError();
            }
        }
    }

    /**
     * 获取知乎日报最新消息，主要是顶部滚动消息
     * @param clearing
     */
    @Override
    public void loadLaste(final boolean clearing) {

        if (NetWorkUtils.isConnected(context)) {
        model.load(Api.ZHIHU_NEWS, new OnStringListener() {
            @Override
            public void onSuccess(String result) {

                ZhihuDailyNews post = gson.fromJson(result, ZhihuDailyNews.class);
                if (clearing) {
                    topList.clear();
                }

                for (int i = 0; i <post.getTop_stories().size() ; i++) {
                    final TopStoriesBean top=new TopStoriesBean();
                    top.setTitle(post.getTop_stories().get(i).getTitle());
                    top.setImage(post.getTop_stories().get(i).getImage());
                    top.setId(post.getTop_stories().get(i).getId());
                    topList.add(top);
                    //加入本地数据库
                    newsDao.addOneTopStories(top.getTitle(),top.getImage());
                }
                view.showSlide(topList);
            }
            @Override
            public void onError(String error) {
                Log.e("result",error);
            }
        });
        }else {
            List<TopStoriesBean> list = mRealm.where(TopStoriesBean.class).findAll();
            view.showSlide(list);

        }
    }

    @Override
    public void refresh() {
        loadPosts(Calendar.getInstance().getTimeInMillis(), true);
    }

    @Override
    public void loadMore(long date) {
        loadPosts(date, false);
    }

    @Override
    public void startReading( int position) {
       // Logger.i("传递的id",list.get(position).getId());
        context.startActivity(new Intent(context, DetailActivity.class)
                .putExtra("zhihu","zhihu")
                .putExtra("id",list.get(position).getId())
                .putExtra("title",list.get(position).getTitle()));
    }



    @Override
    public void start() {

        loadPosts(Calendar.getInstance().getTimeInMillis(), true);
        loadLaste(true);
    }


}
