package com.example.micha.flickrmvp;

/**
 * Created by micha on 2/10/2018.
 */

public interface BasePresenter<T extends BaseView> {
    public void attachView(T view);
    public void detachView();
}
