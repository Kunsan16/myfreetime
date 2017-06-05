package com.start.myfreetime.module;

import com.start.myfreetime.NewsFragment;
import com.start.myfreetime.adapter.NewsAdapter;
import com.start.myfreetime.fragment.CollectFragement;
import com.start.myfreetime.presenter.NewsPresenter;
import com.start.myfreetime.presenter.NewsPresenterImp;
import com.start.myfreetime.presenter.RemarkPresenter;
import com.start.myfreetime.presenter.RemarkPresenterImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by w on 2017/3/28.
 */

@Module
public class RemarkModule {

    private CollectFragement fragment;

    public RemarkModule(CollectFragement fragment){

        this.fragment=fragment;

    }


    @Provides
    NewsAdapter providerNewsAdapter(){
        return new NewsAdapter(fragment.getContext());
    }

    @Provides
    RemarkPresenter providerNewsPresenter(){
        return new RemarkPresenterImp(fragment.getContext(),fragment);
    }

}
