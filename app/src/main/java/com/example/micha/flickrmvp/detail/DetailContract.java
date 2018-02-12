package com.example.micha.flickrmvp.detail;

import com.example.micha.flickrmvp.BasePresenter;
import com.example.micha.flickrmvp.BaseView;

/**
 * Created by micha on 2/10/2018.
 */

public interface DetailContract {
    public interface DView extends BaseView{

    }

    public interface DPresenter extends BasePresenter<DView> {
        String getDate(String iDate);
    }
}
