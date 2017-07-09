package com.finalczz.playtogether.controller.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.finalczz.playtogether.R;

public class LoadingActivity extends AppCompatActivity {

    private TextView ll_title_common;
    private LinearLayout ll_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        initView();

        initListener();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){

        }
    }

    private void initListener() {
        ll_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoadingActivity.this,RegisterActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }

    private void initView() {
        ll_title_common = (TextView) findViewById(R.id.ll_title_common);
        ll_title_common.setText("登录");
        ll_phone = (LinearLayout) findViewById(R.id.ll_phone);
    }
}
