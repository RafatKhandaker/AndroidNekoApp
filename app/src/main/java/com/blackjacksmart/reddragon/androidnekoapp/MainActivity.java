package com.blackjacksmart.reddragon.androidnekoapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.support.v4.app.ActivityOptionsCompat;

import com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller;
import com.blackjacksmart.reddragon.androidnekoapp.Fragment.FragmentActivity;
import com.blackjacksmart.reddragon.androidnekoapp.GridView.GridAdapter;
import com.blackjacksmart.reddragon.androidnekoapp.Notification.NotificationReceiver;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.DatabaseHelper;

import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.ARRAY_CHARACTERS;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.DEFAULT_CHAR_VALUE;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.RANDOM_LIST;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.addHeroList;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.checkCharacterUnlocked;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.generateRandomNumList;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.iconDefault;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.icons;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.unlockRandomCharacter;

/**##############################################################################################**/
/***   COLLECTION APP THAT WILL UPDATE A MODIFIABLE GRID VIEW AFTER COLLECTING PIECES EVERY 30 MIN   ***
 **                                SQL DATABASE WITH RECYCLER                                     **
 **###############################################################################################**
 *                                                 Created by : Rafat Khandaker
 *
 *                                                                started:           12-06-16
 *                                                                Version:                1.0
 *                                                               Last Modified:      Jan-22-16    **/
/**----------------------------------------------------------------------------------------------**/

public class MainActivity extends AppCompatActivity {

public static GridView gridView;

private static int positionClicked;

    public static DatabaseHelper dataBaseHelper;

    Cursor res;
    StringBuffer bufferValue;
    public static Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gridView = (GridView) findViewById(R.id.gridview);
        dataBaseHelper = new DatabaseHelper(this);

        addHeroList();

        if(savedInstanceState == null){ RANDOM_LIST = generateRandomNumList(); }

        loadSavedData();
        initiateNotificationTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initiateGridView();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putIntegerArrayList("Rand_List", RANDOM_LIST);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        RANDOM_LIST = savedInstanceState.getIntegerArrayList("Rand_List");
    }

//-----------------------------------Retrieve/Set Variable------------------------------------------

    public static int getPositionClicked(){ return positionClicked; }
    public static void setPositionClicked(int i){  positionClicked = i; }

//--------------------------------- Initiate GridView-----------------------------------------------

    public void initiateGridView(){
        gridView.setAdapter(new GridAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                positionClicked = (i);
                System.out.println("" + checkCharacterUnlocked[i]);
                if(checkCharacterUnlocked[i]){
                    Controller.toastCharacter(MainActivity.this, positionClicked);
                    launchFragmentActivity(view.getContext()); }
                else{ Toast.makeText(view.getContext(), "LOCKED", Toast.LENGTH_SHORT).show(); }

            }
        });
    }
//--------------------------------------Fragment Method---------------------------------------------

    private void launchFragmentActivity(Context context){
        Intent intent = new Intent(context, FragmentActivity.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(MainActivity.this,
                                findViewById(R.id.gridview), "transition");
        startActivity(intent, optionsCompat.toBundle());
    }
//------------------------------------Notification Methods------------------------------------------

    private void instantiateNotification(){
        Intent intent = new Intent(getApplicationContext(), NotificationReceiver.class);
        final PendingIntent pendingIntent = PendingIntent.getBroadcast(this,
                NotificationReceiver.REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        long firstMillis = System.currentTimeMillis();

        AlarmManager alarm = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        alarm.setInexactRepeating(AlarmManager.RTC_WAKEUP, firstMillis, 60000L, pendingIntent);

    }

    private void initiateNotificationTimer(){
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                instantiateNotification();
            }
        });
        thread.start();
    }

//----------------------------------------Database--------------------------------------------------

    private void loadSavedData(){
        res = dataBaseHelper.getAllData();
        if(res.getCount() != 0) {
            bufferValue = new StringBuffer();
            while (res.moveToNext()) {
                unlockRandomCharacter(Integer.valueOf(res.getString(3)));
                bufferValue.append(res.getString(3));
                RANDOM_LIST.remove(Integer.valueOf(res.getString(3)));

                iconDefault[Integer.valueOf(res.getString(3))]
                        = icons[Integer.valueOf(res.getString(3))];

                DEFAULT_CHAR_VALUE[Integer.valueOf(res.getString(3))]
                        = ARRAY_CHARACTERS[Integer.valueOf(res.getString(3))];
            }
        }
    }

}
