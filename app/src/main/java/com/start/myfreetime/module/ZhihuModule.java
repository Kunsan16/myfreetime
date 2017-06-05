package com.start.myfreetime.module;

import com.start.myfreetime.NewsFragment;
import com.start.myfreetime.adapter.NewsAdapter;
import com.start.myfreetime.presenter.NewsPresenter;
import com.start.myfreetime.presenter.NewsPresenterImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by w on 2017/3/28.
 */

@Module
public class ZhihuModule {

    private NewsFragment fragment;

    public ZhihuModule(NewsFragment fragment){

        this.fragment=fragment;

    }


    @Provides
    NewsAdapter providerNewsAdapter(){
        return new NewsAdapter(fragment.getContext());
    }

    @Provides
    NewsPresenter providerNewsPresenter(){
        return new NewsPresenterImp(fragment.getContext(),fragment);
    }

}
