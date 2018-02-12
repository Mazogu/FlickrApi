package com.example.micha.flickrmvp.main;

import com.example.micha.flickrmvp.BasePresenter;
import com.example.micha.flickrmvp.BaseView;
import com.example.micha.flickrmvp.model.SimplePhoto;
import com.example.micha.flickrmvp.utils.FlickrService;

import java.util.List;

/**
 * Created by micha on 2/10/2018.
 */

public interface MainContract {
    public interface MView extends BaseView{
        void setPhotoList(List<SimplePhoto> list);
    }

    public interface MPresenter extends BasePresenter<MView>{
        public void setService(FlickrService service);
    }
}
