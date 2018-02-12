package com.example.micha.flickrmvp.utils;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import com.example.micha.flickrmvp.R;
import com.example.micha.flickrmvp.main.MainPresenter;
import com.example.micha.flickrmvp.model.Album.Album;
import com.example.micha.flickrmvp.model.Album.Photo;
import com.example.micha.flickrmvp.model.Picture.Picture;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class FlickrService extends Service {

    public static final String TAG = FlickrService.class.getSimpleName();
    FlickrBinder binder = new FlickrBinder();
    MainPresenter presenter;

    public FlickrService() {
    }

    public void setPresenter(MainPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return binder;
    }

    public void getPhotos(){
        RetrofitHelper.getPhotoList(getString(R.string.base_url), getString(R.string.flickr_key), getString(R.string.andy))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<Album>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Album album) {
                List<Photo> list = album.getPhotos().getPhoto();
                List<String> ids = new ArrayList<>();
                for (Photo photo : list) {
                    ids.add(photo.getId());
                }

                sendIds(ids);

            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {

            }
        });
    }

    private void sendIds(List<String> ids) {

        final List<Picture> pictures = new ArrayList<>();
        final int num = ids.size();

        for (String id : ids) {
            RetrofitHelper.getPhoto(getString(R.string.base_url),getString(R.string.flickr_key),id)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io()).subscribe(new Observer<Picture>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(Picture picture) {
                    pictures.add(picture);
                    if(pictures.size() == num){
                        presenter.addToDatabase(pictures);
                    }

                }
                @Override
                public void onError(Throwable e) {
                    e.printStackTrace();
                }

                @Override
                public void onComplete() {

                }
            });
        }


    }

    public class FlickrBinder extends Binder{
        public FlickrService getService(){
            return FlickrService.this;
        }
    }

}
