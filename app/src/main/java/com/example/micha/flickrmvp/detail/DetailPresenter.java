package com.example.micha.flickrmvp.detail;

import com.example.micha.flickrmvp.BaseView;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Override
    public String getDate(String iDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String date = format.format(new Date(Long.parseLong(iDate)));
        return date;
    }
}
