package com.start.myfreetime;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
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

import butterknife.BindView;
import butterknife.ButterKnife;


public class LauncherActivity extends Activity implements LauncherView {

    private ImageView iv_start;
    private TextView tv_start;
    private LauncherPresenter presenter;
    private String url;
    @BindView(R.id.start_skip_count_down)
    TextView mCountDownTextView;
    private MyCountDownTimer mCountDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lancher);
        ButterKnife.bind(this);
        iv_start= (ImageView) findViewById(R.id.iv_start);
        tv_start= (TextView) findViewById(R.id.tv_start);
      LauncherPresenterImp presenterImp=new LauncherPresenterImp(this,LauncherActivity.this,iv_start);

        presenter.start();

        startAnimator(iv_start);
        mCountDownTextView.setText("5s 跳过");
        //创建倒计时类
        mCountDownTimer = new MyCountDownTimer(5000, 1000);
        mCountDownTimer.start();
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

    @Override
    protected void onDestroy() {

        if (mCountDownTimer != null) {
            mCountDownTimer.cancel();
        }
        super.onDestroy();
    }

    class MyCountDownTimer extends CountDownTimer {
        /**
         * @param millisInFuture
         *      表示以「 毫秒 」为单位倒计时的总数
         *      例如 millisInFuture = 1000 表示1秒
         *
         * @param countDownInterval
         *      表示 间隔 多少微秒 调用一次 onTick()
         *      例如: countDownInterval = 1000 ; 表示每 1000 毫秒调用一次 onTick()
         *
         */

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }


        public void onFinish() {
            mCountDownTextView.setText("0s 跳过");
        }

        public void onTick(long millisUntilFinished) {
            mCountDownTextView.setText( millisUntilFinished / 1000 + "s 跳过");
        }

    }
}
