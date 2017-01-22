package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RedDragon on 12/4/16.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private SQLiteDatabase sqLiteDatabase;
    private ContentValues contentValues;

    private static final String DATABASE_NAME = "hero.db";
    private static final String TABLE_NAME = "hero_table";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "HERO";
    private static final String COL_3 = "UNLOCKED";
    private static final String COL_4 = "VALUE";

    private static final int DATABASE_VERSION = 2;

    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " +TABLE_NAME+ " (ID INTEGER PRIMARY KEY AUTOINCREMENT" +
                ",HERO TEXT,UNLOCKED INTEGER,VALUE INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData( String hero, String unlocked, String values){
        sqLiteDatabase = this.getWritableDatabase();
        contentValues = new ContentValues();
        contentValues.put(COL_2, hero);
        contentValues.put(COL_3, unlocked);
        contentValues.put(COL_4, values);

        long result = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);

        if(result == -1){ return false; } else{ return true; }
    }

    public Cursor getAllData() {
        sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.rawQuery("select * from "+TABLE_NAME,null); }


 //-----------------------keep methods for enhancements and reference ------------------------------
    public Cursor getValue(){
        sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.rawQuery("select VALUE from "+TABLE_NAME, null); }

    public Cursor getUnlocked(){
        sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.rawQuery("select UNLOCKED from " +TABLE_NAME, null);
    }


    public boolean updateData(String id, String hero, String unlocked, String value){
        sqLiteDatabase = this.getWritableDatabase();
        contentValues = new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, hero);
        contentValues.put(COL_3, unlocked);
        contentValues.put(COL_4, value);

        sqLiteDatabase.update(TABLE_NAME, contentValues, "ID = ?", new String[]{ id } );

        return true;
    }

    public Integer deleteData(String id){
        sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.delete(TABLE_NAME, "ID = ?", new String[]{id});
    }


}
