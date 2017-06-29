package com.start.myfreetime.view;


import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.start.myfreetime.R;
import com.start.myfreetime.app.MyApplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by w on 2017/6/17.
 */

public class CommentDialogFragment extends DialogFragment {

    @BindView(R.id.user_icon)
    ImageView icomImg;
    @BindView(R.id.user_id)
    TextView idTv;
    @BindView(R.id.user_comment)
    TextView comtTv;

    private Context context;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);


        View view = inflater.inflate(R.layout.dialog_movie_comments, container);
        ButterKnife.bind(this,view);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String icon = bundle.getString("user_icon");
            Log.d("DialogFragment",bundle.getString("user_id"));
            Glide.with(MyApplication.getContext()).load(icon).into(icomImg);


            idTv.setText(bundle.getString("user_id"));
            comtTv.setText( bundle.getString("user_comment"));

        }
        return view;
    }
}
