package com.example.calculatecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToNext();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

    private void goToNext() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
