package com.example.micha.flickrmvp.injector;

import com.example.micha.flickrmvp.main.MainActivity;

import dagger.Component;

/**
 * Created by micha on 2/11/2018.
 */

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
