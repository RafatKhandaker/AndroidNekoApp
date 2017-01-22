package com.blackjacksmart.reddragon.androidnekoapp.Notification;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.blackjacksmart.reddragon.androidnekoapp.Fragment.CharacterFragment;
import com.blackjacksmart.reddragon.androidnekoapp.GridView.GridAdapter;
import com.blackjacksmart.reddragon.androidnekoapp.R;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.ARRAY_CHARACTERS;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.DEFAULT_CHAR_VALUE;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.RANDOM_LIST;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.iconDefault;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.icons;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.unlockRandomCharacter;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.dataBaseHelper;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.gridView;
import static com.blackjacksmart.reddragon.androidnekoapp.MainActivity.setPositionClicked;

/**
 * Created by RedDragon on 12/17/16.
 */

public class NotificationTriggerActivity extends AppCompatActivity {
    private GridAdapter adapter;
    private int i;
    private String hero;
    private boolean isInserted;

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
        hero = ARRAY_CHARACTERS[i];

        setPositionClicked(i);
            unlockRandomCharacter(i);

        isInserted = dataBaseHelper.insertData(hero, String.valueOf(1), String.valueOf(i));
            if(isInserted)
                {Toast.makeText(this,"Data Inserted",Toast.LENGTH_LONG).show();}
            else
                {Toast.makeText(this,"Data not Inserted",Toast.LENGTH_LONG).show();}

        iconDefault[i] = icons[i];
        DEFAULT_CHAR_VALUE[i] = ARRAY_CHARACTERS[i];

        RANDOM_LIST.remove(0);

        adapter.notifyDataSetChanged();
        gridView.invalidate();

    }

}
