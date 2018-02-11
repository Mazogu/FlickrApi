package com.example.micha.flickrmvp.utils;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class FlickrService extends Service {

    FlickrBinder binder = new FlickrBinder();

    public FlickrService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return binder;
    }

    public class FlickrBinder extends Binder{
        public FlickrService getService(){
            return FlickrService.this;
        }
    }
}
