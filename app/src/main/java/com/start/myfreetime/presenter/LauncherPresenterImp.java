package com.start.myfreetime.presenter;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.OnStringListener;
import com.start.myfreetime.R;
import com.start.myfreetime.bean.Api;
import com.start.myfreetime.bean.LauncherImage;
import com.start.myfreetime.bean.StringModelImpl;
import com.start.myfreetime.utils.FileUtils;
import com.start.myfreetime.utils.NetWorkUtils;
import com.start.myfreetime.view.LauncherView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by w on 2017/3/26.
 */

public class LauncherPresenterImp implements LauncherPresenter {

    StringModelImpl model;
    LauncherView view;
    LauncherImage image;
    private Context context;
    private ImageView imageView;

    public LauncherPresenterImp(Context context, LauncherView view, ImageView imageView){
        this.context = context;
        this.view = view;
        this.imageView=imageView;
        this.view.setPresenter(this);
        model = new StringModelImpl(context);
    }

    @Override
    public void launch() {

    }

    @Override
    public void start() {
        if (NetWorkUtils.isConnected(context)){


          model.launch(Api.ZHIHU_NEWS_LAUNCH, new OnStringListener() {
              @Override
              public void onSuccess(String result) {

                  Gson gson = new Gson();
                  image=gson.fromJson(result, LauncherImage.class);

               view.showLaunchImg("http://bing.com"+image.getImages().get(0).getUrl(),image.getImages().get(0).getCopyright());
               view.startAnimator(imageView);

                  view.startAnimator(imageView);

              }

              @Override
              public void onError(String error) {

              }
          });

        }else {

         //view.showLaunchImg(BitmapFactory.decodeFile(imgFile.getAbsolutePath()),"每天读一篇好文，涨姿势，心旷神怡。By The Way！你网络没有连接哦！");
        }
    }

    public void saveImage(File file, byte[] bytes) {
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
