package com.blackjacksmart.reddragon.androidnekoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by RedDragon on 12/6/16.
 */

public class GridAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater inflater;

    private Integer[] icons = {
            R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3, R.drawable.icon_4,
            R.drawable.icon_5, R.drawable.icon_6, R.drawable.icon_7, R.drawable.icon_8,
            R.drawable.icon_9, R.drawable.icon_10, R.drawable.icon_11, R.drawable.icon_12,
            R.drawable.icon_13, R.drawable.icon_14, R.drawable.icon_15, R.drawable.icon_16,
            R.drawable.icon_17, R.drawable.icon_18, R.drawable.icon_19, R.drawable.icon_20,
            R.drawable.icon_21
    };

    public GridAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int i) {
        return icons[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View gridView = convertView;
        if(convertView == null){
            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layout, null);
        }

        ImageView icon = (ImageView) gridView.findViewById(R.id.image_view);
        icon.setImageResource(icons[i]);

        return gridView;
    }

}
