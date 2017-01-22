package com.blackjacksmart.reddragon.androidnekoapp.Fragment;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.blackjacksmart.reddragon.androidnekoapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.ARRAY_CHARACTERS;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.FRAGMENT_VALUE;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.GRID_TRIGGER;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.NOTIFICATION_TRIGGER;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.charBackgroundImage;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.heroList;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.iconDefault;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.getPositionClicked;

/**
 * Created by RedDragon on 12/16/16.
 */

public class CharacterFragment extends Fragment {

@Nullable @BindView(R.id.collapsing_toolbar) CollapsingToolbarLayout collapsingToolbar;
@Nullable @BindView(R.id.appbar) AppBarLayout appBarLayout;
@Nullable @BindView(R.id.char_header_image_view) ImageView charHeaderImage;
@Nullable @BindView(R.id.set_descript_icon) ImageView descriptImage;
@Nullable @BindView(R.id.set_id_tv) TextView setID;
@Nullable @BindView(R.id.set_ht_tv) TextView setHT;
@Nullable @BindView(R.id.set_wt_tv) TextView setWT;
@Nullable @BindView(R.id.set_origin_tv) TextView setOrigin;
@Nullable @BindView(R.id.set_group_tv) TextView setGroup;
@Nullable @BindView(R.id.set_abilities_tv) TextView setAbilities;
@Nullable @BindView(R.id.set_summary_tv) TextView setSummary;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View characterViewFragment = null;

        switch(FRAGMENT_VALUE){
            case GRID_TRIGGER:
                 characterViewFragment = inflater.inflate(
                        R.layout.char_description_fragment, container, false);

                ButterKnife.bind(this,characterViewFragment);
                loadFragmentView();
                break;
            case NOTIFICATION_TRIGGER:
                 characterViewFragment = inflater.inflate(
                        R.layout.char_description_fragment, container, false);

                ButterKnife.bind(this,characterViewFragment);
                loadFragmentView();
                break;
        }

        return characterViewFragment;
    }

    private void loadFragmentView(){
        collapsingToolbar.setTitle(ARRAY_CHARACTERS[getPositionClicked()]);
        collapsingToolbar.setCollapsedTitleTextColor(Color.parseColor("#000000"));
        appBarLayout.setExpanded(true);
        charHeaderImage.setImageResource(charBackgroundImage[getPositionClicked()]);
        charHeaderImage.setMaxHeight(500);
        charHeaderImage.setMaxWidth(100);

        descriptImage.setImageResource(iconDefault[getPositionClicked()]);
        setID.setText(heroList.get(getPositionClicked()).getIdentity());
        setHT.setText(heroList.get(getPositionClicked()).getHeight());
        setGroup.setText(heroList.get(getPositionClicked()).getAbilities());
        setOrigin.setText(heroList.get(getPositionClicked()).getOrigin());
        setAbilities.setText(heroList.get(getPositionClicked()).getAbilities());
        setSummary.setText(heroList.get(getPositionClicked()).getSummary());

        initCollapsingToolbar();
    }

//------------------------------------Toolbar Effect------------------------------------------------

    private void initCollapsingToolbar() {
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            double scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 500) {
                    collapsingToolbar.setTitle(ARRAY_CHARACTERS[getPositionClicked()]);
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(ARRAY_CHARACTERS[getPositionClicked()]);
                    isShow = false;
                }
            }
        });
    }
}
