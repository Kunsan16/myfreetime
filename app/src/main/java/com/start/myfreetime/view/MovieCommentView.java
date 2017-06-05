package com.start.myfreetime.view;

import android.view.View;

import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.presenter.MovieCommentPresenter;

import java.util.List;

/**
 * Created by w on 2017/6/1.
 */

public interface MovieCommentView extends BaseView<MovieCommentPresenter> {

    void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data);
}
