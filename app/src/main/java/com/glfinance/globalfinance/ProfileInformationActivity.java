package com.glfinance.globalfinance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.glfinance.globalfinance.Requestpojo.User;
import com.glfinance.globalfinance.Responsepojo.CreateUserResponse;
import com.glfinance.globalfinance.Ritrofit.APIClient;
import com.glfinance.globalfinance.Ritrofit.APIInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileInformationActivity extends AppCompatActivity {

    EditText edit_first_name, edit_last_name, edit_mail_id;
    TextView btn_continue_onclick;
    String fname, lname, mail;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_information);

        btn_continue_onclick = findViewById(R.id.btn_continue_onclick);
        edit_first_name = findViewById(R.id.edit_first_name);
        edit_last_name = findViewById(R.id.edit_last_name);
        edit_mail_id = findViewById(R.id.edit_mail_id);

        apiInterface = APIClient.getClient().create(APIInterface.class);

        btn_continue_onclick.setOnClickListener(view -> {
            fname = edit_first_name.getText().toString().trim();
            lname = edit_last_name.getText().toString().trim();
            mail = edit_mail_id.getText().toString().trim();


            /**
             Create new user
             **/
            User user = new User(fname, lname, mail);
            Call<User> call1 = apiInterface.createUser(user);
            call1.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    User user1 = response.body();
                    //CreateUserResponse userResponse = response.body();
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                    call.cancel();
                }
            });

            Toast.makeText(this, "User Created Success...!", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(ProfileInformationActivity.this, PermissionsScreen.class));
        });

    }
}