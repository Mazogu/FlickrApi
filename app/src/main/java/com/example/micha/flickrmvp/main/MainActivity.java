package com.example.micha.flickrmvp.main;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.micha.flickrmvp.R;
import com.example.micha.flickrmvp.injector.DaggerMainComponent;
import com.example.micha.flickrmvp.model.SimplePhoto;
import com.example.micha.flickrmvp.utils.FlickrService;
import com.example.micha.flickrmvp.utils.PhotoAdapter;

import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity implements MainContract.MView {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;

    @Inject
    public MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new Timber.DebugTree());
        recyclerView = findViewById(R.id.recycle);
        DaggerMainComponent.create().inject(this);
        presenter.attachView(this);
        Intent intent = new Intent(getApplicationContext(), FlickrService.class);
        bindService(intent, connection, BIND_AUTO_CREATE);
        startService(intent);

    }

    ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            FlickrService service = ((FlickrService.FlickrBinder) iBinder).getService();
            presenter.setService(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

    @Override
    public void showError(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPhotoList(List<SimplePhoto> list) {
        PhotoAdapter adapter = new PhotoAdapter(list,this);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}
