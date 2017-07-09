package com.finalczz.playtogether.controller.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.finalczz.playtogether.R;

/**
 * Created by 话伤 on 2017/6/30.
 */

public class GirlCourtFragment extends Fragment {
    public GirlCourtFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.girl_court, null);

        initView(view);

        return view;
    }

    private void initView(View view) {

    }
}
