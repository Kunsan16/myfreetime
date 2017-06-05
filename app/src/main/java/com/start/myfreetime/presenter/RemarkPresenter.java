package com.start.myfreetime.presenter;

import com.start.myfreetime.bean.BeanType;

/**
 * Created by w on 2017/5/2.
 */

public interface RemarkPresenter extends BasePresenter{


    void loadResults(boolean refresh);

    void startReading(BeanType type, int position);

    void checkForFreshData();

}
