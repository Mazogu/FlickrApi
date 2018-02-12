package com.example.micha.flickrmvp.detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.micha.flickrmvp.R;
import com.example.micha.flickrmvp.injector.DaggerDetailComponent;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity implements DetailContract.DView {

    @Inject
    DetailPresenter presenter;

    TextView description,title,owner,date;
    ImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.detailTitle);
        owner = findViewById(R.id.detailOwner);
        date = findViewById(R.id.detailDate);
        description = findViewById(R.id.detailDescription);
        photo = findViewById(R.id.detailPhoto);
        DaggerDetailComponent.create().inject(this);
        presenter.attachView(this);
        Intent intent = getIntent();
        if(intent.getAction().equals("Detail")){
            String iTitle = intent.getStringExtra("title");
            String iDescription = intent.getStringExtra("description");
            String iOwner = intent.getStringExtra("owner");
            String iUrl = intent.getStringExtra("url");
            String iDate = intent.getStringExtra("date");
            title.setText(iTitle);
            description.setText(iDescription);
            date.setText(presenter.getDate(iDate));
            owner.setText(iOwner);
            Glide.with(this).load(iUrl).into(photo);
        }
    }

    @Override
    public void showError(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
