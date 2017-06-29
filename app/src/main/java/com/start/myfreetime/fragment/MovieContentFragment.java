package com.start.myfreetime.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.start.myfreetime.R;
import com.start.myfreetime.app.Constant;
import com.start.myfreetime.bean.Movie;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.utils.SharedPreferencesUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;

/**
 * Created by w on 2017/6/8.
 */

public class MovieContentFragment extends Fragment {

    @BindView(R.id.tv_movie_nm)
    TextView movieNm;
    @BindView(R.id.tv_movie_date)
    TextView movieDate;
    @BindView(R.id.tv_movie_dra)
    TextView movieDra;
    private static String a,b,c;
    private Realm mRealm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.movie_content_layout,container,false);
        ButterKnife.bind(this, view);
        movieDate.setText("上映时间："+ SharedPreferencesUtils.get(getActivity(), Constant.MOVIE_DATE,""));
        movieNm.setText("电影名称："+ SharedPreferencesUtils.get(getActivity(), Constant.MOVIE_TITLE,""));
        movieDra.setText("电影简介："+ Html.fromHtml((String) SharedPreferencesUtils.get(getActivity(), Constant.MOVIE_CONTENT,"")));
        return view;
    }


}
