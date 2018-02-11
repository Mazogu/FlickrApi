package com.example.micha.flickrmvp.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.micha.flickrmvp.R;

public class DetailActivity extends AppCompatActivity implements DetailContract.DView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
