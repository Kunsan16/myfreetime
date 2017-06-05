package com.start.myfreetime.fragment;


import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.GridLayoutManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.MainActivity;
import com.start.myfreetime.PixUtil;
import com.start.myfreetime.R;
import com.start.myfreetime.adapter.MovieAdapter;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.bean.LocationParam;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.module.DaggerMovieCopyComponent;
import com.start.myfreetime.module.MovieComponent;
import com.start.myfreetime.module.MovieCopyComponent;
import com.start.myfreetime.module.MovieCopyModule;
import com.start.myfreetime.module.MovieModule;
import com.start.myfreetime.presenter.MoviePresenter;
import com.start.myfreetime.view.MovieView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by w on 2017/3/15.
 */

public class MovieCopyFragment extends BaseFragment<MoviePresenter> implements MovieView {


    @Inject
    MovieAdapter adapter;
    @BindView(R.id.recyclerView)
    EasyRecyclerView recyclerView;
    @BindView(R.id.tv_search_bg)
    EditText mSearchBGTxt;
    private TextView mHintTxt;
    private TextView mSearchTxt;
    private FrameLayout mContentFrame,frameBg;
    private ImageView mArrowImg;

    private boolean finishing;
    ArrayList<MovieBean.DataBean.MoviesBean> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


       View rootView = inflater.inflate(R.layout.search_copy_layout, container, false);
        ButterKnife.bind(this, rootView);

        list= (ArrayList<MovieBean.DataBean.MoviesBean>) getArguments().getSerializable("list");
        MovieCopyComponent component= DaggerMovieCopyComponent.builder().movieCopyModule(new MovieCopyModule(this,getActivity())).build();
        component.inject(this);
        initViews(rootView);
        adapter.addAll(list);
        MainActivity activity=(MainActivity)getActivity();
        activity.initToolbar("看电影",getResources().getColor(R.color.movieColor));

        return rootView;
    }



    @Override
    public void showError() {

    }

    @Override
    public void showResults(final ArrayList<MovieBean.DataBean.MoviesBean> list) {

        adapter.addAll(list);
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                mPresenter.startReading(list,position);

            }
        });
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showQueryResult(MovieBean.DataBean.MoviesBean item) {

    }

    @Override
    public void initViews(View view) {
        super.initViews(view);

        mContentFrame = (FrameLayout)view. findViewById(R.id.frame_bg);
        mSearchTxt = (TextView)view. findViewById(R.id.tv_search);
        mArrowImg = (ImageView) view.findViewById(R.id.iv_arrow);
        frameBg =  (FrameLayout)view. findViewById(R.id.frame_bg);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        SpaceDecoration itemDecoration = new SpaceDecoration((int) PixUtil.convertDpToPixel(8, getContext()));
        itemDecoration.setPaddingEdgeSide(true);
        itemDecoration.setPaddingStart(true);
        itemDecoration.setPaddingHeaderFooter(false);
        recyclerView.addItemDecoration(itemDecoration);

        mSearchBGTxt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mSearchBGTxt.getViewTreeObserver().removeOnGlobalLayoutListener(this);

                performEnterAnimation();
            }
        });
        mSearchBGTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                  mPresenter.queryMovie(list,String.valueOf(charSequence));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    float frameBgHeight = 0;
    float searchBgHeight = 0;
    private void performEnterAnimation() {

        float originY =getArguments().getInt("y");

        int location[] = new int[2];
        mSearchBGTxt.getLocationOnScreen(location);

        final float translateY = originY - (float) location[1];

        frameBgHeight = frameBg.getHeight();
        //放到前一个页面的位置
        mSearchBGTxt.setY(mSearchBGTxt.getY() + translateY);
       // mHintTxt.setY(mSearchBGTxt.getY() + (mSearchBGTxt.getHeight() - mHintTxt.getHeight()) / 2);
        mSearchTxt.setY(mSearchBGTxt.getY() + (mSearchBGTxt.getHeight()   - mSearchTxt.getHeight())/ 2);
        float top = getResources().getDisplayMetrics().density * 20;
        final ValueAnimator translateVa = ValueAnimator.ofFloat(mSearchBGTxt.getY(),  mSearchBGTxt.getY() - 100);
        searchBgHeight = mSearchBGTxt.getY();
        translateVa.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                mSearchBGTxt.setY((Float) valueAnimator.getAnimatedValue());
                ViewGroup.LayoutParams linearParams = frameBg.getLayoutParams(); //取控件textView当前的布局参数
                linearParams.height = (int) (frameBgHeight-(searchBgHeight-(Float) valueAnimator.getAnimatedValue())*2);
                frameBg.setLayoutParams(linearParams);
                mArrowImg.setY(mSearchBGTxt.getY() + (mSearchBGTxt.getHeight() - mArrowImg.getHeight()) / 2);
                //mHintTxt.setY(mSearchBGTxt.getY() + (mSearchBGTxt.getHeight() - mHintTxt.getHeight()) / 2);
                mSearchTxt.setY(mSearchBGTxt.getY() + (mSearchBGTxt.getHeight() - mSearchTxt.getHeight()) / 2);
            }
        });

        ValueAnimator scaleVa = ValueAnimator.ofFloat(1, 0.8f);
        scaleVa.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                mSearchBGTxt.setScaleX((Float) valueAnimator.getAnimatedValue());
            }
        });

        ValueAnimator alphaVa = ValueAnimator.ofFloat(0, 1f);
        alphaVa.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                mContentFrame.setAlpha((Float) valueAnimator.getAnimatedValue());
                mSearchTxt.setAlpha((Float) valueAnimator.getAnimatedValue());
                mArrowImg.setAlpha((Float) valueAnimator.getAnimatedValue());
            }
        });

        alphaVa.setDuration(500);
        translateVa.setDuration(500);
        scaleVa.setDuration(500);

        alphaVa.start();
        translateVa.start();
        scaleVa.start();

    }

}
