package com.start.myfreetime.http.response;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.http.exception.OkHttpException;
import com.start.myfreetime.http.listener.DisposeDataHandle;
import com.start.myfreetime.http.listener.DisposeDataListener;


import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by zqf on 2016/11/4.
 * 处理json的响应回调
 */

public class CommenJsonCallBack implements Callback {

    protected final String RESULT_CODE="ret_code";
    protected final String RESULT_CODE_VALUE="0000";
    protected final String RESULT_MSG="服务器异常,请稍后再试";
    protected final String EMPTY_MSG="";

    private DisposeDataListener mlistener;
    private Class<?> mClass;
    private Handler mDelieverHandler;

    public CommenJsonCallBack(DisposeDataHandle handle){
        mlistener=handle.mListener;
        mClass=handle.mClass;
        mDelieverHandler=new Handler(Looper.getMainLooper());
    }

    @Override
    public void onFailure(Call call, final IOException e) {
         Logger.e("请求失败的报文",e.getMessage());
         mDelieverHandler.post(new Runnable() {
             @Override
             public void run() {
                 mlistener.onFailure(e.getMessage());
             }
         });
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {

           final String result=response.body().string();

           Log.d("服务器应答的报文",result);

           mDelieverHandler.post(new Runnable() {
            @Override
            public void run() {
                handleResponse(result);
                //mlistener.onSuccess(result);
            }
        });
    }
       private void handleResponse(String result){
           if (result == null || result.equals("")) {
               mlistener.onFailure(result);

           }else {
               mlistener.onSuccess(result);
           }


       }
}
