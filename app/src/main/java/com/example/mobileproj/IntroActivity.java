package com.example.mobileproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroActivity extends AppCompatActivity {

    ImageView logo, background;
    TextView fruit, basket;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        background = findViewById(R.id.bgimg);
        fruit = findViewById(R.id.fruittext);
        basket = findViewById(R.id.baskettext);
        lottieAnimationView = findViewById(R.id.bouncingAnimation);

        background.animate().translationY(-2300).setDuration(1000).setStartDelay(4000);
        fruit.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        basket.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(i);
                //overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        }, 6000);
    }
}