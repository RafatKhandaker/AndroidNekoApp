package com.blackjacksmart.reddragon.androidnekoapp.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.blackjacksmart.reddragon.androidnekoapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.ARRAY_CHARACTERS;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.FRAGMENT_VALUE;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.GRID_TRIGGER;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.NOTIFICATION_TRIGGER;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.charBackgroundImage;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.icons;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.getPositionClicked;

/**
 * Created by RedDragon on 12/16/16.
 */

public class CharacterFragment extends Fragment {

@Nullable @BindView(R.id.collapsing_toolbar) CollapsingToolbarLayout collapsingToolbar;
@Nullable @BindView(R.id.appbar) AppBarLayout appBarLayout;
@Nullable @BindView (R.id.char_header_image_view) ImageView charHeaderImage;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View characterViewFragment = null;

        switch(FRAGMENT_VALUE){
            case GRID_TRIGGER:
                 characterViewFragment = inflater.inflate(
                        R.layout.char_description_fragment, container, false);

                ButterKnife.bind(this,characterViewFragment);
                initCollapsingToolbar();
                break;
            case NOTIFICATION_TRIGGER:
                 characterViewFragment = inflater.inflate(
                        R.layout.char_description_fragment, container, false);

                ButterKnife.bind(this,characterViewFragment);
                initCollapsingToolbar();
                break;
        }

        return characterViewFragment;
    }

    private void loadFragmentView(){
        initCollapsingToolbar();
        charHeaderImage.setImageResource(charBackgroundImage[getPositionClicked()]);

    }

//------------------------------------Toolbar Effect------------------------------------------------
    private void initCollapsingToolbar() {

        collapsingToolbar.setTitle(ARRAY_CHARACTERS[getPositionClicked()]);
        appBarLayout.setExpanded(true);
        charHeaderImage.setImageResource(icons[getPositionClicked()]);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
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
