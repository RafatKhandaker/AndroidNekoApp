package com.blackjacksmart.reddragon.androidnekoapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller;
import com.blackjacksmart.reddragon.androidnekoapp.Fragment.FragmentActivity;
import com.blackjacksmart.reddragon.androidnekoapp.GridView.GridAdapter;
import com.blackjacksmart.reddragon.androidnekoapp.Notification.NotificationReceiver;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.generateRandomNumList;

/**##############################################################################################**/
/***   PUZZLE APP THAT WILL UPDATE A MODIFIABLE GRID VIEW AFTER COLLECTING PIECES EVERY 30 MIN   ***
 **                                SQL DATABASE WITH RECYCLER                                     **
 **###############################################################################################**
 *                                                 Created by : Rafat Khandaker & Mina Meltem
 *                                                                started:           12-06-16
 *                                                                Version:                1.0
 *                                                               Last Modified:      12-06-16    **/
/**----------------------------------------------------------------------------------------------**/

public class MainActivity extends AppCompatActivity {

    public static int getPositionClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumList();
        initiateNotificationTimer();
        initiateGridView();


    }

//--------------------------------- Initiate GridView-----------------------------------------------

    public void initiateGridView(){
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new GridAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getPositionClicked = (i);

                Controller.toastCharacter(MainActivity.this, getPositionClicked);
                launchFragmentActivity(view.getContext());
            }
        });
    }
    //--------------------------------------Fragment Method---------------------------------------------
    private void launchFragmentActivity(Context context){
        Intent intent = new Intent(context, FragmentActivity.class);
        context.startActivity(intent);
    }
//------------------------------------Notification Methods------------------------------------------

    public void initiateNotificationTimer(){

        Intent intent = new Intent(getApplicationContext(), NotificationReceiver.class);
        final PendingIntent pendingIntent = PendingIntent.getBroadcast(this,
                NotificationReceiver.REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        long firstMillis = System.currentTimeMillis();

        // Change value to 60000L for presentation
        AlarmManager alarm = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        alarm.setInexactRepeating(AlarmManager.RTC_WAKEUP, firstMillis, 60000L, pendingIntent);


    }

//------------------------------------Retrofit------------------------------------------------------

}
