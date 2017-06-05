package com.start.myfreetime.module;

import android.content.Context;

import com.start.myfreetime.MovieFragment;
import com.start.myfreetime.adapter.MovieAdapter;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.presenter.MoviePresenter;
import com.start.myfreetime.presenter.MoviePresenterImp;

import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by w on 2017/3/31.
 */

@Module
public class MovieModule {

    MovieFragment fragment;
    Context context;
    List<MovieBean.DataBean.MoviesBean> list;

    public MovieModule(MovieFragment fragment, Context context){
        this.fragment=fragment;
        this.context=context;

    }

    @Provides
    MovieAdapter providerNewsAdapter(){
        return new MovieAdapter(fragment.getContext());
    }

    @Provides
    public MoviePresenter provideMoviePresenter(){

        return new MoviePresenterImp(fragment,context);
    }
}
