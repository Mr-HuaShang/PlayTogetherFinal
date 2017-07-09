package com.finalczz.playtogether.controller.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.finalczz.playtogether.R;

/**
 * Created by 话伤 on 2017/7/2.
 */

public class RankingFragment extends Fragment{
    public RankingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.rank_fragment, null);
        return view;
    }
}
