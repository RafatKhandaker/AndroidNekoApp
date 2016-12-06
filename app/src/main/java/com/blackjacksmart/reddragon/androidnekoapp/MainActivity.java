package com.blackjacksmart.reddragon.androidnekoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


/***   PUZZLE APP THAT WILL UPDATE A MODIFIABLE GRID VIEW AFTER COLLECTING PIECES EVERY 30 MIN   ***
 **                                SQL DATABASE WITH RECYCLER                                     **
 **-----------------------------------------------------------------------------------------------**
 *                                                 Created by : Mina Meltem & Rafat Khandaker
 *                                                                started:           12-06-16
 *                                                                Version:                1.0
 *                                                               Last Modified:      12-06-16    **/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiateGridView();

    }

//--------------------------------- Initiate GridView-----------------------------------------------

    public void initiateGridView(){
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new GridAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + (i+1), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
