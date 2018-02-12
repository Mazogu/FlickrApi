package com.example.micha.flickrmvp.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.micha.flickrmvp.model.Picture.Photo;
import com.example.micha.flickrmvp.model.Picture.Picture;
import com.example.micha.flickrmvp.model.SimplePhoto;

import java.util.ArrayList;
import java.util.List;

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
        sqLiteDatabase.execSQL(DatabaseContract.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addPictures(List<Picture> pictures){
        ContentValues contentValues = new ContentValues();
        SQLiteDatabase database = getWritableDatabase();
        for (Picture picture : pictures) {
            Photo photo = picture.getPhoto();
            contentValues.put(DatabaseContract.Picture.PICTURE_ID, photo.getId());
            contentValues.put(DatabaseContract.Picture.PICTURE_TITLE, photo.getTitle().getContent());
            contentValues.put(DatabaseContract.Picture.PICTURE_DESCRIPTION, photo.getDescription().getContent());
            contentValues.put(DatabaseContract.Picture.PICTURE_URL, photo.getUrls().getUrl().get(0).getContent());
            contentValues.put(DatabaseContract.Picture.DATE, photo.getDates().getPosted());
            contentValues.put(DatabaseContract.Picture.OWNER_NAME, photo.getOwner().getRealname());
            database.insertWithOnConflict(DatabaseContract.Picture.TABLE_NAME, null, contentValues, SQLiteDatabase.CONFLICT_REPLACE);
        }
        database.close();
    }

    public SimplePhoto getSimplePhoto(String id){
        SQLiteDatabase database = getWritableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM "+ DatabaseContract.Picture.TABLE_NAME+"WHERE PICTURE_ID = '"+id+"'",null);
        if(cursor.moveToFirst()){
            database.close();
            return new SimplePhoto(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5));
        }
        database.close();
        return null;
    }

    public List<SimplePhoto> getAllphotos(){
        List<SimplePhoto> photos = new ArrayList<>();
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseContract.Picture.TABLE_NAME, null);
        if(cursor.moveToFirst()){
            do {
                photos.add(new SimplePhoto(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                        cursor.getString(4),cursor.getString(5)));
            } while (cursor.moveToNext());
        }
        db.close();
        return photos;
    }
}
