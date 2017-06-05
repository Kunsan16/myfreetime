package com.start.myfreetime.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.start.myfreetime.DetailActivity;
import com.start.myfreetime.bean.TopStoriesBean;
import com.start.myfreetime.bean.ZhihuDailyNews;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by long on 2016/8/24.
 * 滑动器帮助类
 */
public final class SliderHelper {

    private static final String SLIDER_KEY = "SliderKey";

    private SliderHelper() {
        throw new RuntimeException("SliderHelper cannot be initialized!");
    }

    /**
     * 初始化广告滑动器
     *
     * @param context
     * @param sliderLayout
     * @param newsBean
     */
    public static void initAdSlider(final Context context, SliderLayout sliderLayout, List<TopStoriesBean> newsBean) {
        for (TopStoriesBean adData : newsBean) {
            TextSliderView textSliderView = new TextSliderView(context);
            // initialize a SliderLayout
            textSliderView.description(adData.getTitle())
                    .image(adData.getImage())
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop)
                    .setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
                        @Override
                        public void onSliderClick(BaseSliderView slider) {
                            if (slider.getBundle() != null) {
                                TopStoriesBean adData = slider.getBundle().getParcelable(SLIDER_KEY);
                                if (adData != null) {
                                      adData.getId();
                                    Intent intent=new Intent(context, DetailActivity.class);
                                    intent.putExtra("id",adData.getId())
                                    .putExtra("title",adData.getTitle())
                                    .putExtra("coverUrl",adData.getImage())
                                     .putExtra("zhihu","zhihu");
                                    context.startActivity(intent);
//                                    if (NewsUtils.isNewsPhotoSet(adData.getTag())) {
//                                        PhotoSetActivity.launch(context, adData.getUrl());
//                                    } else if (NewsUtils.isNewsSpecial(adData.getTag())) {
//                                        SpecialActivity.launch(context, adData.getUrl());
//                                    } else {
////                                        NewsDetailActivity.launch(context, adData.getUrl());
//                                        NewsArticleActivity.launch(context, adData.getUrl());
//                                    }
                                }
                            }

                        }
                    });

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putParcelable(SLIDER_KEY, adData);
            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(4000);
    }
}
