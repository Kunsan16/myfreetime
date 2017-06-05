package com.start.myfreetime.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.R;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;

/**
 * Created by w on 2017/3/15.
 */

public class RemarkViewHolder extends BaseViewHolder<ZhihuNewsRemarkBean> {

    private TextView mTv_name;
    private ImageView mImg_face;
    private TextView mTv_sign;

    public RemarkViewHolder(ViewGroup parent) {
        super(parent, R.layout.news_recycler_item);
        mTv_name = $(R.id.person_name);
        mImg_face = $(R.id.person_face);
    }

    @Override
    public void setData(ZhihuNewsRemarkBean data) {

        Logger.i("title",data.getTitle());
         mTv_name.setText(data.getTitle());

        Glide.with(getContext())
             .load(data.getCoverUrl())
              .placeholder(R.mipmap.ic_launcher)
              .centerCrop()
              .into(mImg_face);
    }
}
