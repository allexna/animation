package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sun link
        ImageView sunImageView=findViewById(R.id.sun);
        //animation
        Animation sunRiseAnimation= AnimationUtils.loadAnimation(this,R.anim.sun_rise);
        sunImageView.startAnimation(sunRiseAnimation);
    }
}
