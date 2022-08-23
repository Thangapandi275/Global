package com.glfinance.globalfinance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EnterotpActivity extends AppCompatActivity {

    EditText input_opt_number;
    ImageView go_back_from_otp;
    TextView resend_otp, show_mobile_number, edit_mobile_number, btn_continue_onclick;
    String otp;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterotp);

//        Sample

        show_mobile_number = findViewById(R.id.show_mobile_number);
        resend_otp = findViewById(R.id.resend_otp);
        input_opt_number = findViewById(R.id.input_opt_number);
        edit_mobile_number = findViewById(R.id.edit_mobile_number);
        btn_continue_onclick = findViewById(R.id.btn_continue_onclick);
        go_back_from_otp = findViewById(R.id.go_back_from_otp);

        Intent intent = getIntent();
        show_mobile_number.setText("" + intent.getStringExtra("mobile"));

        btn_continue_onclick.setOnClickListener(view -> {
            otp = input_opt_number.getText().toString().trim();
            if (otp.equals("1234")) {
                startActivity(new Intent(EnterotpActivity.this, ProfileInformationActivity.class));
            } else {
                Toast.makeText(this, "Enter Valid OTP..!", Toast.LENGTH_SHORT).show();
            }
        });

        edit_mobile_number.setOnClickListener(view -> {
            startActivity(new Intent(EnterotpActivity.this, MobilenumberActivity.class));
        });
        go_back_from_otp.setOnClickListener(view -> {
            startActivity(new Intent(EnterotpActivity.this, MobilenumberActivity.class));
        });


    }
}