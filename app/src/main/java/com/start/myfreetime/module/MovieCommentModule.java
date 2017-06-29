package com.start.myfreetime.module;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.start.myfreetime.MovieDetailFragment;
import com.start.myfreetime.adapter.ViewPagerAdapter;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.fragment.MovieCommentFragment;
import com.start.myfreetime.presenter.MovieMainDetailPresenter;
import com.start.myfreetime.presenter.MovieMainDetailPresenterImp;

import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by w on 2017/3/31.
 */

@Module
public class MovieCommentModule {

    MovieCommentFragment fragment;
    Context context;
    List<MovieBean.DataBean.MoviesBean> list;
    List<Fragment> fragments;
    List<String> title;

    public MovieCommentModule(MovieCommentFragment fragment, Context context){
        this.fragment=fragment;
        this.context=context;
        this.fragments=fragments;
        this.title=title;
    }


    @Provides
    public MovieMainDetailPresenter provideMoviePresenter(){

        return new MovieMainDetailPresenterImp(fragment.getContext(),fragment);
    }
}
