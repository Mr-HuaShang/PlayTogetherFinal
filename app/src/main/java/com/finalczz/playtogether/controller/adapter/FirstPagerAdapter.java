package com.finalczz.playtogether.controller.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 话伤 on 2017/7/8.
 */

public class FirstPagerAdapter extends FragmentPagerAdapter{

    private final String[] titles = {"排名","好友"};

    public FirstPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
