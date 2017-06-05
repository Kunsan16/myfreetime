package com.start.myfreetime.view;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.start.myfreetime.presenter.LauncherPresenter;

/**
 * Created by w on 2017/3/26.
 */

 public interface LauncherView extends BaseView<LauncherPresenter>  {

    void showLaunchImg(String bitmap, String img_tv);

    void startAnimator(ImageView imageView);
}
