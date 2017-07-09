package com.finalczz.playtogether.controller.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.finalczz.playtogether.controller.fragment.ArroundCourtFragment;
import com.finalczz.playtogether.controller.fragment.FriendCourtFragment;
import com.finalczz.playtogether.controller.fragment.GirlCourtFragment;
import com.finalczz.playtogether.controller.fragment.LiveFragment;
import com.finalczz.playtogether.controller.fragment.PhotoFragment;
import com.finalczz.playtogether.controller.fragment.RankingFragment;
import com.finalczz.playtogether.controller.fragment.VidioFragment;

/**
 * Created by 话伤 on 2017/6/30.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private FriendCourtFragment friendCourtFragment;
    private ArroundCourtFragment arroundCourtFragment;
    private GirlCourtFragment girlCourtFragment;
    private PhotoFragment photoFragment;
    private VidioFragment vidioFragment;
    private LiveFragment liveFragment;
    private RankingFragment rankingFragment;

    private final String[] titles = {"排名","好友","附近","女生","图片","视频"};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return titles.length;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                if(rankingFragment == null){
                    rankingFragment = new RankingFragment();
                }
                return rankingFragment;

            case 1:
                if(friendCourtFragment == null){
                    friendCourtFragment = new FriendCourtFragment();
                }
                return friendCourtFragment;

            case 2:
                if(arroundCourtFragment == null){
                    arroundCourtFragment = new ArroundCourtFragment();
                }
                return arroundCourtFragment;
            case 3:
                if(girlCourtFragment == null){
                    girlCourtFragment = new GirlCourtFragment();
                }
                return girlCourtFragment;
            case 4:
                if(photoFragment == null){
                    photoFragment = new PhotoFragment();
                }
                return photoFragment;
            case 5:
                if(vidioFragment == null){
                    vidioFragment = new VidioFragment();
                }
                return vidioFragment;

            default: return null;
        }
    }
}
