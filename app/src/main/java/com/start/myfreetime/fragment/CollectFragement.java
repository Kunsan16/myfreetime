package com.start.myfreetime.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaeger.library.StatusBarUtil;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.MainActivity;
import com.start.myfreetime.MovieFragment;
import com.start.myfreetime.PixUtil;
import com.start.myfreetime.R;
import com.start.myfreetime.adapter.NewsAdapter;
import com.start.myfreetime.adapter.RemarkAdapter;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.bean.BeanType;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;

import com.start.myfreetime.module.DaggerRemarkComponent;
import com.start.myfreetime.module.NewsComponent;
import com.start.myfreetime.module.RemarkComponent;
import com.start.myfreetime.module.RemarkModule;
import com.start.myfreetime.module.ZhihuModule;
import com.start.myfreetime.presenter.RemarkPresenter;
import com.start.myfreetime.presenter.RemarkPresenterImp;
import com.start.myfreetime.presenter.RemarkView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by w on 2017/4/8.
 */

public class CollectFragement extends BaseFragment<RemarkPresenter> implements RemarkView{



    private RemarkAdapter adapter;
    @BindView(R.id.recyclerView)
    EasyRecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.collect_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        initViews(view);
        mPresenter.loadResults(false);
        MainActivity activity=(MainActivity)getActivity();
        activity.setToolbarVisible(false);
        activity.initToolbar("收藏",getResources().getColor(R.color.remarkColor));
        StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.remarkColor));
        return view;
    }

    @Override
    public void showResults(List<ZhihuNewsRemarkBean> zhihuList) {

        adapter.addAll(zhihuList);
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                mPresenter.startReading(BeanType.TYPE_ZHIHU,position);

            }
        });
    }


    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden){

        }else {

            MainActivity activity=(MainActivity)getActivity();
            activity.setToolbarVisible(false);
            activity.initToolbar("收藏",getResources().getColor(R.color.remarkColor));
            StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.remarkColor));
        }

    }

    public static CollectFragement newInstance() {
        return new CollectFragement();
    }

    @Override
    public void notifyDataChanged() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void setPresenter(RemarkPresenter presenter) {
         this.mPresenter=presenter;
    }

    @Override
    public void initViews(View view) {
        RemarkComponent component= DaggerRemarkComponent.builder()
                .remarkModule(new RemarkModule(this)).build();
        component.inject(this);

        adapter=new RemarkAdapter(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        SpaceDecoration itemDecoration = new SpaceDecoration((int) PixUtil.convertDpToPixel(8, getContext()));
        itemDecoration.setPaddingEdgeSide(true);
        itemDecoration.setPaddingStart(true);

        recyclerView.addItemDecoration(itemDecoration);
    }
}
