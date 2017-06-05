package com.start.myfreetime.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.ZhihuDailyNews;

/**
 * Created by w on 2017/3/15.
 */

public class MovieAdapter extends RecyclerArrayAdapter<MovieBean.DataBean.MoviesBean> {


    public MovieAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieViewHolder(parent);
    }
}
