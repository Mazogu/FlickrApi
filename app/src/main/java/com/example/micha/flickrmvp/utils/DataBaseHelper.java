package com.example.micha.flickrmvp.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.widget.RecyclerView;

/**
 * Created by micha on 2/10/2018.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public  static final String DATABASENAME = "Picture Database";
    public static final int VERSION = 1;


    public DataBaseHelper(Context context) {
        super(context, DATABASENAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
