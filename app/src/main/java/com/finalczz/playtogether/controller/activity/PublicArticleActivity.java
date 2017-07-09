package com.finalczz.playtogether.controller.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.finalczz.playtogether.R;

public class PublicArticleActivity extends AppCompatActivity {

    private TextView ll_title_common;
    private TextView tv_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_article);

        initView();


        initListener();
    }

    private void initListener() {

    }

    private void initView() {
        ll_title_common = (TextView) findViewById(R.id.ll_title_common);
        ll_title_common.setText("发帖");
        tv_right = (TextView) findViewById(R.id.tv_right);
        tv_right.setVisibility(View.VISIBLE);
        tv_right.setText("发表");
    }
}
