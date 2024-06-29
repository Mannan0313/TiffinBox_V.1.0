package com.example.tiffinbox_v10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1,btn2;

        btn1 = findViewById(R.id.signInBtn);
        btn2 = findViewById(R.id.signUpBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity(); //method to call login activity page (Registration.class)
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpActivity(); //Method to call  signUp page(Login.class)
            }
        });
    }

    public void LoginActivity(){         //This method will open the registration page
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void SignUpActivity(){         //This method will open the registration page
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}