package com.blackjacksmart.reddragon.androidnekoapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller;
import com.blackjacksmart.reddragon.androidnekoapp.Fragment.FragmentActivity;
import com.blackjacksmart.reddragon.androidnekoapp.GridView.GridAdapter;
import com.blackjacksmart.reddragon.androidnekoapp.Notification.NotificationReceiver;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.DatabaseHelper;

import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.RANDOM_LIST;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.checkCharacterUnlocked;
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

/**   NOT QUITE FINISHED !  I HAVE A LOT MORE iDEAS WITH THIS APP, WILL CONTINUE**/

public class MainActivity extends AppCompatActivity {

public static GridView gridView;

private static int positionClicked;
private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gridView = (GridView)findViewById(R.id.gridview);

        DatabaseHelper dbHelper = DatabaseHelper.getInstance(this);
        db = dbHelper.getWritableDatabase();

        RANDOM_LIST = generateRandomNumList();

        System.out.println(RANDOM_LIST);
        initiateNotificationTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initiateGridView();
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

}
