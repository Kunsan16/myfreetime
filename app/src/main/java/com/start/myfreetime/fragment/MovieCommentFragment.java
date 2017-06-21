package com.start.myfreetime.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.start.myfreetime.MovieDetailView;
import com.start.myfreetime.PixUtil;
import com.start.myfreetime.R;
import com.start.myfreetime.adapter.MovieCtxAdapter;
import com.start.myfreetime.app.Constant;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.bean.MovieCommentBean;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.module.DaggerMovieCommentComponent;
import com.start.myfreetime.module.DaggerMovieDetailComponent;
import com.start.myfreetime.module.MovieCommentComponent;
import com.start.myfreetime.module.MovieCommentModule;
import com.start.myfreetime.module.MovieDetailComponent;
import com.start.myfreetime.module.MovieDetailModule;
import com.start.myfreetime.presenter.MovieMainDetailPresenter;
import com.start.myfreetime.utils.SharedPreferencesUtils;
import com.start.myfreetime.view.CommentDialogFragment;

import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by w on 2017/6/1.
 */

public class MovieCommentFragment extends BaseFragment<MovieMainDetailPresenter> implements MovieDetailView {

    @BindView(R.id.ctx_recyclerview)
    EasyRecyclerView recyclerView;
    private MovieCtxAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.movie_comment_layout,container,false);
        ButterKnife.bind(this,view);
        MovieCommentComponent component= DaggerMovieCommentComponent.builder()
                .movieCommentModule(new MovieCommentModule(this,getActivity())).build();
        component.inject(this);

        mPresenter .requestMovieCmts(0,0);
//
//        List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data= new Gson().fromJson( SharedPreferencesUtils.get(getActivity(), Constant.MOVIE_COMMENT,"")+""
//                , new TypeToken<List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean>>(){}.getType());
        adapter=new MovieCtxAdapter(getActivity());
       // adapter.addAll(data);
        final View view_footer = LayoutInflater.from(mContext).inflate(R.layout.view_more, null);

        adapter.addFooter(new RecyclerArrayAdapter.ItemView() {
            @Override
            public View onCreateView(ViewGroup parent) {
                return view_footer;
            }

            @Override
            public void onBindView(View headerView) {

            }
        });
        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            boolean isSlidingToLast = false;
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    // 获取最后一个完全显示的item position
                    int lastVisibleItem = manager.findLastCompletelyVisibleItemPosition();
                    int totalItemCount = manager.getItemCount();

                    // 判断是否滚动到底部并且是向下滑动
                    if (lastVisibleItem == (totalItemCount - 1) && isSlidingToLast) {

                        mPresenter.requestMoreCommt(adapter.getCount(),1);

                    }
                }
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                isSlidingToLast = dy > 0;
                super.onScrolled(recyclerView, dx, dy);

            }
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        SpaceDecoration itemDecoration = new SpaceDecoration((int) PixUtil.convertDpToPixel(8, getContext()));
        itemDecoration.setPaddingEdgeSide(true);
        itemDecoration.setPaddingStart(true);

        recyclerView.addItemDecoration(itemDecoration);
        return view;
    }

    @Override
    public void showMovieData(MovieDetailBean.DataBean.MovieDetailModelBean bean) {

    }

    @Override
    public void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data) {

    }

    @Override
    public void showMovieComment(final List<MovieCommentBean.DataBean.CommentResponseModelBean.CmtsBean> list) {

        adapter.addAll(list);
         if (!list.isEmpty()) {
             adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
                 @Override
                 public void onItemClick(int position) {

                     CommentDialogFragment fragment = new CommentDialogFragment();
                     Bundle bundle = new Bundle();
                     bundle.putString("user_icon", adapter.getAllData().get(position).getAvatarurl());
                     bundle.putString("user_id", adapter.getAllData().get(position).getNickName());
                     bundle.putString("user_comment", adapter.getAllData().get(position).getContent());
                     fragment.setArguments(bundle);
                     fragment.show(getChildFragmentManager(), "k");

                 }
             });
         }
        list.clear();
    }

    @Override
    public void setPresenter(MovieMainDetailPresenter presenter) {
         this.mPresenter=presenter;
    }
}
