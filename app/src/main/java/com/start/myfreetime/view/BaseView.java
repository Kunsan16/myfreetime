package com.start.myfreetime.view;

import android.view.View;

/**
 * Created by w on 2017/3/22.
 */

public interface BaseView<T> {

    /**
     * set the presenter of mvp
     * @param presenter
     */
    void setPresenter(T presenter);

    /**
     * init the views of fragment
     * @param view
     */
    void initViews(View view);


}
