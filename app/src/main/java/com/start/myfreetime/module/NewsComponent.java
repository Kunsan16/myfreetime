package com.start.myfreetime.module;

import com.start.myfreetime.NewsFragment;

import dagger.Component;

/**
 * Created by w on 2017/3/28.
 */
@Component(modules = {ZhihuModule.class})
public interface NewsComponent {


    void inject(NewsFragment fragment);
}
