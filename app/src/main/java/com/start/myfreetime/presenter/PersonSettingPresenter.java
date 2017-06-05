package com.start.myfreetime.presenter;

import android.preference.Preference;

/**
 * Created by w on 2017/5/31.
 */

public interface PersonSettingPresenter extends BasePresenter {

    void setNoPictureMode(boolean isCheck);

    void cleanGlideCache();

}
