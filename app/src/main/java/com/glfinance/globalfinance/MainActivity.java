package com.glfinance.globalfinance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout continue_with_mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        continue_with_mobile = findViewById(R.id.continue_with_mobile);

        continue_with_mobile.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MobilenumberActivity.class));
        });

    }
}