package com.start.myfreetime.base;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import com.start.myfreetime.R;
import com.tbruyelle.rxpermissions.RxPermissions;
import com.umeng.message.PushAgent;

import static anet.channel.util.Utils.context;
import static com.start.myfreetime.app.MyApplication.WRITE_EXTERNAL_STORAGE_REQUEST_CODE;

/**
 * Created by w on 2017/4/7.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(attachLayoutRes());
        initStatusBar();
        PushAgent.getInstance(this).onAppStart();

    }

    /**
     * 绑定布局文件
     *
     * @return 布局文件ID
     */
    @LayoutRes
    protected abstract int attachLayoutRes();

    private void initStatusBar() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//4.4到5.0
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }
    }

    /**
     * 添加 Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    protected void addFragment(int containerViewId, Fragment fragment,String tag) {

        if (!fragment.isAdded()) {
            getSupportFragmentManager().beginTransaction()
                    .add(containerViewId, fragment, tag)
                    .commit();
        }

    }
    /**
     * 添加 Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    protected void showFragment(int containerViewId, Fragment fragment_show,Fragment fragment_hide,
                                Fragment fragment_hide_2,Fragment fragment_hide_3) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();


        if (!fragment_show.isAdded()) {
            Log.i("showFragment","fragment未添加");
            fragmentTransaction .add(containerViewId, fragment_show) .hide(fragment_hide)
                    .hide(fragment_hide_2)
                    .hide(fragment_hide_3).show(fragment_show)
                    .commit();
        }else {
            Log.i("showFragment","fragment已添加");

            fragmentTransaction

            .hide(fragment_hide)
            .hide(fragment_hide_2)
            .hide(fragment_hide_3)
            .show(fragment_show)
            .commit();
        }
    }



    /**
     * 替换 Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    protected void replaceFragment(int containerViewId, Fragment fragment, String tag) {

        if (getSupportFragmentManager().findFragmentByTag(tag) == null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            // 设置tag
            fragmentTransaction.replace(containerViewId, fragment, tag);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            // 这里要设置tag，上面也要设置tag
            fragmentTransaction.addToBackStack(tag);
            fragmentTransaction.commit();
        } else {
            // 存在则弹出在它上面的所有fragment，并显示对应fragment
            getSupportFragmentManager().popBackStack(tag, 0);
        }
    }


    protected void replaceFragment(int containerViewId, Fragment fragment) {


            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            // 设置tag
            fragmentTransaction.replace(containerViewId, fragment);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            // 这里要设置tag，上面也要设置tag
            fragmentTransaction.commit();

    }
    public Toolbar initToolbar(String titleId,int color) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ///toolbar.inflateMenu(R.menu.base_toolbar_menu);
        toolbar.setTitle(titleId);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setBackgroundColor(color);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        return toolbar;
    }


}
