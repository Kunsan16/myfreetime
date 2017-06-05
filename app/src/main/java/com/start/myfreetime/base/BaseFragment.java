package com.start.myfreetime.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.start.myfreetime.BackHandledInterface;
import com.start.myfreetime.presenter.BasePresenter;
import com.start.myfreetime.view.BaseView;

import javax.inject.Inject;

/**
 * Created by w on 2017/3/29.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements BaseView<T> {

    @Inject
    public T mPresenter;

    public Context mContext;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();

    }


    @Override
    public void initViews(View view) {

    }


    @Override
    public void setPresenter(T presenter) {
        if (presenter != null) {
            this.mPresenter = presenter;
        }
    }

    /**
     * 添加 Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    protected void addFragment(int containerViewId, Fragment fragment, String tag,Bundle bundle) {
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragment.setArguments(bundle);
        // 设置tag，不然下面 findFragmentByTag(tag)找不到
        fragmentTransaction.add(containerViewId, fragment, tag);
        fragmentTransaction.addToBackStack(tag);
        fragmentTransaction.commit();
    }

    /**
     * 替换 Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    protected void replaceFragment(int containerViewId, Fragment fragment, String tag,Bundle bundle) {
        if (getChildFragmentManager().findFragmentByTag(tag) == null) {
            FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
            fragment.setArguments(bundle);
            // 设置tag
            fragmentTransaction.replace(containerViewId, fragment, tag);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            // 这里要设置tag，上面也要设置tag
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        } else {
            // 存在则弹出在它上面的所有fragment，并显示对应fragment
            getChildFragmentManager().popBackStack(tag, 0);
        }
    }
    /**
     * 替换 Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    protected void showFragment(int containerViewId, Fragment fragment,  Fragment fragment1,String tag) {

            FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
            fragmentTransaction.hide(fragment);
            fragmentTransaction.show(fragment1);

            // 设置tag

            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            // 这里要设置tag，上面也要设置tag
            fragmentTransaction.commit();

    }




}
