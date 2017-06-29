package com.start.myfreetime.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.webkit.WebView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import com.start.myfreetime.OnStringListener;
import com.start.myfreetime.R;
import com.start.myfreetime.app.db.NewsDao;
import com.start.myfreetime.bean.Api;
import com.start.myfreetime.bean.LocalCache;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.MovieCinemalBean;
import com.start.myfreetime.bean.MovieCommentBean;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.bean.StringModelImpl;
import com.start.myfreetime.bean.ZhihuDailyStory;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;
import com.start.myfreetime.utils.NetWorkUtils;
import com.start.myfreetime.utils.WXShareUtils;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.start.myfreetime.MovieDetailView;
import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by w on 2017/3/25.
 */

public class MovieMainDetailPresenterImp implements MovieMainDetailPresenter {


    private MovieDetailView view;
    private StringModelImpl model;
    private Context context;
    private int id;
    private ArrayList<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> list =new ArrayList<>();
    private ArrayList< MovieCommentBean.DataBean.CommentResponseModelBean.CmtsBean> CmtList =new ArrayList<>();


    public MovieMainDetailPresenterImp(Context context, MovieDetailView view){
        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        model = new StringModelImpl(context);
    }
    public void setId(int id) {

        this.id = id;
        LocalCache.getInstance().setId(id);
    }

    @Override
    public void start() {
        Log.d("初始化2 ",this.id+"");
    }


    @Override
    public void requestMovieDetail() {

        model.getMovieDetail(Api.MOVIE_DETAIL + this.id+".json", new OnStringListener() {
            @Override
            public void onSuccess(String result) {
                Logger.e("movie detail",result);
                Gson gson = new Gson();
                MovieDetailBean movieDetailBean=gson.fromJson(result, MovieDetailBean.class);
                MovieDetailBean.DataBean.MovieDetailModelBean item =movieDetailBean.getData().getMovieDetailModel() ;
                 MovieDetailBean.DataBean.CommentResponseModelBean bean=movieDetailBean.getData().getCommentResponseModel();

                view.showMovieData(item);
                for (MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean cmt:bean.getCmts()){
                    list.add(cmt);
                }
                view.showMovieContent(list);
            }

            @Override
            public void onError(String error) {

            }
        });
    }

    @Override
    public void requestMoreCommt(int total,int offset) {

       requestMovieCmts(total,offset);
    }

    @Override
    public void requestMovieCmts(int offset,int offsetPlus) {
        int mv_id =LocalCache.getInstance().getId();
        Log.d("评论加载更多",offset+""+"-----"+offsetPlus);
        model.getMovieDetail(Api.MOVIE_COMMENT+mv_id+"&limit=10&offset="+offset+offsetPlus, new OnStringListener() {

            @Override
            public void onSuccess(String result) {

                Logger.e("movie comment",result);
                Gson gson = new Gson();
                MovieCommentBean movieDetailBean=gson.fromJson(result, MovieCommentBean.class);
                for (MovieCommentBean.DataBean.CommentResponseModelBean.CmtsBean cmts:movieDetailBean.getData().getCommentResponseModel().getCmts()){
                    CmtList.add(cmts);
                }
                Log.d("评论加载更多size",CmtList.size()+"");
                view.showMovieComment(CmtList);
            }

            @Override
            public void onError(String error) {

            }
        });
    }

    @Override
    public void requestCinemal() {
        model.getMovieDetail(Api.MOVIE_CINEMAL, new OnStringListener() {

            @Override
            public void onSuccess(String result) {

                Logger.e("movie -----------------",result);
                Gson gson=new Gson();
                MovieCinemalBean bean=gson.fromJson(result,MovieCinemalBean.class);

            }

            @Override
            public void onError(String error) {

            }
        });
    }
}
