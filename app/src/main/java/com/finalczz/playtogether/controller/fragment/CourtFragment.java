package com.finalczz.playtogether.controller.fragment;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.finalczz.playtogether.R;
import com.finalczz.playtogether.controller.adapter.MyPagerAdapter;

/**
 * Created by 话伤 on 2017/6/30.
 */

public class CourtFragment extends Fragment{

    private ViewPager pager;
    private PagerSlidingTabStrip tabs;
    private MyPagerAdapter myPagerAdapter;
    private DisplayMetrics dm;

    public CourtFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.court_fragment, null);

        //初始化控件
        initView(view);

        //初始化数据
        initData();
        return view;
    }

    private void initData() {
        //获取当前屏幕的密度
        dm = getResources().getDisplayMetrics();
        myPagerAdapter = new MyPagerAdapter(getChildFragmentManager());
        pager.setOffscreenPageLimit(0);//设置viewpager最大缓存数
        pager.setAdapter(myPagerAdapter);
        tabs.setViewPager(pager);
        pager.setCurrentItem(1);//设置tab默认选中项
        setTabsValue();
    }

    private void initView(View view) {
        pager = (ViewPager) view.findViewById(R.id.pager);
        tabs = (PagerSlidingTabStrip) view.findViewById(R.id.tabs);
    }

    //对PagerSlidingTabStrip的各项属性进行赋值
    private void setTabsValue() {

        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        // 设置Tab的分割线是透明的
        tabs.setDividerColor(Color.TRANSPARENT);
        // 设置Tab底部线的高度
        tabs.setUnderlineHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, dm));
        // 设置Tab Indicator的高度
        tabs.setIndicatorHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, dm));
        // 设置Tab标题文字的大小
        tabs.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 14, dm));
        // 设置Tab标题文字的样式
        tabs.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL),Typeface.NORMAL);
        // 设置Tab标题文字的颜色
        tabs.setTextColor(Color.parseColor("#ffffff"));
        // 设置Tab Indicator的颜色
        tabs.setIndicatorColor(Color.parseColor("#ffffff"));
        // 取消点击Tab时的背景色
        tabs.setTabBackground(0);
    }
}
