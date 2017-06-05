package com.start.myfreetime.presenter;

import android.view.View;

import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;
import com.start.myfreetime.view.BaseView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by w on 2017/5/2.
 */

public interface RemarkView extends BaseView<RemarkPresenter> {

    void showResults(List<ZhihuNewsRemarkBean> zhihuList);

    void notifyDataChanged();

    void showLoading();

    void stopLoading();

}
