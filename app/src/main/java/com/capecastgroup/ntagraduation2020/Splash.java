package com.capecastgroup.ntagraduation2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent LoadingIntent = new Intent(Splash.this, MainActivity.class);
                overridePendingTransition(0, 0);
                startActivity(LoadingIntent);
                finish();
            }
        }, 3000);
    }
}
