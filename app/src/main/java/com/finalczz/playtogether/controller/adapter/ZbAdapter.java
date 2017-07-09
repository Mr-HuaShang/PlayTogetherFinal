package com.finalczz.playtogether.controller.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.finalczz.playtogether.R;
import com.finalczz.playtogether.model.bean.ZbInfo;

import java.util.List;

/**
 * Created by 话伤 on 2017/7/3.
 */

public class ZbAdapter extends RecyclerView.Adapter<ZbAdapter.ViewHolder> {

    private Context mContext;
    private List<ZbInfo> mZbInfos;

    public ZbAdapter(List<ZbInfo> mZbInfos) {
        this.mZbInfos = mZbInfos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_zb, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ZbInfo zbInfo = mZbInfos.get(position);
        Glide.with(mContext).load(zbInfo.getImageId()).into(holder.iv_zb);
        holder.tv_zb_address.setText(zbInfo.getAddress());
        holder.tv_zb_buynum.setText(zbInfo.getBuyNum());
        holder.tv_zb_price.setText(zbInfo.getPrice());
        holder.tv_zb_name.setText(zbInfo.getName());
    }

    @Override
    public int getItemCount() {
        return mZbInfos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_zb_name;
        private TextView tv_zb_address;
        private TextView tv_zb_price;
        private TextView tv_zb_buynum;
        private final CardView cardView;
        private final ImageView iv_zb;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            tv_zb_address = (TextView) cardView.findViewById(R.id.tv_zb_address);
            tv_zb_buynum = (TextView) cardView.findViewById(R.id.tv_zb_buynum);
            tv_zb_name = (TextView) cardView.findViewById(R.id.tv_zb_name);
            tv_zb_price = (TextView) cardView.findViewById(R.id.tv_zb_price);
            iv_zb = (ImageView) cardView.findViewById(R.id.iv_zb);
        }
    }
}
