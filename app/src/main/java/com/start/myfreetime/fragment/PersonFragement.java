package com.start.myfreetime.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.AboutPreferenceActivity;
import com.start.myfreetime.MainActivity;
import com.start.myfreetime.R;
import com.start.myfreetime.base.BaseFragment;
import com.start.myfreetime.presenter.PersonSettingPresenter;
import com.start.myfreetime.presenter.PersonSettingView;
import com.start.myfreetime.glide.GlideCatchUtil;
import com.start.myfreetime.view.CircleImageView;
import com.start.myfreetime.view.WaveView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.content.Context.MODE_PRIVATE;


/**
 * Created by w on 2017/4/8.
 */

public class PersonFragement extends BaseFragment<PersonSettingPresenter> implements PersonSettingView{

    @BindView(R.id.wave_view)
    WaveView waveView;
    @BindView(R.id.image)
    CircleImageView imageView;
    @BindView(R.id.tv_clear_cache)
    TextView cleanTv;
    @BindView(R.id.tv_cache_size)
    TextView cacheTv;
    @BindView(R.id.sw_nopic_mode)
    com.suke.widget.SwitchButton modeSw;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.person_setting_layout,container,false);
        ButterKnife.bind(this, view);
        initViews(view);

        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden){
            Log.i("hidden",hidden+"");
        }else {
            MainActivity activity=(MainActivity)getActivity();
            StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.personColor));
            activity.setToolbarVisible(true);
        }

    }

    @Override
    public void cleanGlideCacheDone(String cache) {

        cacheTv.setText("("+ cache+")");
        Toast.makeText(getActivity(),"清除完成",Toast.LENGTH_SHORT).show();
    }




    @Override
    public void setPresenter(PersonSettingPresenter presenter) {
        this.mPresenter=presenter;
    }

    public static PersonFragement newInstance() {
        return new PersonFragement();
    }

    @OnClick({R.id.sw_nopic_mode,R.id.tv_clear_cache,R.id.tv_about_me})
    public void click(View view){

        switch (view.getId()){
            case R.id.sw_nopic_mode:

                mPresenter.setNoPictureMode(modeSw.isChecked());
                break;

            case R.id.tv_clear_cache:
                mPresenter.cleanGlideCache();
                break;
            case R.id.tv_about_me:
           startActivity(new Intent(getActivity(), AboutPreferenceActivity.class));

        }

    }

    @Override
    public void initViews(View view) {
        cacheTv.setText("("+ GlideCatchUtil.getInstance().getCacheSize()+")");
        SharedPreferences sp = getActivity().getSharedPreferences("user_settings", MODE_PRIVATE);

        modeSw.setChecked(sp.getBoolean("no_picture_mode",false));
        final FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2,-2);
        lp.gravity = Gravity.BOTTOM|Gravity.CENTER;
        waveView.setOnWaveAnimationListener(new WaveView.OnWaveAnimationListener() {
            @Override
            public void OnWaveAnimation(float y) {
                lp.setMargins(420,360,420,(int)y+2);
                imageView.setLayoutParams(lp);
            }
        });

    }



}
