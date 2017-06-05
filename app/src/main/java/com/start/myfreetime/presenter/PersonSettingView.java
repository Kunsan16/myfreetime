package com.start.myfreetime.presenter;

import android.view.View;

import com.start.myfreetime.view.BaseView;

/**
 * Created by w on 2017/5/31.
 */

public interface PersonSettingView extends BaseView<PersonSettingPresenter> {

        void cleanGlideCacheDone(String cache);
}
