package com.start.myfreetime.http;



import com.start.myfreetime.http.listener.DisposeDataHandle;
import com.start.myfreetime.http.response.CommenJsonCallBack;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by w on 2016/11/4.
 */


public class CommonOkHttpClient {

    private static final int TIME_OUT=30;
    private static OkHttpClient mOkHttpClient;

   static {
       OkHttpClient.Builder okHttpClient=new OkHttpClient.Builder();
       okHttpClient.hostnameVerifier(new HostnameVerifier() {
           @Override
           public boolean verify(String hostname, SSLSession session) {
               return true;
           }
       });
       okHttpClient.connectTimeout(TIME_OUT, TimeUnit.SECONDS);
       okHttpClient.readTimeout(TIME_OUT, TimeUnit.SECONDS);
       okHttpClient.writeTimeout(TIME_OUT, TimeUnit.SECONDS);
       okHttpClient.followRedirects(true);
       mOkHttpClient=okHttpClient.build();
   }
    /**
     * post请求
     */
    public static void post(Request request, DisposeDataHandle handle){
        Call call=mOkHttpClient.newCall(request);
        call.enqueue(new CommenJsonCallBack(handle));
    }

    /**
     * get请求
     */
    public static void get(Request request, DisposeDataHandle handle){
        Call call=mOkHttpClient.newCall(request);
        call.enqueue(new CommenJsonCallBack(handle));

    }

    /**
     * get请求
     */
    public static void getImageStream(Request request, DisposeDataHandle handle){
        Call call=mOkHttpClient.newCall(request);
        call.enqueue(new CommenJsonCallBack(handle));

    }
}
