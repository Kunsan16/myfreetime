package com.start.myfreetime.http.request;

import android.util.Log;

import java.util.Map;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by zqf on 2016/11/4.
 * 创建各种类型的请求对象，包括get，post
 */

public class ConmonRequest {

    public static final MediaType JSON= MediaType.parse("application/json; charset=utf-8");

    public static Request createGetRequest(String url, RequestParams params){
        StringBuilder urlBuilder=new StringBuilder(url).append("?");
    if (params!=null){
        for (Map.Entry<String,String>entry:params.urlParams.entrySet()){
            urlBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
    }
      return new Request.Builder().url(urlBuilder.substring(0,urlBuilder.length()-1)).get().build();
    }
    public static Request createPostRequest(String url, RequestParams params){

        FormBody.Builder builder=new FormBody.Builder();
        if (params!=null){
            for (Map.Entry<String,String> entry:params.urlParams.entrySet()){
                 builder.add(entry.getKey(),entry.getValue());
            }
        }
        FormBody body=builder.build();
        return new Request.Builder().url(url).post(body).build();
    }

    public static Request createJSONPostRequest(String url, String json){

        RequestBody body = RequestBody.create(JSON, json);
        Log.e("上传json报文", String.valueOf(json));
        return new Request.Builder().url(url).post(body).build();
    }
}
