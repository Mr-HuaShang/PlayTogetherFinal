package com.finalczz.playtogether.controller.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.finalczz.playtogether.R;
import com.finalczz.playtogether.controller.adapter.ZbAdapter;
import com.finalczz.playtogether.model.bean.ZbInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 话伤 on 2017/6/30.
 */

public class ZbFragment extends Fragment{

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    private List<ZbInfo> zbInfos = new ArrayList<>();
    private ZbAdapter zbAdapter;

    private ZbInfo[] zbInfo = {new ZbInfo("长沙","189",R.mipmap.zb1,"包邮","库里二代，安德玛","899"),
            new ZbInfo("安徽","459",R.mipmap.zb2,"包邮","库里1代，安德玛","589"),
            new ZbInfo("长沙","423",R.mipmap.zb3,"包邮","库里二代，安德玛","899"),
            new ZbInfo("武汉","189",R.mipmap.zb4,"包邮","库里三代，安德玛","1299"),
            new ZbInfo("长沙","164",R.mipmap.zb5,"包邮","安德玛","599"),
            new ZbInfo("广州","512",R.mipmap.zb6,"包邮","运动T恤，安德玛","199"),
            new ZbInfo("长沙","342",R.mipmap.zb7,"包邮","库里二代，安德玛","899"),
            new ZbInfo("深圳","189",R.mipmap.zb8,"包邮","科比毒液5，耐克","799"),
            new ZbInfo("浙江","1123",R.mipmap.zb9,"包邮","库里1代，安德玛","899"),

    };

    public ZbFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.zb_fragment, null);

        initView(view);
        initData();

        return view;
    }

    private void initData() {
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        zbAdapter = new ZbAdapter(zbInfos);
        recyclerView.setAdapter(zbAdapter);

        zbInfos.clear();
        for(int i = 0;i<25;i++){
            Random random = new Random();
            int nextInt = random.nextInt(zbInfo.length);
            zbInfos.add(zbInfo[nextInt]);
        }
    }

    private void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
    }
}
