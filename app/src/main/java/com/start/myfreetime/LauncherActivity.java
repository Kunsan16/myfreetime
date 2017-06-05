package com.start.myfreetime;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.ViewPropertyAnimation;
import com.start.myfreetime.presenter.LauncherPresenter;
import com.start.myfreetime.presenter.LauncherPresenterImp;
import com.start.myfreetime.view.LauncherView;


public class LauncherActivity extends Activity implements LauncherView {

    private ImageView iv_start;
    private TextView tv_start;
    private LauncherPresenter presenter;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lancher);
        iv_start= (ImageView) findViewById(R.id.iv_start);
        tv_start= (TextView) findViewById(R.id.tv_start);
      LauncherPresenterImp presenterImp=new LauncherPresenterImp(this,LauncherActivity.this,iv_start);

        presenter.start();

        startAnimator(iv_start);

    }


    @Override
    public void showLaunchImg(String img_url, String img_tv) {
        tv_start.setText(img_tv);
        Glide.with(this)
                .load(img_url)
                .centerCrop()
                .animate(animationObject)
                .into(iv_start);
    }

    @Override
    public void startAnimator(ImageView imageView) {
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.start_activity_animation);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
             startActivity(new Intent(LauncherActivity.this, MainActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(scaleAnimation);
    }

    @Override
    public void setPresenter(LauncherPresenter presenter) {
        if (presenter != null) {
            this.presenter = presenter;
        }
    }

    @Override
    public void initViews(View view) {

    }
    ViewPropertyAnimation.Animator animationObject = new ViewPropertyAnimation.Animator() {
        @Override
        public void animate(View view) {
            // if it's a custom view class, cast it here
            // then find subviews and do the animations
            // here, we just use the entire view for the fade animation
            view.setAlpha( 0f );

            ObjectAnimator fadeAnim = ObjectAnimator.ofFloat( view, "alpha", 0f, 1f );
            fadeAnim.setDuration( 2500 );
            fadeAnim.start();
        }
    };
}
