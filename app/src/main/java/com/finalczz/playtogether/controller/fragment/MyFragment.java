package com.finalczz.playtogether.controller.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.transition.Visibility;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.finalczz.playtogether.R;
import com.finalczz.playtogether.controller.activity.AboutActivity;
import com.finalczz.playtogether.controller.activity.DetailMessageActivity;
import com.finalczz.playtogether.controller.activity.LoadingActivity;
import com.finalczz.playtogether.controller.activity.SettingActivity;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by 话伤 on 2017/6/29.
 */

public class MyFragment extends Fragment{

    private Button bt_loading;
    private LinearLayout ll_my_setting;
    private CircleImageView my_user_photo;
    private LinearLayout ll_my_about;
    private LinearLayout my_top_linear;
    private LinearLayout address_linear;
    private LinearLayout ll_add_friend;

    public MyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.my_fragment, null);

        initView(view);

        initListener();
        return view;
    }

    private void initListener() {
        bt_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //需要传递数据
                Intent intent = new Intent(getActivity(), LoadingActivity.class);
                startActivity(intent);
            }
        });

        ll_my_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //需要传递数据
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });

        ll_my_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //不用传递数据
                Intent intent = new Intent(getActivity(), AboutActivity.class);
                startActivity(intent);
            }
        });

        my_user_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //需要传递数据
                Intent intent = new Intent(getActivity(), DetailMessageActivity.class);
                startActivity(intent);
            }
        });

        //添加球友的点击事件
        ll_add_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    //初始化控件
    private void initView(View view) {
        bt_loading = (Button) view.findViewById(R.id.bt_loading);
        ll_my_setting = (LinearLayout) view.findViewById(R.id.ll_my_setting);
        //头像控件
        my_user_photo = (CircleImageView) view.findViewById(R.id.my_user_photo);
        ll_my_about = (LinearLayout) view.findViewById(R.id.ll_my_about);
        my_top_linear = (LinearLayout) view.findViewById(R.id.my_top_linear);
        address_linear = (LinearLayout) view.findViewById(R.id.address_linear);
        ll_add_friend = (LinearLayout) view.findViewById(R.id.ll_add_friend);
    }

    public void setBtLoadingVisibility(int visibility){
        bt_loading.setVisibility(visibility);
    }

    public void setLinearVisibility(int visibility){
        my_top_linear.setVisibility(visibility);
        address_linear.setVisibility(visibility);
    }
}
