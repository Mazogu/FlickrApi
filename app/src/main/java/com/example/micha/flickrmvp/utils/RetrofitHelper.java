package com.example.micha.flickrmvp.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by micha on 2/10/2018.
 */

public class RetrofitHelper {
    public static class Factory{
        public static Retrofit getRetrofit(String url){
            return new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create()).baseUrl(url).build();
        }

        public interface RetroFitService{

        }
    }
}
