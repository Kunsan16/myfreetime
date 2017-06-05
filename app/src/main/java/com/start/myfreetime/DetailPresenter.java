package com.start.myfreetime;

import android.webkit.WebView;

import com.start.myfreetime.presenter.BasePresenter;

/**
 * Created by w on 2017/3/25.
 */

interface DetailPresenter extends BasePresenter {

    void openInBrowser();

    void shareAsText();

    void openUrl(WebView webView, String url);

    void copyText();

    void copyLink();

    void addToOrDeleteFromBookmarks();

    boolean queryIfIsBookmarked();

    void requestData();

    void requestDetail();

    void requestContent();

    void shareToWX();

    void shareToWXFriend();

}
