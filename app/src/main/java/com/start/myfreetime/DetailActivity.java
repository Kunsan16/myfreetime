package com.start.myfreetime;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jaeger.library.StatusBarUtil;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.app.Constant;
import com.start.myfreetime.base.BaseActivity;
import com.start.myfreetime.fragment.MovieCommentFragment;
import com.start.myfreetime.presenter.MovieMainDetailPresenterImp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by w on 2017/3/25.
 */

public class DetailActivity extends BaseActivity {

    DetailFragment zhihuFragment;
    MovieDetailFragment movieFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        replaceFragment();
        StatusBarUtil.setColor(this, Color.TRANSPARENT);
    }



    @Override
    protected int attachLayoutRes() {
        return R.layout.frame;
    }

    private void replaceFragment() {
        Intent intent=getIntent();
        String ret=intent.getStringExtra("zhihu");

        if ("zhihu".equals(ret)){
            zhihuFragment = new DetailFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, zhihuFragment)
                    .commit();

            DetailPresenterImp presenterImp=new DetailPresenterImp(this,zhihuFragment);
            presenterImp.setId(intent.getIntExtra("id",0));
            presenterImp.setTitle(intent.getStringExtra("title"));
           // presenterImp.setCoverUrl(intent.getStringExtra("coverUrl"));
        }else {
            movieFragment = new MovieDetailFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, movieFragment)
                    .commit();

            MovieMainDetailPresenterImp presenterImp=new MovieMainDetailPresenterImp(this,movieFragment);
            MovieMainDetailPresenterImp comment=new MovieMainDetailPresenterImp(this,new MovieCommentFragment());
            presenterImp.setId(intent.getIntExtra("id",0));
            comment.setId(intent.getIntExtra("id",0));
            Log.d("set的ID---- ",intent.getIntExtra("id",0)+"");
        }
    }

    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }
}
