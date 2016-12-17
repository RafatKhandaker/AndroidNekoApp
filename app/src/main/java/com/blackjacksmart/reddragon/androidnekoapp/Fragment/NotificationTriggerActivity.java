package com.blackjacksmart.reddragon.androidnekoapp.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blackjacksmart.reddragon.androidnekoapp.R;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.FRAGMENT_VALUE;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.NOTIFICATION_TRIGGER;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.RANDOM_LIST;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.unlockRandomCharacter;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.setPositionClicked;

/**
 * Created by RedDragon on 12/17/16.
 */

public class NotificationTriggerActivity extends AppCompatActivity {

    private int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        FRAGMENT_VALUE = NOTIFICATION_TRIGGER;
        System.out.println("Notification trigger " +FRAGMENT_VALUE);
        unlockCharacter();
        launchNewCharacterFrag();
    }


    private void launchNewCharacterFrag(){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CharacterFragment charFrag = new CharacterFragment();
        fragmentTransaction.add(R.id.fragment_container, charFrag);
        fragmentTransaction.commit();
    }

    private void unlockCharacter(){
//        if(!RANDOM_LIST.get(0).equals(null)) {
            i = RANDOM_LIST.get(0);
        System.out.println("random list is : " +i);
            setPositionClicked(i);
            unlockRandomCharacter(i);
            RANDOM_LIST.remove(0);
//        }

    }
}