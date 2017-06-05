package com.start.myfreetime.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;

/**
 * Created by w on 2017/3/15.
 */

public class RemarkAdapter extends RecyclerArrayAdapter<ZhihuNewsRemarkBean> {


    public RemarkAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new RemarkViewHolder(parent);
    }
}
