package com.example.starizpk.p1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (getSharedPreferences(ConstantManager.SHARED_PREFERENCES, MODE_PRIVATE).getString("email", "null").equals("null")) {
                    startActivity(new Intent(splash.this, LoginActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(splash.this, activity_menu.class));
                    finish();
                }


            }
        }, secondsDelayed * 3000);
    }
}
