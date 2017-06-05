package com.start.myfreetime.presenter;

/**
 * Created by w on 2017/5/13.
 */

public interface SearchPresenter extends BasePresenter  {

    void loadResults(String queryWords);

    void startReading(int position);

}
