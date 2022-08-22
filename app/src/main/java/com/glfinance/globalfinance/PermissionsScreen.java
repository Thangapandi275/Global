package com.glfinance.globalfinance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PermissionsScreen extends AppCompatActivity {

    TextView btn_continue_onclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions_screen);

        btn_continue_onclick = findViewById(R.id.btn_continue_onclick);

        btn_continue_onclick.setOnClickListener(view ->{
            startActivity(new Intent(PermissionsScreen.this, CommingSoonActivity.class));
        });

    }
}