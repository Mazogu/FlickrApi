package com.example.micha.flickrmvp.utils;



import com.example.micha.flickrmvp.model.Album.Album;
import com.example.micha.flickrmvp.model.Picture.Picture;
import com.example.micha.flickrmvp.model.sizes.PictureSizes;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by micha on 2/10/2018.
 */

public class RetrofitHelper {
    public static class Factory{
        public static Retrofit getRetrofit(String url){
            return new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create()).baseUrl(url).build();
        }

        public static Retrofit getTestRetrofit(String url){
            return new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create()).baseUrl(url).build();
        }

    }

    public static Observable<Album> getPhotoList(String url, String key, String user){
        RetroFitService service = Factory.getRetrofit(url).create(RetroFitService.class);
        return service.getPhotoList(key,user);
    }

    public static Observable<Picture> getPhoto(String url, String key, String photoId){
        RetroFitService service = Factory.getRetrofit(url).create(RetroFitService.class);
        return service.getPhoto(key, photoId);
    }

    public static Observable<PictureSizes> getUrl(String url, String key, String photoId){
        RetroFitService service = Factory.getRetrofit(url).create(RetroFitService.class);
        return service.getUrl(key, photoId);
    }

    public interface RetroFitService{
        @GET("rest/?method=flickr.people.getPublicPhotos&per_page=21&format=json&nojsoncallback=1")
        Observable<Album> getPhotoList(@Query("api_key") String key, @Query("user_id") String user);

        @GET("rest/?method=flickr.photos.getInfo&format=json&nojsoncallback=1")
        Observable<Picture> getPhoto(@Query("api_key") String key, @Query("photo_id") String photoId);

        @GET("rest/?method=flickr.photos.getSizes&format=json&nojsoncallback=1")
        Observable<PictureSizes> getUrl(@Query("api_key") String key, @Query("photo_id") String photoId);
    }
}
