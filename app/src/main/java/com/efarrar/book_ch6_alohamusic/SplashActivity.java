package com.efarrar.book_ch6_alohamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //creating timerTask for splash screen
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();       //release the resources and closes the activity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        };
        //creating timer
        Timer opening = new Timer();
        opening.schedule(task, 10000);

    }
}
