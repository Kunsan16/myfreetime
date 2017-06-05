package com.start.myfreetime;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.app.db.NewsDao;
import com.start.myfreetime.bean.Api;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.StringModelImpl;
import com.start.myfreetime.bean.ZhihuDailyNewsHistory;
import com.start.myfreetime.bean.ZhihuDailyStory;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;
import com.start.myfreetime.utils.NetWorkUtils;
import com.start.myfreetime.utils.WXShareUtils;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by w on 2017/3/25.
 */

public class DetailPresenterImp implements DetailPresenter {


    private DetailView view;
    private StringModelImpl model;
    private Context context;
    private SharedPreferences sp;

    private int id;
    private String shareUrl;
    private String title;
    private String coverUrl;
    private ArrayList<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> list =new ArrayList<>();
    private ZhihuDailyStory zhihuDailyStory;
    private NewsDao newsDao;
    private Realm mRealm;

    private  boolean isExistId;

    public DetailPresenterImp(Context context,DetailView view){
        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        model = new StringModelImpl(context);
        sp = context.getSharedPreferences("user_settings", MODE_PRIVATE);
        mRealm = Realm.getDefaultInstance();
        newsDao = new NewsDao(mRealm);
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public void openInBrowser() {

    }

    @Override
    public void shareAsText() {

    }

    @Override
    public void openUrl(WebView webView, String url) {

    }

    @Override
    public void copyText() {

    }

    @Override
    public void copyLink() {

    }

    //添加收藏或取消收藏
    @Override
    public void addToOrDeleteFromBookmarks() {

        boolean isExistId=newsDao.addToOrDeleteByNewsId(id,title,coverUrl);
        if (isExistId){
            view.showDeletedFromBookmarks();
        }else {
            view.showAddedToBookmarks();
        }
    }

    @Override
    public boolean queryIfIsBookmarked() {
        List<ZhihuNewsRemarkBean> list=mRealm.where(ZhihuNewsRemarkBean.class).equalTo("id",id).findAll();
        if (list.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public void requestData() {
        view.setTitle(title);

        view.setImageMode(sp.getBoolean("no_picture_mode",false));
        Logger.d(id+"");
        if (NetWorkUtils.isConnected(context)) {
            model.load(Api.ZHIHU_NEWS_DETAIL + id, new OnStringListener() {
                @Override
                public void onSuccess(String result) {
                    Gson gson = new Gson();
                    zhihuDailyStory = gson.fromJson(result, ZhihuDailyStory.class);
                    shareUrl=zhihuDailyStory.getShare_url();
                    coverUrl=zhihuDailyStory.getImage();
                    view.showCover(coverUrl);
                    view.showResult(convertZhihuContent(zhihuDailyStory.getBody()));
                }

                @Override
                public void onError(String error) {

                }
            });
        }else{

            List<ZhihuDailyStory> qList= mRealm.where(ZhihuDailyStory.class).equalTo("id",id).findAll();
            view.showResult(convertZhihuContent(qList.get(0).getBody()));
        }
    }

    @Override
    public void requestDetail() {
        view.setTitle(title);
       // view.showCover(coverUrl);
        model.getMovieDetail(Api.MOVIE_DETAIL + id+".json", new OnStringListener() {
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
    public void requestContent() {

    }

    @Override
    public void shareToWX() {
        boolean result=WXShareUtils.getInstance(context).shareUrl(shareUrl,title,
                BitmapFactory.decodeResource(context.getResources(), R.mipmap.icon),"O(∩_∩)O", SendMessageToWX.Req.WXSceneTimeline);
        if (!result){
            view.showWXShareFail();
        }
    }

    @Override
    public void shareToWXFriend() {
        boolean result=WXShareUtils.getInstance(context).shareUrl(shareUrl,title,
                BitmapFactory.decodeResource(context.getResources(), R.mipmap.icon),"O(∩_∩)O", SendMessageToWX.Req.WXSceneSession);
        if (!result){
            view.showWXShareFail();
        }
    }

    @Override
    public void start() {

    }


    private String convertZhihuContent(String preResult) {

        preResult = preResult.replace("<div class=\"img-place-holder\">", "");
        preResult = preResult.replace("<div class=\"headline\">", "");

        // 在api中，css的地址是以一个数组的形式给出，这里需要设置
        // in fact,in api,css addresses are given as an array
        // api中还有js的部分，这里不再解析js
        // javascript is included,but here I don't use it
        // 不再选择加载网络css，而是加载本地assets文件夹中的css
        // use the css file from local assets folder,not from network
        String css = "<link rel=\"stylesheet\" href=\"file:///android_asset/zhihu_daily.css\" type=\"text/css\">";


        // 根据主题的不同确定不同的加载内容
        // load content judging by different theme
        String theme = "<body className=\"\" onload=\"onLoaded()\">";
        if ((context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK)
                == Configuration.UI_MODE_NIGHT_YES){
            theme = "<body className=\"\" onload=\"onLoaded()\" class=\"night\">";
        }

        return new StringBuilder()
                .append("<!DOCTYPE html>\n")
                .append("<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n")
                .append("<head>\n")
                .append("\t<meta charset=\"utf-8\" />")
                .append(css)
                .append("\n</head>\n")
                .append(theme)
                .append(preResult)
                .append("</body></html>").toString();
    }
}
