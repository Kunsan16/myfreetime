package com.start.myfreetime.module;

import com.start.myfreetime.MovieDetailFragment;
import com.start.myfreetime.fragment.MovieCommentFragment;

import dagger.Component;

/**
 * Created by w on 2017/3/31.
 */

@Component(modules = MovieCommentModule.class)
public interface MovieCommentComponent {

    void inject(MovieCommentFragment fragment);
}
