package com.blackjacksmart.reddragon.androidnekoapp.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.blackjacksmart.reddragon.androidnekoapp.GridView.GridAdapter;
import com.blackjacksmart.reddragon.androidnekoapp.R;

import butterknife.BindView;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.ARRAY_CHARACTERS;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.RANDOM_LIST;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.iconDefault;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.icons;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.unlockRandomCharacter;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.gridView;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.setPositionClicked;

/**
 * Created by RedDragon on 12/17/16.
 */

public class NotificationTriggerActivity extends AppCompatActivity {

@BindView (R.id.text_view) TextView textView;

    GridAdapter adapter;

    private int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);


        adapter = new GridAdapter(this);


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

        i = RANDOM_LIST.get(0);
        System.out.println("random list is : " +i);
            setPositionClicked(i);
            unlockRandomCharacter(i);
            RANDOM_LIST.remove(0);

        iconDefault[i] = icons[i];
        textView.setText(ARRAY_CHARACTERS[i]);

        gridView.invalidate();
        adapter.notifyDataSetChanged();

    }
}
