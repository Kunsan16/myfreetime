package com.start.myfreetime.view;

import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.ZhihuDailyNews;
import com.start.myfreetime.presenter.MoviePresenter;
import com.start.myfreetime.presenter.NewsPresenter;

import java.util.ArrayList;

/**
 * Created by w on 2017/3/22.
 */

public interface MovieView extends BaseView<MoviePresenter> {

    void showError();

    void showResults(ArrayList<MovieBean.DataBean.MoviesBean> list);

    void showLoading();

    void stopLoading();

    void showQueryResult(MovieBean.DataBean.MoviesBean item);
}
