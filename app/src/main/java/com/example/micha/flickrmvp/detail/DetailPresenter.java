package com.example.micha.flickrmvp.detail;

import com.example.micha.flickrmvp.BaseView;

/**
 * Created by micha on 2/10/2018.
 */

public class DetailPresenter implements DetailContract.DPresenter {

    DetailContract.DView view;

    @Override
    public void attachView(DetailContract.DView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }
}
