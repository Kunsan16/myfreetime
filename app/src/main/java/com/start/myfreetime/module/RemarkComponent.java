package com.start.myfreetime.module;

import com.start.myfreetime.NewsFragment;
import com.start.myfreetime.fragment.CollectFragement;

import dagger.Component;

/**
 * Created by w on 2017/3/28.
 */
@Component(modules = {RemarkModule.class})
public interface RemarkComponent {


    void inject(CollectFragement fragment);
}
