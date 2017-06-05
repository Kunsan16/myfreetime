package com.start.myfreetime.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import com.orhanobut.logger.Logger;
import com.start.myfreetime.DetailActivity;
import com.start.myfreetime.bean.BeanType;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.StringModelImpl;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;
import com.start.myfreetime.view.MovieView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

/**
 * Created by w on 2017/5/2.
 */

public class RemarkPresenterImp implements RemarkPresenter {

    RemarkView view;
    private Context context;
    private ArrayList<ZhihuNewsRemarkBean> ZhihuList;
    private ArrayList<MovieBean.DataBean.MoviesBean> moviesList;

    private ArrayList<Integer> types;
    private Realm mRealm;

    public RemarkPresenterImp(Context context, RemarkView view){

        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        ZhihuList = new ArrayList<>();
        moviesList = new ArrayList<>();


        types = new ArrayList<>();
        mRealm = Realm.getDefaultInstance();
    }



    @Override
    public void loadResults(boolean refresh) {
        if (!refresh) {
            view.showLoading();
        }else {
            ZhihuList.clear();
            moviesList.clear();

            types.clear();
        }

        List<ZhihuNewsRemarkBean> list=mRealm.where(ZhihuNewsRemarkBean.class).findAll();
        if (list.size()>0) {
            ZhihuList.addAll(list);
            view.showResults(list);
        }
    }

    @Override
    public void startReading(BeanType type, int position) {
        Intent intent = new Intent(context, DetailActivity.class);

                ZhihuNewsRemarkBean q =ZhihuList .get(position );
              //  intent.putExtra("type", BeanType.TYPE_ZHIHU);
                 intent.putExtra("zhihu","zhihu");
                intent.putExtra("id",q.getId());
                intent.putExtra("title", q.getTitle());
                intent.putExtra("coverUrl", q.getCoverUrl());
                context.startActivity(intent);
    }

    @Override
    public void checkForFreshData() {


    }

    @Override
    public void start() {

    }
}
