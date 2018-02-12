package com.example.micha.flickrmvp.utils;

import android.provider.BaseColumns;

/**
 * Created by micha on 2/10/2018.
 */

public class DatabaseContract {

    public static final String CREATE_TABLE = "CREATE TABLE "+
            Picture.TABLE_NAME+"("+Picture.PICTURE_ID+" TEXT PRIMARY KEY, "
            +Picture.PICTURE_TITLE + " TEXT, "
            +Picture.PICTURE_DESCRIPTION + " TEXT, "
            +Picture.PICTURE_URL + " TEXT, "
            +Picture.DATE + " TEXT, "
            +Picture.OWNER_NAME + " TEXT)";

    public static class Picture implements BaseColumns{
        public static final String TABLE_NAME = "Pictures";
        public static final String PICTURE_ID = "ID";
        public static final String PICTURE_TITLE = "Title";
        public static final String PICTURE_DESCRIPTION = "Description";
        public static final String PICTURE_URL = "Url";
        public static final String DATE = "Date";
        public static final String OWNER_NAME = "Name";
    }
}
