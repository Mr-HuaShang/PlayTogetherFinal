package com.finalczz.playtogether.controller.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.finalczz.playtogether.R;

public class AboutActivity extends AppCompatActivity {

    private TextView ll_title_common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        initView();

        //初始化监听
        initListener();
    }

    private void initView() {
        ll_title_common = (TextView) findViewById(R.id.ll_title_common);
        ll_title_common.setText("关于");
    }

    private void initListener() {

    }
}
