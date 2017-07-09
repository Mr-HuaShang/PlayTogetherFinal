package com.finalczz.playtogether.controller.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.finalczz.playtogether.R;

public class AddFriendActivity extends AppCompatActivity {

    private TextView ll_title_common;
    private TextView tv_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        initView();

        initListener();
    }

    private void initListener() {

    }

    private void initView() {
        ll_title_common = (TextView) findViewById(R.id.ll_title_common);
        ll_title_common.setText("添加球友");
        tv_right = (TextView) findViewById(R.id.tv_right);
        tv_right.setVisibility(View.VISIBLE);
        tv_right.setText("查找");
    }
}
