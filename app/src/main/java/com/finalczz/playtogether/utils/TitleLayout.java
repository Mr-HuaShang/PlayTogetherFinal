package com.finalczz.playtogether.utils;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.finalczz.playtogether.R;

/**
 * Created by 话伤 on 2017/7/1.
 */

public class TitleLayout extends LinearLayout {

    private TextView tv_right;
    private TextView common_back;

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.title_common,this);

        initView();

        initListener();
    }

    private void initListener() {
        common_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //结束当前活动
                ((Activity)getContext()).finish();
            }
        });
    }

    private void initView() {
        tv_right = (TextView) findViewById(R.id.tv_right);
        common_back = (TextView) findViewById(R.id.common_back);
    }
}
