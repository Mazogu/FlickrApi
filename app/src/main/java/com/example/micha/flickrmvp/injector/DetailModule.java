package com.example.micha.flickrmvp.injector;

import com.example.micha.flickrmvp.detail.DetailPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micha on 2/12/2018.
 */

@Module
public class DetailModule {

    @Provides
    DetailPresenter providesDetailPresenter(){return new DetailPresenter();}

}
