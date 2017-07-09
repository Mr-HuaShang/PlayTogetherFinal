package com.finalczz.playtogether.controller.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.finalczz.playtogether.R;


import com.finalczz.playtogether.utils.ShareUtils;
import com.finalczz.playtogether.utils.StaticClass;
import com.finalczz.playtogether.utils.UtilTools;

/**
 * Created by ZRF on 2017/5/21.
 *
 *
 * 1.延时2000ms
 * 2.判断是否第一次运行
 * 3.Activity全屏主题
 *
 *
 */

public class SplashActivity extends AppCompatActivity{

    private TextView tv_splash;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage (Message msg){
            super.handleMessage(msg);
            switch (msg.what){
                case StaticClass.HANDLE_SPLASH:
                    //判断是否第一次运行
                    if(isFirst()){
                        startActivity( new Intent(SplashActivity.this,GuideActivity.class));
                    }
                    else {
                        startActivity( new Intent(SplashActivity.this,MainActivity.class));
                    }
                    finish();
                    break;
            }
        }
    };



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();

    }

    private void initView() {

        //延时2000ms
        handler.sendEmptyMessageDelayed(StaticClass.HANDLE_SPLASH,2000);

        tv_splash = (TextView)findViewById(R.id.tv_splash);

        //设置字体
        UtilTools.setFont(this,tv_splash);

    }


    //判断是否第一次运行
    private boolean isFirst() {
        boolean isFirst = ShareUtils.getBoolean(this,StaticClass.SHARE_IS_FIRST,true);
        if(isFirst){
            //运行了第一次后要把标记更改了，把false放到boolean
            ShareUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
            return true;
        }
        else {
            return false;
        }


    };
    //禁止返回键
    public void onBackPressed(){
    }
}
