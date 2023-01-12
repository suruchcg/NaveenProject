package com.labor.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.labor.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView btnRegistration;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin= findViewById(R.id.btnLogin);
        btnRegistration= findViewById(R.id.btnRegistration);

        btnLogin.setOnClickListener(this);
        btnRegistration.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                break;

            case R.id.btnRegistration:
                startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
                break;
        }
    }
}