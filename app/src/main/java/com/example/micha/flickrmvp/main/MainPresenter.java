package com.example.micha.flickrmvp.main;

import android.content.Context;
import android.util.Log;

import com.example.micha.flickrmvp.BasePresenter;
import com.example.micha.flickrmvp.model.Picture.Picture;
import com.example.micha.flickrmvp.model.SimplePhoto;
import com.example.micha.flickrmvp.utils.DataBaseHelper;
import com.example.micha.flickrmvp.utils.FlickrService;

import java.util.List;

/**
 * Created by micha on 2/10/2018.
 */

public class MainPresenter implements MainContract.MPresenter {

    public static final String TAG = MainPresenter.class.getSimpleName();
    MainContract.MView view;
    FlickrService service;

    @Override
    public void attachView(MainContract.MView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void setService(FlickrService service) {
        this.service = service;
        service.setPresenter(this);
        service.getPhotos();
    }

    public void addToDatabase(List<Picture> pictures) {
        DataBaseHelper data = new DataBaseHelper((Context) view);
        data.addPictures(pictures);
    }

    public void updateUrl(String id, String url){
        DataBaseHelper database = new DataBaseHelper((Context) view);
        database.updateUrl(id,url);
    }

    public void complete(){
        DataBaseHelper database = new DataBaseHelper((Context) view);
        List<SimplePhoto> list = database.getAllphotos();
        view.setPhotoList(list);
    }
}
