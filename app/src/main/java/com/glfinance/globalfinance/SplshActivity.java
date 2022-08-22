package com.glfinance.globalfinance;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplshActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splsh);

        handler = new Handler();

        handler.postDelayed((Runnable) () -> {
            startActivity(new Intent(SplshActivity.this, MainActivity.class));
        }, 3000);

    }
}