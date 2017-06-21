package com.start.myfreetime;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.daimajia.slider.library.SliderLayout;
import com.google.gson.Gson;
import com.jaeger.library.StatusBarUtil;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.adapter.NewsAdapter;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.RealmBean;
import com.start.myfreetime.bean.TopStoriesBean;
import com.start.myfreetime.bean.ZhihuDailyNews;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;


import com.start.myfreetime.module.DaggerNewsComponent;
import com.start.myfreetime.module.NewsComponent;
import com.start.myfreetime.module.ZhihuModule;
import com.start.myfreetime.presenter.NewsPresenter;
import com.start.myfreetime.utils.SliderHelper;
import com.start.myfreetime.view.BounceLoadingView;
import com.start.myfreetime.view.NewsView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by w on 2017/3/15.
 */

public class NewsFragment extends BaseFragment<NewsPresenter> implements NewsView{


    private int page = 0;
    @BindView(R.id.recyclerView)
    EasyRecyclerView recyclerView;
    private SliderLayout mAdSlider;


    private int mYear = Calendar.getInstance().get(Calendar.YEAR);
    private int mMonth = Calendar.getInstance().get(Calendar.MONTH);
    private int mDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

    @Inject
    NewsAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        initViews(view);
        mPresenter.start();  //开始获取数据
        MainActivity activity=(MainActivity)getActivity();
        activity.setToolbarVisible(false);
        StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.colorPrimary));
        activity.initToolbar("知乎日报",getResources().getColor(R.color.colorPrimary));
        return view;
    }

    public static NewsFragment newInstance() {
        return new NewsFragment();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden){
            Log.i("hidden",hidden+"");
        }else {
            Log.i("hidden no",hidden+"");
            MainActivity activity=(MainActivity)getActivity();
            activity.setToolbarVisible(false);
            StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.colorPrimary));
            activity.initToolbar("知乎日报",getResources().getColor(R.color.colorPrimary));
        }

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("NewsFragment","onResume");
        if (mAdSlider != null) {
            mAdSlider.startAutoCycle();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("NewsFragment","onStop");
        if (mAdSlider != null) {
            mAdSlider.stopAutoCycle();
        }
    }

    @Override
    public void showError() {
         recyclerView.setEmptyView(R.layout.view_empty);
    }

    @Override
    public void showSlide(List<TopStoriesBean> bean) {
        recyclerView.scrollToPosition(0);
        final View view = LayoutInflater.from(mContext).inflate(R.layout.head_news_list, null);
        mAdSlider = (SliderLayout) view.findViewById(R.id.slider_ads);
        SliderHelper.initAdSlider(mContext, mAdSlider, bean);
        if (adapter.getHeaderCount()==0){
            adapter.addHeader(new RecyclerArrayAdapter.ItemView() {
                @Override
                public View onCreateView(ViewGroup parent) {
                    return view;
                }

                @Override
                public void onBindView(View headerView) {

                }
            });
        }
        final View view_footer = LayoutInflater.from(mContext).inflate(R.layout.view_more, null);

            adapter.addFooter(new RecyclerArrayAdapter.ItemView() {
                @Override
                public View onCreateView(ViewGroup parent) {
                    return view_footer;
                }

                @Override
                public void onBindView(View headerView) {

                }
            });

    }
    @Override
    public void showLoading() {


    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showResult(final List<Question> list) {

            adapter.addAll(list);
            list.clear();//可能是EasyRec的封装原因，之前的list还会再显示一遍，这里显示完clear
            adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {

                    mPresenter.startReading(position);

                }
            });

    }


    @Override
    public void setPresenter(NewsPresenter presenter) {
        this.mPresenter=presenter;
    }

    @Override
    public void initViews(View view) {
        NewsComponent component= DaggerNewsComponent.builder()
                .zhihuModule(new ZhihuModule(this)).build();
        component.inject(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        SpaceDecoration itemDecoration = new SpaceDecoration((int) PixUtil.convertDpToPixel(8, getContext()));
        itemDecoration.setPaddingEdgeSide(true);
        itemDecoration.setPaddingStart(true);

        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            boolean isSlidingToLast = false;
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    // 获取最后一个完全显示的item position
                    int lastVisibleItem = manager.findLastCompletelyVisibleItemPosition();
                    int totalItemCount = manager.getItemCount();

                    // 判断是否滚动到底部并且是向下滑动
                    if (lastVisibleItem == (totalItemCount - 1) && isSlidingToLast) {
                        final Calendar c = Calendar.getInstance();
                        c.set(mYear, mMonth, --mDay);
                        Log.d("加载更多","初始化就加载？");

                               mPresenter.loadMore(c.getTimeInMillis());


                    }
                }
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                isSlidingToLast = dy > 0;
                super.onScrolled(recyclerView, dx, dy);

            }
        });
//        adapter.setMore(R.layout.view_more, new RecyclerArrayAdapter.OnMoreListener() {
//            @Override
//            public void onMoreShow() {
//
//            }
//
//            @Override
//            public void onMoreClick() {
//
//            }
//        });


    }


}
