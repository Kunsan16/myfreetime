package com.start.myfreetime.presenter;



/**
 * Created by w on 2017/3/25.
 */

public interface MovieMainDetailPresenter extends BasePresenter {

    void requestMovieDetail();

    void requestMoreCommt(int total,int offset);

    void requestMovieCmts(int offset,int offsetPlus);

    void requestCinemal();

}
