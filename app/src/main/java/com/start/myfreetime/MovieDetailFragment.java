package com.start.myfreetime;


import android.content.Context;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
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
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.adapter.MovieCtxAdapter;
import com.start.myfreetime.bean.MovieDetailBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by w on 2017/3/25.
 */

public class MovieDetailFragment extends Fragment implements DetailView {

    DetailPresenter presenterImp;
    private ImageView imageView;
    private TextView movieDra,movieNm,movieDate,movieAct;
    private  JCVideoPlayerStandard jcVideoPlayerStandard;
    private NestedScrollView scrollView;
    private CollapsingToolbarLayout toolbarLayout;


    private Context context;

    private MovieCtxAdapter adapter;

    EasyRecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context=getContext();

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.universal_movie_layout,container,false);
        ButterKnife.bind(this,view);
        initViews(view);
        presenterImp.requestDetail();

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
        if (id == R.id.action_more) {

            final BottomSheetDialog dialog = new BottomSheetDialog(getActivity());

            View view = getActivity().getLayoutInflater().inflate(R.layout.reading_actions_sheet, null);

            if (presenterImp.queryIfIsBookmarked()) {

                ((ImageView) view.findViewById(R.id.imageView))
                        .setColorFilter(getContext().getResources().getColor(R.color.colorPrimary));
            }

            // add to bookmarks or delete from bookmarks
            view.findViewById(R.id.layout_bookmark).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    presenterImp.addToOrDeleteFromBookmarks();
                }
            });

            // copy the article's link to clipboard
            view.findViewById(R.id.layout_copy_link).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    presenterImp.copyLink();
                }
            });

            // open the link in browser
            view.findViewById(R.id.layout_open_in_browser).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    presenterImp.openInBrowser();
                }
            });

            // copy the text content to clipboard
            view.findViewById(R.id.layout_copy_text).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    presenterImp.copyText();
                }
            });

            // shareAsText the content as text
            view.findViewById(R.id.layout_share_text).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    presenterImp.shareAsText();
                }
            });

            dialog.setContentView(view);
            dialog.show();
        }
        return true;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showLoadingError() {

    }

    @Override
    public void showSharingError() {

    }

    @Override
    public void showResult(String result) {
       // webview.loadDataWithBaseURL("x-data://base",result,"text/html","utf-8",null);
    }

    @Override
    public void showResultWithoutBody(String url) {

    }

    @Override
    public void showCover(String url) {
//        Glide.with(context)
//                .load(url)
//                .asBitmap()
//                .placeholder(R.drawable.placeholder)
//                .centerCrop()
//                .error(R.drawable.placeholder)
//                .into(imageView);
    }

    @Override
    public void setTitle(String title) {
      //  setCollapsingToolbarLayoutTitle(title);
    }

    @Override
    public void showMovieData(MovieDetailBean.DataBean.MovieDetailModelBean bean) {
        Uri uri = Uri.parse( bean.getImg() );
        movieDra.setText(Html.fromHtml(bean.getDra()));
        movieDate.setText("上映日期："+bean.getRt());
        movieAct.setText("演员："+bean.getStar());
        movieNm.setText("电影名称："+bean.getNm());
        // webview.loadDataWithBaseURL("x-data://base",bean.getDra(),"text/html","utf-8",null);

        jcVideoPlayerStandard.setUp(bean.getVd()
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL,bean.getScm());
        jcVideoPlayerStandard.thumbImageView.setImageURI(uri);

    }

    @Override
    public void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data) {
        adapter.addAll(data);
    }

    @Override
    public void setImageMode(boolean showImage) {

    }

    @Override
    public void showBrowserNotFoundError() {

    }

    @Override
    public void showTextCopied() {

    }

    @Override
    public void showCopyTextError() {

    }

    @Override
    public void showWXShareFail() {

    }

    @Override
    public void showAddedToBookmarks() {

    }

    @Override
    public void showDeletedFromBookmarks() {

    }

    @Override
    public void setPresenter(DetailPresenter presenter) {
        if (presenter != null) {
            this.presenterImp = presenter;
        }
    }

    @Override
    public void initViews(View view) {


        movieDra= (TextView) view.findViewById(R.id.tv_movie_dra);
        movieNm= (TextView) view.findViewById(R.id.tv_movie_nm);
        movieAct= (TextView) view.findViewById(R.id.tv_movie_actor);
        movieDate= (TextView) view.findViewById(R.id.tv_movie_date);
        recyclerView= (EasyRecyclerView) view.findViewById(R.id.ctx_recyclerview) ;
        jcVideoPlayerStandard = (JCVideoPlayerStandard) view.findViewById(R.id.video);


        DetailActivity activity= (DetailActivity) getActivity();
        activity.setSupportActionBar((Toolbar) view.findViewById(R.id.toolbar));
//        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) view.findViewById(R.id.image_view);
//        scrollView = (NestedScrollView) view.findViewById(R.id.scrollView);
//        toolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.toolbar_layout);
        adapter=new MovieCtxAdapter(context);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager=new LinearLayoutManager(getActivity());
        manager.setSmoothScrollbarEnabled(true);
        manager.setAutoMeasureEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        recyclerView.setLayoutManager(manager);

        SpaceDecoration itemDecoration = new SpaceDecoration((int) PixUtil.convertDpToPixel(8, getContext()));
        itemDecoration.setPaddingEdgeSide(true);
        itemDecoration.setPaddingStart(true);

        recyclerView.addItemDecoration(itemDecoration);

    }



    private void setCollapsingToolbarLayoutTitle(String title) {
        toolbarLayout.setTitle(title);
        toolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        toolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        toolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBarPlus1);
        toolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBarPlus1);
    }
}
