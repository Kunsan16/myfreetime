package com.start.myfreetime.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.R;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.ZhihuDailyNews;

/**
 * Created by w on 2017/3/15.
 */

public class MovieViewHolder extends BaseViewHolder<MovieBean.DataBean.MoviesBean> {

    private TextView mTv_name;
    private ImageView mImg_face;
    private TextView mTv_sign;

    public MovieViewHolder(ViewGroup parent) {
        super(parent, R.layout.movie_recycler_item);
        mTv_name = $(R.id.movie_name);
        mTv_sign = $(R.id.movie_sc);
        mImg_face = $(R.id.movie_pic);
    }

    @Override
    public void setData(MovieBean.DataBean.MoviesBean data) {


         mTv_name.setText(data.getNm());
         mTv_sign.setText(data.getSc()+"");
        Glide.with(getContext())
             .load(data.getImg())
              .placeholder(R.mipmap.ic_launcher)
              .centerCrop()
              .into(mImg_face);
    }
}
