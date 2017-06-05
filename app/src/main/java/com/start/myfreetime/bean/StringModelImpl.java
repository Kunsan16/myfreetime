/*
 * Copyright 2017 lizhaotailang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.start.myfreetime.bean;

import android.content.Context;
import android.util.Log;

import com.orhanobut.logger.Logger;
import com.start.myfreetime.http.CommonOkHttpClient;
import com.start.myfreetime.OnStringListener;
import com.start.myfreetime.http.listener.DisposeDataHandle;
import com.start.myfreetime.http.listener.DisposeDataListener;
import com.start.myfreetime.http.request.ConmonRequest;


/**
 * Created by Lizhaotailang on 2016/9/15.
 */

public class StringModelImpl {

    private Context context;

    public StringModelImpl(Context context) {
        this.context = context;
    }

    public void load(String url, final OnStringListener listener) {

        CommonOkHttpClient.get(ConmonRequest.createGetRequest(url,null),new DisposeDataHandle(new DisposeDataListener() {
            @Override
            public void onSuccess(String responseObj) {
                Log.e("回调结果",responseObj);
                listener.onSuccess(responseObj);
            }

            @Override
            public void onFailure(String reasonObj) {
                Logger.e("reasonObj",reasonObj);
                listener.onError(reasonObj);
            }
        }));

    }


    public void launch(String url, final OnStringListener listener) {


        CommonOkHttpClient.get(ConmonRequest.createGetRequest(url,null),new DisposeDataHandle(new DisposeDataListener() {
            @Override
            public void onSuccess(String responseObj) {

                listener.onSuccess(responseObj);
            }

            @Override
            public void onFailure(String reasonObj) {

                listener.onError(reasonObj);
            }
        }));
    }

    public void getMovieData(String url, final OnStringListener listener) {

        CommonOkHttpClient.get(ConmonRequest.createGetRequest(url,null),new DisposeDataHandle(new DisposeDataListener() {
            @Override
            public void onSuccess(String responseObj) {
                Logger.e(responseObj);
                listener.onSuccess(responseObj);
            }

            @Override
            public void onFailure(String reasonObj) {

                listener.onError(reasonObj);
            }
        }));
    }

    public void getMovieDetail(String url, final OnStringListener listener) {

        CommonOkHttpClient.get(ConmonRequest.createGetRequest(url,null),new DisposeDataHandle(new DisposeDataListener() {
            @Override
            public void onSuccess(String responseObj) {
                listener.onSuccess(responseObj);
            }

            @Override
            public void onFailure(String reasonObj) {

                listener.onError(reasonObj);
            }
        }));
    }
}
