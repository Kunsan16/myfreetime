package com.start.myfreetime;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.start.myfreetime.adapter.MovieAdapter;
import com.start.myfreetime.adapter.NewsAdapter;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.bean.LocationParam;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.ZhihuDailyNews;


import com.start.myfreetime.fragment.MovieCopyFragment;
import com.start.myfreetime.module.DaggerMovieComponent;
import com.start.myfreetime.module.MovieComponent;
import com.start.myfreetime.module.MovieModule;
import com.start.myfreetime.module.NewsComponent;
import com.start.myfreetime.module.ZhihuModule;
import com.start.myfreetime.presenter.MoviePresenter;
import com.start.myfreetime.presenter.NewsPresenter;
import com.start.myfreetime.view.MovieView;
import com.start.myfreetime.view.NewsView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by w on 2017/3/15.
 */

public class MovieFragment extends BaseFragment<MoviePresenter> implements MovieView {


    @Inject
    MovieAdapter adapter;
    @BindView(R.id.recyclerView)
    EasyRecyclerView recyclerView;
    @BindView(R.id.tv_search_bg)
    TextView mSearchBGTxt;
    @BindView(R.id.search_frame)
    FrameLayout frameLayout;
    ArrayList<MovieBean.DataBean.MoviesBean> movieList=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.movies_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        mPresenter.start();  //开始获取数据

        MovieComponent component= DaggerMovieComponent.builder().movieModule(new MovieModule(this,getActivity())).build();
        component.inject(this);
        initViews(view);

        MainActivity activity=(MainActivity)getActivity();
       // activity.initToolbar("看电影",getResources().getColor(R.color.collectColor));
        StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.movieColor));
        activity.setToolbarVisible(true);
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden){
            Log.i("hidden",hidden+"");
        }else {
            Log.i("hidden no",hidden+"");
            MainActivity activity=(MainActivity)getActivity();
            // activity.initToolbar("看电影",getResources().getColor(R.color.collectColor));
            StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.movieColor));
            activity.setToolbarVisible(true);
        }

    }

    public static MovieFragment newInstance() {
        return new MovieFragment();
    }

    @Override
    public void showError() {

    }

    @OnClick (R.id.tv_search_bg)
    public void searchMovie(){


        int location[] = new int[2];
        mSearchBGTxt.getLocationOnScreen(location);
        MovieCopyFragment fragment = new MovieCopyFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("x",location[0]);
        bundle.putInt("y",location[1]);
        bundle.putSerializable("list",movieList);
//        LocationParam.getInstance().setLoc_x(location[0]);
//        LocationParam.getInstance().setLoc_y(location[1]);
//        LocationParam.getInstance().setList(movieList);

        fragment.setArguments(bundle);
       // showFragment( R.id.fragment_container,this,fragment,"movie");
//        getChildFragmentManager().beginTransaction()
//                .add(R.id.moview_fragment_container,fragment)
//
//
//                .addToBackStack(null)
//                .commit();
           getChildFragmentManager()
        //getActivity().getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.moview_fragment_container,fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void showResults(final ArrayList<MovieBean.DataBean.MoviesBean> list) {
        adapter.addAll(list);
        movieList.addAll(list);
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                mPresenter.startReading(list,position);

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
    public void showQueryResult(MovieBean.DataBean.MoviesBean item) {

    }

    @Override
    public void initViews(View view) {
        super.initViews(view);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        SpaceDecoration itemDecoration = new SpaceDecoration((int) PixUtil.convertDpToPixel(8, getContext()));
        itemDecoration.setPaddingEdgeSide(true);
        itemDecoration.setPaddingStart(true);
        itemDecoration.setPaddingHeaderFooter(false);
        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setOnScrollListener(new HidingScrollListener() {
            @Override
            public void onHide() {
                hideViews();
            }

            @Override
            public void onShow() {
                showViews();
            }
        });
    }

    private void showViews() {
        frameLayout.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));


    }

    private void hideViews() {
        frameLayout.animate().translationY(-frameLayout.getHeight()).setInterpolator(new AccelerateInterpolator(2));
    }
}
