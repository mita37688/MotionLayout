package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Screen01 extends AppCompatActivity {

    ImageView img_taylor, img_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen01);

        img_music = findViewById(R.id.img_music);
        img_taylor = findViewById(R.id.img_taylor);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anirotate);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aniblink);

        img_taylor.startAnimation(animation);
        img_music.startAnimation(animation1);
    }
}