package com.start.myfreetime.module;

import com.start.myfreetime.MovieDetailFragment;
import com.start.myfreetime.MovieFragment;

import dagger.Component;

/**
 * Created by w on 2017/3/31.
 */

@Component(modules = MovieDetailModule.class)
public interface MovieDetailComponent {

    void inject(MovieDetailFragment fragment);
}
