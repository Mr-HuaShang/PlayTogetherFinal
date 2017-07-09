package com.finalczz.playtogether.controller.activity;

import android.content.Intent;
import android.support.transition.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.finalczz.playtogether.R;
import com.finalczz.playtogether.controller.fragment.MyFragment;

public class RegisterActivity extends AppCompatActivity {

    private TextView ll_title_common;
    private TextView tv_right;
    private Button phone_bt_loading;
    private MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();

        initData();

        initListener();
    }

    private void initData() {
        myFragment = new MyFragment();
    }

    private void initListener() {
        phone_bt_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                myFragment.setBtLoadingVisibility(View.GONE);
                myFragment.setLinearVisibility(View.VISIBLE);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initView() {
        ll_title_common = (TextView) findViewById(R.id.ll_title_common);
        ll_title_common.setText("手机号登录");
        tv_right = (TextView) findViewById(R.id.tv_right);
        tv_right.setVisibility(View.VISIBLE);
        tv_right.setText("注册");
        phone_bt_loading = (Button) findViewById(R.id.phone_bt_loading);
    }
}
