package com.start.myfreetime.adapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.R;
import com.start.myfreetime.bean.MovieBean;
import com.start.myfreetime.utils.BitmapUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


/**
 * Created by w on 2017/5/9.
 */

public class MyCoverFlowAdapter extends CoverFlowAdapter {

    private boolean dataChanged;
    private List<Bitmap> mList=new ArrayList<>();
    private Context context;


    public MyCoverFlowAdapter(final Context context) {
           this.context=context;

        }

    public void changeBitmap() {
        dataChanged = true;

        notifyDataSetChanged();
    }
    public List<Bitmap> setImage(List<MovieBean.DataBean.MoviesBean> imgList){
        for (int i = 0; i <imgList.size() ; i++) {
            MovieBean.DataBean.MoviesBean bean=imgList.get(i);
            final String img=bean.getImg();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                        Bitmap bitmap=Glide.with(context).load(img).asBitmap().into(500,500).get();
                            mList.add(bitmap);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    }
                }).start();


        }
return mList;

    }



    @Override
    public int getCount() {
        return dataChanged ? 3 : 8;
    }

    @Override
    public Bitmap getImage(final int position) {
        Bitmap bitmap = null;
        Log.e("bitmap的list>0" ,mList.size()+"");
        if (mList.size()>0){
          bitmap=mList.get(position);
      }
        return  bitmap;
    }


}
