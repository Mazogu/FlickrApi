package com.example.micha.flickrmvp.injector;

import com.example.micha.flickrmvp.main.MainPresenter;
import com.example.micha.flickrmvp.utils.FlickrService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micha on 2/11/2018.
 */

@Module
public class MainModule {

    @Provides
    MainPresenter providesMainPresenter(){return new MainPresenter();}
}
