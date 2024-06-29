package com.example.tiffinbox_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Button btn1;

        btn1 = findViewById(R.id.signUpBtn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLogin(); //Calling Login Method
            }
        });
    }
    public void gotoLogin(){         //This method will open the Login page
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}