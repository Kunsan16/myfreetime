package com.start.myfreetime.module;

import com.start.myfreetime.MovieFragment;
import com.start.myfreetime.fragment.MovieCopyFragment;

import dagger.Component;

/**
 * Created by w on 2017/3/31.
 */

@Component(modules = MovieCopyModule.class)
public interface MovieCopyComponent {

    void inject(MovieCopyFragment fragment);
}
