package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

/**
 * Created by RedDragon on 12/4/16.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "hero.db";

    private static final int DATABASE_VERSION = 1;

    private static DatabaseHelper instance;

    public static synchronized  DatabaseHelper getInstance(Context context){
        if(instance == null){ instance = new DatabaseHelper(context.getApplicationContext());}
        return instance;
    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    static{
        cupboard().register(Hero.class);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        cupboard().withDatabase(sqLiteDatabase).createTables();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        cupboard().withDatabase(sqLiteDatabase).upgradeTables();
    }
}
