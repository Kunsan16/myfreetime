package com.start.myfreetime.http.listener;

/**
 * Created by zqf on 2016/11/4.
 * 处理响应
 */

public class DisposeDataHandle {

    public DisposeDataListener mListener=null;
    public Class<?> mClass;

    public DisposeDataHandle(DisposeDataListener listener){
        mListener=listener;
    }

    public DisposeDataHandle(DisposeDataListener listener,Class<?> clazz){
        mListener=listener;
        mClass=clazz;
    }
}
