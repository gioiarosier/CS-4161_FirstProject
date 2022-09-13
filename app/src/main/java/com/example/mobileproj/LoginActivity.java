package com.example.mobileproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.StatsLog;
import android.widget.TextView;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    LottieAnimationView fruit;
    FloatingActionButton google, fb, twt;
    ViewPager view;
    TextView header, textview2;
    private Object FirebaseAnalytics;
    private Object Starter;
    private StatsLog Analytics;
    private FirebaseAuth mAuth;
    //TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        fruit = findViewById(R.id.avocadoAnimation);
        google = findViewById(R.id.googlebutton);
        fb = findViewById(R.id.fbbutton);
        twt = findViewById(R.id.twitterbutton);
        header = findViewById(R.id.textView);
        //tab = findViewById(R.id.tabLayout);
        view = findViewById(R.id.viewPager);

//        tab.addTab(tab.newTab().setText("Login"));
//        tab.addTab(tab.newTab().setText("Sign Up"));
//        tab.setTabGravity(TabLayout.GRAVITY_FILL);

        //view.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));


    }

//    public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        textview2 = findViewById(R.id.textView2);
//        textview2.append(currentUser.getDisplayName());
//    }
}