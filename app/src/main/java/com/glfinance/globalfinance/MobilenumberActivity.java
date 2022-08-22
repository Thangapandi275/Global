package com.glfinance.globalfinance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MobilenumberActivity extends AppCompatActivity {

    ImageView clear_image;
    EditText input_mobile_number;
    TextView btn_continue_onclick;
    String mobile_no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobilenumber);

        clear_image = findViewById(R.id.clear_image);
        input_mobile_number = findViewById(R.id.input_mobile_number);
        btn_continue_onclick = findViewById(R.id.btn_continue_onclick);

        clear_image.setOnClickListener(view -> {
            input_mobile_number.setText("");
        });

        btn_continue_onclick.setOnClickListener(view -> {
            mobile_no  = input_mobile_number.getText().toString().trim();
            Intent intent = new Intent(MobilenumberActivity.this, EnterotpActivity.class);
            intent.putExtra("mobile", mobile_no);
            startActivity(intent);
        });

    }
}