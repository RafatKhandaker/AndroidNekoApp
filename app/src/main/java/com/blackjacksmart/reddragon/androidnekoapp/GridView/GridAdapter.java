package com.blackjacksmart.reddragon.androidnekoapp.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.blackjacksmart.reddragon.androidnekoapp.R;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.ARRAY_CHARACTERS;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.icons;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.isCharacterUnlocked;

/**
 * Created by RedDragon on 12/6/16.
 */

public class GridAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater inflater;

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
        TextView iconText = (TextView) gridView.findViewById(R.id.text_view);

        if(isCharacterUnlocked[i]) {
            icon.setImageResource(icons[i]);
            iconText.setText(ARRAY_CHARACTERS[i]);
        }
        else{
            icon.setImageResource(R.drawable.uknown_icon);
            iconText.setText("Locked !");
        }

        return gridView;
    }

}
