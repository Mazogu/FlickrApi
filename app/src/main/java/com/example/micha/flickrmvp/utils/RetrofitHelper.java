package com.example.micha.flickrmvp.utils;



import com.example.micha.flickrmvp.model.Photo;
import com.example.micha.flickrmvp.model.PhotoList;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by micha on 2/10/2018.
 */

public class RetrofitHelper {
    public static class Factory{
        public static Retrofit getRetrofit(String url){
            return new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create()).baseUrl(url).build();
        }

        public static Observable<PhotoList> getPhotoList(String url, String user, String key){
            RetroFitService service = Factory.getRetrofit(url).create(RetroFitService.class);
            return service.getPhotoList(key,user);
        }

        public static Observable<Photo> getPhoto(String url,String key, String photoId){
            RetroFitService service = Factory.getRetrofit(url).create(RetroFitService.class);
            return service.getPhoto(key, photoId);
        }

        public interface RetroFitService{
            @GET("rest/?method=flickr.people.getPublicPhotos&api_key={key}&user_id={user}&format=json")
            Observable<PhotoList> getPhotoList(@Path("key") String key,@Path("user") String user);

            @GET("rest/?method=flickr.photos.getInfo&api_key={key}&photo_id={photo_id}&format=json")
            Observable<Photo> getPhoto(@Path("key") String key, @Path("photo_id") String photoId);
        }
    }
}
