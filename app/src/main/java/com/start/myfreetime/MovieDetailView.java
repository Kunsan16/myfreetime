package com.start.myfreetime;

import com.start.myfreetime.bean.MovieCommentBean;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.presenter.MovieMainDetailPresenter;
import com.start.myfreetime.view.BaseView;
import com.start.myfreetime.MovieDetailView;
import java.util.List;

/**
 * Created by w on 2017/3/25.
 */
public interface MovieDetailView extends BaseView<MovieMainDetailPresenter> {

    void showMovieData(MovieDetailBean.DataBean.MovieDetailModelBean bean);

    void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data);

    void showMovieComment(List<MovieCommentBean.DataBean.CommentResponseModelBean.CmtsBean> list);
}
