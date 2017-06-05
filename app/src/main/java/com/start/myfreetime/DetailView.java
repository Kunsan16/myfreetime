package com.start.myfreetime;

import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.view.BaseView;

import java.util.List;

/**
 * Created by w on 2017/3/25.
 */
interface DetailView extends BaseView<DetailPresenter> {

    void showLoading();

    void stopLoading();

    void showLoadingError();

    void showSharingError();

    void showResult(String result);

    void showResultWithoutBody(String url);

    void showCover(String url);

    void setTitle(String title);

    void showMovieData(MovieDetailBean.DataBean.MovieDetailModelBean bean);

    void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data);

    void setImageMode(boolean showImage);

    void showBrowserNotFoundError();

    void showTextCopied();

    void showCopyTextError();

    void showWXShareFail();

    void showAddedToBookmarks();

    void showDeletedFromBookmarks();

}
