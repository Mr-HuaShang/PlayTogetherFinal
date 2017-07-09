package com.finalczz.playtogether.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by ZRF on 2017/5/21.
 */

public class UtilTools {
    //设置字体
    public static void setFont(Context mContext, TextView textView) {
        Typeface fontType = Typeface.createFromAsset(mContext.getAssets(), "fonts/FONT.TTF");
        textView.setTypeface(fontType);
    }
}
