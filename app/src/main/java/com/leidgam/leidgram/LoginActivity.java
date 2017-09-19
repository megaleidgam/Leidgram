package com.leidgam.leidgram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.leidgam.leidgram.view.ContainerActivity;
import com.leidgam.leidgram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAcoount (View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);


    }

    public void goHome(View view){
        Intent in = new Intent(this, ContainerActivity.class);
        startActivity(in);
    }
}
