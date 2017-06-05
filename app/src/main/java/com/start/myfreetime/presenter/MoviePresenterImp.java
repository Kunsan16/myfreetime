package com.start.myfreetime.presenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.DetailActivity;
import com.start.myfreetime.OnStringListener;
import com.start.myfreetime.bean.Api;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.StringModelImpl;
import com.start.myfreetime.bean.ZhihuDailyNews;
import com.start.myfreetime.view.MovieView;
import com.start.myfreetime.view.NewsView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by w on 2017/3/31.
 */

public class MoviePresenterImp implements MoviePresenter {

    StringModelImpl model;
    MovieView view;
    private Context context;
    private ArrayList<MovieBean.DataBean.MoviesBean> list = new ArrayList<MovieBean.DataBean.MoviesBean>();

    public MoviePresenterImp(MovieView view,Context context){
        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        model = new StringModelImpl(context);
    }

    @Override
    public void start() {
        model.getMovieData(Api.MOVIE_RANKING, new OnStringListener() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                MovieBean post = gson.fromJson(result, MovieBean.class);
                for (MovieBean.DataBean.MoviesBean item : post.getData().getMovies()) {
                    list.add(item);
                }

                view.showResults(list);
            }

            @Override
            public void onError(String error) {
                Logger.e(error);
            }
        });
    }

    @Override
    public void queryMovie(ArrayList<MovieBean.DataBean.MoviesBean> qlist, String movieTitle) {

        if ("".equals(movieTitle)){
            view.showResults(qlist);
            return;
        }
        for (int i = 0; i <qlist.size() ; i++) {
            MovieBean.DataBean.MoviesBean item=qlist.get(i);
            Log.e("发生改变3",item.getNm());
            if (item.getNm().contains(movieTitle)){
                Log.e("发生改变2",movieTitle);
                view.showQueryResult(item);

            }
        }

    }

    @Override
    public void startReading(ArrayList<MovieBean.DataBean.MoviesBean> list, int position) {

        context.startActivity(new Intent(context, DetailActivity.class)
                .putExtra("id",list.get(position).getId())
                .putExtra("title",list.get(position).getNm())
                .putExtra("coverUrl",list.get(position).getImg()));
    }
}
