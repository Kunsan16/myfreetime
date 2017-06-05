package com.start.myfreetime.view;

import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.RealmBean;
import com.start.myfreetime.bean.TopStoriesBean;
import com.start.myfreetime.bean.ZhihuDailyNews;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;
import com.start.myfreetime.presenter.NewsPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by w on 2017/3/22.
 */

public interface NewsView extends BaseView<NewsPresenter> {

    void showError();

    void showSlide(List<TopStoriesBean> bean);

    void showLoading();

    void stopLoading();

    void showResult(List<Question> list);


}
