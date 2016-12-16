package com.blackjacksmart.reddragon.androidnekoapp.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blackjacksmart.reddragon.androidnekoapp.R;

/**
 * Created by RedDragon on 12/15/16.
 */

public class FragmentActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);

        launchCharacterFragment();
    }


    private void launchCharacterFragment(){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CharacterFragment charFrag = new CharacterFragment();
        fragmentTransaction.add(R.id.fragment_container, charFrag);
        fragmentTransaction.commit();
    }

}

