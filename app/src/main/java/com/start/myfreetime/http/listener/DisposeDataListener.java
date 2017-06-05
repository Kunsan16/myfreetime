package com.start.myfreetime.http.listener;


/**
 * Created by zqf on 2016/11/4.
 * 请求响应接口 DisposeDataListener
 */

public interface DisposeDataListener {

   void onSuccess(String result);

   void onFailure(String error);
}
