package com.start.myfreetime.presenter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;

import android.support.v7.app.AppCompatActivity;


import com.start.myfreetime.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by w on 2017/6/21.
 */

public class AboutPresenterImp implements AboutPresenter {


    private AboutView view;
    private AppCompatActivity activity;
    private SharedPreferences sp;
//    private CustomTabsIntent.Builder customTabsIntent;

    public AboutPresenterImp(AppCompatActivity activity, AboutView view) {
        this.activity = activity;
        this.view = view;
        this.view.setPresenter(this);
        sp = activity.getSharedPreferences("user_settings",MODE_PRIVATE);

//        customTabsIntent = new CustomTabsIntent.Builder();
//        customTabsIntent.setToolbarColor(activity.getResources().getColor(R.color.colorPrimary));
//        customTabsIntent.setShowTitle(true);

    }


    @Override
    public void rate() {
        try {
            Uri uri = Uri.parse("market://details?id=" + activity.getPackageName());
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(intent);
        } catch (android.content.ActivityNotFoundException ex){
            view.showRateError();
        }
    }

    @Override
    public void openLicense() {

    }

    @Override
    public void followOnGithub() {

    }

    @Override
    public void followOnZhihu() {

    }

    @Override
    public void feedback() {
            try{
                Uri uri = Uri.parse(activity.getString(R.string.sendto));
                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra(Intent.EXTRA_SUBJECT, activity.getString(R.string.mail_topic));
                intent.putExtra(Intent.EXTRA_TEXT,
                        activity.getString(R.string.device_model) + Build.MODEL + "\n"
                                + activity.getString(R.string.sdk_version) + Build.VERSION.RELEASE + "\n"
                                + activity.getString(R.string.version));
                activity.startActivity(intent);
            }catch (android.content.ActivityNotFoundException ex){
                view.showFeedbackError();
            }
    }

    @Override
    public void donate() {

    }

    @Override
    public void showEasterEgg() {

    }

    @Override
    public void start() {

    }
}
