package com.start.myfreetime.presenter;

import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.ZhihuDailyNews;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by w on 2017/3/22.
 */

public interface NewsPresenter extends BasePresenter {


    void loadPosts(long date, boolean clearing);

    void loadLaste(boolean clearing);

    void refresh();

    void loadMore(long date);

    void startReading( int position);



}
