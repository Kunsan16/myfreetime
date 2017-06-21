package com.start.myfreetime;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.start.myfreetime.base.BaseActivity;
import com.start.myfreetime.fragment.CollectFragement;
import com.start.myfreetime.fragment.PersonFragement;
import com.start.myfreetime.presenter.MoviePresenterImp;
import com.start.myfreetime.presenter.NewsPresenterImp;
import com.start.myfreetime.presenter.PersonSettingPresenterImp;
import com.start.myfreetime.presenter.RemarkPresenterImp;
import com.start.myfreetime.service.CacheService;

import java.util.Arrays;
import java.util.List;

import static com.start.myfreetime.app.MyApplication.WRITE_EXTERNAL_STORAGE_REQUEST_CODE;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private NewsPresenterImp presenterImp;
    private MoviePresenterImp moviePresenterImp;
    private RemarkPresenterImp remarkPresenterImp;
    private PersonSettingPresenterImp personSettingPresenterImp;

    private DrawerLayout drawer;
    private List<Fragment> fragmentList;
    private ViewPager viewPager;
    private BottomBar bottomBar;
    private long mExitTime = 0;
    public   Toolbar toolbar;
    private NewsFragment zhihuFragment;
    private MovieFragment movieFragment;
    private CollectFragement collectFragement;
    private PersonFragement personFragement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        startService(new Intent(this, CacheService.class));


        setSupportActionBar(toolbar);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_camera);
        initFragment();

       // addFragment(R.id.fragment_container,fragment,"zhihu");

         presenterImp = new NewsPresenterImp(this, zhihuFragment);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            //申请WRITE_EXTERNAL_STORAGE权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    WRITE_EXTERNAL_STORAGE_REQUEST_CODE);
        }
        initBottomBar();
          }

    private void initFragment() {
        if (zhihuFragment==null){
            zhihuFragment=NewsFragment.newInstance();
        }
        if (movieFragment==null){
            movieFragment=MovieFragment.newInstance();
        }
        if (collectFragement==null){
            collectFragement=CollectFragement.newInstance();
        }
        if (personFragement==null){
            personFragement=PersonFragement.newInstance();
        }
    }


    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_main;
    }

    private void initBottomBar() {


        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {


                switch (tabId) {
                    case R.id.bm1:
                        showFragment(R.id.fragment_container,zhihuFragment,movieFragment,collectFragement,personFragement);
                        break;
                    case R.id.bm2:
                         new MoviePresenterImp(movieFragment,MainActivity.this);
                        showFragment(R.id.fragment_container,movieFragment,zhihuFragment,collectFragement,personFragement);

                        break;

                    case R.id.bm3:

                        new RemarkPresenterImp(MainActivity.this, collectFragement);
                        showFragment(R.id.fragment_container,collectFragement,zhihuFragment,movieFragment,personFragement);



                        break;

                    case R.id.bm4:
                        new PersonSettingPresenterImp(MainActivity.this,personFragement);
                        showFragment(R.id.fragment_container,personFragement,zhihuFragment,movieFragment,collectFragement);



                        break;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

        } else if (id == R.id.nav_gallery) {



        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        // 获取堆栈里有几个
        final int stackEntryCount = getSupportFragmentManager().getBackStackEntryCount();
        Logger.i("Fragment栈里数量",stackEntryCount);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (stackEntryCount == 1) {
            // 如果剩一个说明在主页，提示按两次退出app
            exit();
        } else {
            // 获取上一个堆栈中保存的是哪个页面，根据name来设置导航项的选中状态
              //    mNavView.setCheckedItem(mSparseTags.keyAt(mSparseTags.indexOfValue(tagName)));
            super.onBackPressed();
        }
    }

    private void exit() {
        if (System.currentTimeMillis() - mExitTime > 2000) {
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            mExitTime = System.currentTimeMillis();
        } else {
            finish();
        }

    }
public void setToolbarVisible(boolean isVisible){
    if (isVisible){
    toolbar.setVisibility(View.GONE);
}else {
        toolbar.setVisibility(View.VISIBLE);
    }
}

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == WRITE_EXTERNAL_STORAGE_REQUEST_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this,"授权成功",Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this,"授权拒绝",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
