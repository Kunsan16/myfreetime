package com.start.myfreetime.module;

import com.start.myfreetime.MovieFragment;

import dagger.Component;

/**
 * Created by w on 2017/3/31.
 */

@Component(modules = MovieModule.class)
public interface MovieComponent {

    void inject(MovieFragment fragment);
}
