package com.start.myfreetime;


import android.content.Context;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.adapter.MovieCtxAdapter;
import com.start.myfreetime.adapter.ViewPagerAdapter;
import com.start.myfreetime.app.Constant;
import com.start.myfreetime.app.db.NewsDao;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.bean.MovieCommentBean;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.fragment.MovieCinemalFragment;
import com.start.myfreetime.fragment.MovieCommentFragment;
import com.start.myfreetime.fragment.MovieContentFragment;
import com.start.myfreetime.fragment.MovieCopyFragment;
import com.start.myfreetime.module.DaggerMovieDetailComponent;
import com.start.myfreetime.module.DaggerNewsComponent;
import com.start.myfreetime.module.MovieDetailComponent;
import com.start.myfreetime.module.MovieDetailModule;
import com.start.myfreetime.module.NewsComponent;
import com.start.myfreetime.module.ZhihuModule;
import com.start.myfreetime.presenter.MovieMainDetailPresenter;
import com.start.myfreetime.presenter.MovieMainDetailPresenterImp;
import com.start.myfreetime.utils.SharedPreferencesUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import io.realm.Realm;

/**
 * Created by w on 2017/3/25.
 */

public class MovieDetailFragment extends BaseFragment<MovieMainDetailPresenter> implements MovieDetailView {


    private ImageView imageView;
    private TextView movieDra,movieNm,movieDate,movieAct;
    private  JCVideoPlayerStandard jcVideoPlayerStandard;
    private NestedScrollView scrollView;
    private CollapsingToolbarLayout toolbarLayout;
    private List<String> list_title;
    private List<Fragment> list_fragment;
    private Context context;
    private NewsDao newsDao;
    private Realm mRealm;


    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    @Inject
    ViewPagerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context=getContext();
        mRealm = Realm.getDefaultInstance();
        newsDao = new NewsDao(mRealm);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.universal_movie_layout,container,false);
        ButterKnife.bind(this,view);
        mPresenter.requestMovieDetail();
        mPresenter.requestCinemal();
        initViews(view);


        return view;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_more, menu);

        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        return true;
    }


    @Override
    public void showMovieData(MovieDetailBean.DataBean.MovieDetailModelBean bean) {
        Uri uri = Uri.parse( bean.getImg() );
        //movieDra.setText(Html.fromHtml(bean.getDra()));
       // movieDate.setText("上映日期："+bean.getRt());
       // movieAct.setText("演员："+bean.getStar());
       // movieNm.setText("电影名称："+bean.getNm());
        // webview.loadDataWithBaseURL("x-data://base",bean.getDra(),"text/html","utf-8",null);
        SharedPreferencesUtils.put(getActivity(), Constant.MOVIE_TITLE,bean.getNm());
        SharedPreferencesUtils.put(getActivity(), Constant.MOVIE_CONTENT,bean.getDra());
        SharedPreferencesUtils.put(getActivity(), Constant.MOVIE_DATE,bean.getRt());
        jcVideoPlayerStandard.setUp(bean.getVd()
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL,bean.getScm());
        jcVideoPlayerStandard.thumbImageView.setImageURI(uri);




    }

    @Override
    public void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data) {
        SharedPreferencesUtils.put(getActivity(), Constant.MOVIE_COMMENT,new Gson().toJson(data));
    }

    @Override
    public void showMovieComment(List<MovieCommentBean.DataBean.CommentResponseModelBean.CmtsBean> list) {

    }


    @Override
    public void setPresenter(MovieMainDetailPresenter presenter) {
        if (presenter != null) {
            this.mPresenter = presenter;
        }
    }

    @Override
    public void initViews(View view) {
        list_title = new ArrayList<>();
        list_title.add(getString(R.string.movie_content));
        list_title.add(getString(R.string.movie_comment));

        list_fragment = new ArrayList<>();
        list_fragment.add(new MovieContentFragment());
        list_fragment.add(new MovieCommentFragment());
        MovieDetailComponent component= DaggerMovieDetailComponent.builder()
                .movieDetailModule(new MovieDetailModule(this,getActivity(),list_title,list_fragment)).build();
        component.inject(this);


        jcVideoPlayerStandard = (JCVideoPlayerStandard) view.findViewById(R.id.video);


        DetailActivity activity= (DetailActivity) getActivity();
        activity.setSupportActionBar((Toolbar) view.findViewById(R.id.toolbar));

        imageView = (ImageView) view.findViewById(R.id.image_view);

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

}
