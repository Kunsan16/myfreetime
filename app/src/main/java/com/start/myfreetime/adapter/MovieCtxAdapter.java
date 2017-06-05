package com.start.myfreetime.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;

/**
 * Created by w on 2017/3/15.
 */

public class MovieCtxAdapter extends RecyclerArrayAdapter<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> {


    public MovieCtxAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieCtxViewHolder(parent);
    }
}
