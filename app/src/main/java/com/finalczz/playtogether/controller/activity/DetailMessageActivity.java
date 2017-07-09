package com.finalczz.playtogether.controller.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Switch;

import com.finalczz.playtogether.R;

public class DetailMessageActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbar;
    private Toolbar detail_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_message);

        initView();

        initListener();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initListener() {

    }

    private void initView() {
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.coll_toolbar_detail);
        collapsingToolbar.setTitle("我的资料");
        detail_toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(detail_toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
