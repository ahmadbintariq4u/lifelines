package com.comsats.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.comsats.lifelines.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //will hide the status bar of the activity
        getSupportActionBar().hide();

    }
}