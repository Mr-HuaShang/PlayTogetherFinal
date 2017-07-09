package com.finalczz.playtogether.controller.activity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.finalczz.playtogether.R;
import com.finalczz.playtogether.controller.fragment.CourtFragment;
import com.finalczz.playtogether.controller.fragment.FirstFragment;
import com.finalczz.playtogether.controller.fragment.MyFragment;
import com.finalczz.playtogether.controller.fragment.ZbFragment;
import com.finalczz.playtogether.utils.PopupMenuUtil;

import java.security.MessageDigest;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RadioGroup radio_group;
    private MyFragment myFragment;
    private TextView tv_toolbar;
    private CourtFragment courtFragment;
    private FirstFragment firstFragment;
    private ZbFragment zbFragment;
    private ImageView center_add;
    private RelativeLayout rl_click;
    private Context context;
    private SearchView search;
    private TextView searchTextView;
    private SearchView mSearchView;
    private SearchView.SearchAutoComplete mEdit;
    private TextView search_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件
        initView();

        initData();

        initListener();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view,menu);
        MenuItem searchItem = menu.findItem(R.id.menu_search);
        //通过MenuItem得到SearchView
        mSearchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        mSearchView.setIconifiedByDefault(false);
        //设置搜索框的宽度
        mSearchView.setMaxWidth(toolbar.getWidth()-180);
        //设置搜索框的样式
        mEdit = (SearchView.SearchAutoComplete) mSearchView.findViewById(R.id.search_src_text);
        mEdit.setHintTextColor(Color.parseColor("#ffffff"));
        mEdit.setTextSize(16);
        //mEdit.setBackground();

        //设置框内提示内容
        mSearchView.setQueryHint("请输入你要想的...");
        return super.onCreateOptionsMenu(menu);
    }

    private void initData() {
        context = this;
        myFragment = new MyFragment();
        courtFragment = new CourtFragment();
        firstFragment = new FirstFragment();
        zbFragment = new ZbFragment();
        //设置radiogroup的默认选中项
        radio_group.check(R.id.rb_shouye);
    }

    private void initListener() {

        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                Fragment fragment = null;
                switch (checkedId){
                    case R.id.rb_my:
                        tv_toolbar.setText("篮板痴汉");
                        tv_toolbar.setVisibility(View.VISIBLE);
                        mSearchView.setVisibility(View.GONE);
                        search_address.setVisibility(View.GONE);
                        fragment = myFragment;
                        break;

                    case R.id.rb_court:
                        tv_toolbar.setText("球场");
                        tv_toolbar.setVisibility(View.VISIBLE);
                        mSearchView.setVisibility(View.GONE);
                        fragment = courtFragment;
                        search_address.setVisibility(View.GONE);
                        break;
                    case R.id.rb_shouye:
                        tv_toolbar.setText("首页");
                        tv_toolbar.setVisibility(View.GONE);
                        mSearchView.setVisibility(View.VISIBLE);
                        search_address.setVisibility(View.VISIBLE);
                        fragment = firstFragment;
                        break;

                    case R.id.rb_zb:
                        tv_toolbar.setText("装备");
                        tv_toolbar.setVisibility(View.GONE);
                        mSearchView.setVisibility(View.VISIBLE);
                        fragment = zbFragment;
                        search_address.setVisibility(View.VISIBLE);
                        break;
                }
                switchFragment(fragment);
            }
        });

        rl_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenuUtil.getInstance().show(context,center_add);
            }
        });

    }


    private void initView() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");

        setSupportActionBar(toolbar);

        center_add = (ImageView) findViewById(R.id.center_add);
        tv_toolbar = (TextView) findViewById(R.id.tv_toolbar);
        tv_toolbar.setText("首页");
        rl_click = (RelativeLayout) findViewById(R.id.rl_click);
        search_address = (TextView) findViewById(R.id.search_address);

        radio_group = (RadioGroup) findViewById(R.id.radio_group);
    }


    //实现4个页面的切换方法
    private void switchFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame,fragment).commit();//提交事务
    }

    //模拟返回键
    @Override
    public void onBackPressed() {
        // 当popupWindow 正在展示的时候 按下返回键 关闭popupWindow 否则关闭activity
        if (PopupMenuUtil.getInstance().isShowing()) {
            PopupMenuUtil.getInstance().rlClickAction();
        } else {
            super.onBackPressed();
        }
    }
}
