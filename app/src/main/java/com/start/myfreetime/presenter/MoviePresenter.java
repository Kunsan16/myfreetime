package com.start.myfreetime.presenter;

import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.ZhihuDailyNews;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by w on 2017/3/31.
 */

public interface MoviePresenter extends BasePresenter {


    void queryMovie(ArrayList<MovieBean.DataBean.MoviesBean> qlist, String movieTitle);

    void startReading(ArrayList<MovieBean.DataBean.MoviesBean>list, int position);
}
