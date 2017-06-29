package com.start.myfreetime;


import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.bean.MovieDetailBean;
import com.start.myfreetime.utils.WXShareUtils;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;

import java.util.List;

/**
 * Created by w on 2017/3/25.
 */

public class DetailFragment extends Fragment implements DetailView {

    DetailPresenter presenterImp;
    private ImageView imageView;
    private WebView webView;
    private NestedScrollView scrollView;
    private CollapsingToolbarLayout toolbarLayout;
    private SwipeRefreshLayout refreshLayout;
    private WXShareUtils weChatShareUtil;
    private Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context=getContext();
        weChatShareUtil = WXShareUtils.getInstance(getActivity());
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.universal_read_layout,container,false);

        initViews(view);
        presenterImp.requestData();
       // presenterImp.requestDetail();
        setHasOptionsMenu(true);
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
            View view = View.inflate(getActivity(), R.layout.share_bottom_sheet, null);
            dialog.setContentView(view);

            CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) ((View) view.getParent())
                    .getLayoutParams();
            CoordinatorLayout.Behavior behavior = params.getBehavior();
            ((View) view.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));


            if (presenterImp.queryIfIsBookmarked()) {
                ((TextView) view.findViewById(R.id.textView)).setText(R.string.action_delete_from_bookmarks);
                ((ImageView) view.findViewById(R.id.imageView))
                        .setColorFilter(getContext().getResources().getColor(R.color.colorPrimary));
            }else {
                ((TextView) view.findViewById(R.id.textView)).setText(R.string.action_add_to_bookmarks);
            }

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

                    presenterImp.shareToWX();

                }
            });

            // open the link in browser
            view.findViewById(R.id.layout_open_in_browser).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    presenterImp.shareToWXFriend();
                }
            });

            // copy the text content to clipboard


            // shareAsText the content as text

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
           webView.loadDataWithBaseURL("x-data://base",result,"text/html","utf-8",null);
    }

    @Override
    public void showResultWithoutBody(String url) {

    }

    @Override
    public void showCover(String url) {
        Glide.with(context)
                .load(url)
                .asBitmap()
                .placeholder(R.drawable.placeholder)
                .centerCrop()
                .error(R.drawable.placeholder)
                .into(imageView);
    }

    @Override
    public void setTitle(String title) {
        setCollapsingToolbarLayoutTitle(title);
    }

    @Override
    public void showMovieData(MovieDetailBean.DataBean.MovieDetailModelBean bean) {

    }

    @Override
    public void showMovieContent(List<MovieDetailBean.DataBean.CommentResponseModelBean.CmtsBean> data) {

    }

    @Override
    public void setImageMode(boolean showImage) {
        webView.getSettings().setBlockNetworkImage(showImage);
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
        Toast.makeText(getActivity(), "没有检测到微信", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAddedToBookmarks() {
        Toast.makeText(getActivity(),"收藏成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDeletedFromBookmarks() {
        Toast.makeText(getActivity(),"取消收藏",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(DetailPresenter presenter) {
        if (presenter != null) {
            this.presenterImp = presenter;
        }
    }

    @Override
    public void initViews(View view) {

        refreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.refreshLayout);
        refreshLayout.setColorSchemeColors(getResources().getColor(R.color.colorPrimary));

        webView= (WebView) view.findViewById(R.id.web_view);
        webView.setScrollbarFadingEnabled(true);

        DetailActivity activity= (DetailActivity) getActivity();
        activity.setSupportActionBar((Toolbar) view.findViewById(R.id.toolbar));
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) view.findViewById(R.id.image_view);
        scrollView = (NestedScrollView) view.findViewById(R.id.scrollView);
        toolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.toolbar_layout);

        //能够和js交互
        webView.getSettings().setJavaScriptEnabled(true);
        //缩放,设置为不能缩放可以防止页面上出现放大和缩小的图标
        webView.getSettings().setBuiltInZoomControls(false);
        //缓存
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        //开启DOM storage API功能
        webView.getSettings().setDomStorageEnabled(true);
        //开启application Cache功能
        webView.getSettings().setAppCacheEnabled(false);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return true;


            }
        });
    }

    private void setCollapsingToolbarLayoutTitle(String title) {
        toolbarLayout.setTitle(title);
        toolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        toolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        toolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBarPlus1);
        toolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBarPlus1);
    }

}
