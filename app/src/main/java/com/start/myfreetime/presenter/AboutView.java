package com.start.myfreetime.presenter;

import com.start.myfreetime.view.BaseView;

/**
 * Created by w on 2017/6/21.
 */

public interface AboutView extends BaseView<AboutPresenter> {

    void showRateError();

    void showFeedbackError();

    void showBrowserNotFoundError();

}
