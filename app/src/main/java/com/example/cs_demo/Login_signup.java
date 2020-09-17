package com.example.cs_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
    }

    public void otp(View view) {
        Intent i=new Intent(Login_signup.this,Login.class);
        startActivity(i);
    }

    public void guest(View view) {
        Intent i=new Intent(Login_signup.this,MainActivity.class);
        startActivity(i);
    }

    public void gmail(View view) {
        Intent i=new Intent(Login_signup.this,Login.class);
        startActivity(i);
    }
}