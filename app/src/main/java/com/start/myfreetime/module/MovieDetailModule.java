package com.start.myfreetime.module;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.start.myfreetime.DetailPresenterImp;
import com.start.myfreetime.MovieDetailFragment;
import com.start.myfreetime.MovieFragment;
import com.start.myfreetime.adapter.MovieAdapter;
import com.start.myfreetime.adapter.ViewPagerAdapter;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.presenter.MovieMainDetailPresenter;
import com.start.myfreetime.presenter.MovieMainDetailPresenterImp;


import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by w on 2017/3/31.
 */

@Module
public class MovieDetailModule {

    MovieDetailFragment fragment;
    Context context;
    List<MovieBean.DataBean.MoviesBean> list;
    List<Fragment> fragments;
    List<String> title;

    public MovieDetailModule(MovieDetailFragment fragment, Context context, List<String> title, List<Fragment> fragments){
        this.fragment=fragment;
        this.context=context;
        this.fragments=fragments;
        this.title=title;
    }

    @Provides
    ViewPagerAdapter providerNewsAdapter(){
        return new ViewPagerAdapter(fragment.getFragmentManager(),fragments,title);
    }

    @Provides
    public MovieMainDetailPresenter provideMoviePresenter(){

        return new MovieMainDetailPresenterImp(fragment.getContext(),fragment);
    }
}
