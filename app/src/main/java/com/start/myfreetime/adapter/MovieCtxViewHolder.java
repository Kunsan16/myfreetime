package com.start.myfreetime.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.R;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;

/**
 * Created by w on 2017/3/15.
 */

public class MovieCtxViewHolder extends BaseViewHolder<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> {

    private RatingBar mTv_name;
    private ImageView mImg_face;
    private TextView mTv_sign;

    public MovieCtxViewHolder(ViewGroup parent) {
        super(parent, R.layout.moviectx_recycler_item);
        mTv_name = $(R.id.score_star);
        mTv_sign = $(R.id.content);
        mImg_face = $(R.id.person_face);
    }

    @Override
    public void setData(MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean data) {

         //mTv_name.setText(data.getTitle());
         mTv_sign.setText(data.getContent());
        Glide.with(getContext())
             .load(data.getAvatarurl())
              .placeholder(R.mipmap.ic_launcher)
              .centerCrop()
              .into(mImg_face);
    }
}
