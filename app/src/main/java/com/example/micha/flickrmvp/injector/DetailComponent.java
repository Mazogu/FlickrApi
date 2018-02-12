package com.example.micha.flickrmvp.injector;

import com.example.micha.flickrmvp.detail.DetailActivity;

import dagger.Component;

/**
 * Created by micha on 2/12/2018.
 */

@Component(modules = DetailModule.class)
public interface DetailComponent {
    void inject(DetailActivity detailActivity);
}
