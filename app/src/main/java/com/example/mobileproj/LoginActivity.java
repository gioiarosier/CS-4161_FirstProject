package com.example.mobileproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LoginActivity extends AppCompatActivity {
    LottieAnimationView fruit;
    FloatingActionButton google, fb, twt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        fruit = findViewById(R.id.avocadoAnimation);
        google = findViewById(R.id.googlebutton);
        fb = findViewById(R.id.fbbutton);
        twt = findViewById(R.id.twitterbutton);

        google.animate().translationY(-200).setDuration(1000).setStartDelay(1000);
        fb.animate().translationY(-200).setDuration(1000).setStartDelay(1500);
        twt.animate().translationY(-200).setDuration(1000).setStartDelay(2000);
        google.animate().translationY(0).setDuration(1000).setStartDelay(2100);
        fb.animate().translationY(0).setDuration(1000).setStartDelay(2600);
        twt.animate().translationY(0).setDuration(1000).setStartDelay(3100);
    }
}