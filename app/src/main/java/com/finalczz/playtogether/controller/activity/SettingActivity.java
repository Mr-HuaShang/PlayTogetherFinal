package com.finalczz.playtogether.controller.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.finalczz.playtogether.R;

public class SettingActivity extends AppCompatActivity {

    private LinearLayout ll_setting_zh;
    private TextView ll_title_common;
    private LinearLayout ll_setting_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        initView();

        //初始化监听
        initListener();
    }

    private void initListener() {
        ll_setting_zh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this,LoadingActivity.class);
                startActivity(intent);
            }
        });

        ll_setting_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initView() {
        ll_setting_zh = (LinearLayout) findViewById(R.id.ll_setting_zh);
        ll_title_common = (TextView) findViewById(R.id.ll_title_common);
        ll_setting_exit = (LinearLayout) findViewById(R.id.ll_setting_exit);
        ll_title_common.setText("设置");
    }
}
