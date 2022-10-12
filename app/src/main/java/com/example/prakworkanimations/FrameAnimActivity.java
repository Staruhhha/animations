package com.example.prakworkanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameAnimActivity extends AppCompatActivity {

    private ImageView animationIV;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_anim);

        animationIV = findViewById(R.id.frame_anim_iv);
        startBtn = findViewById(R.id.start_frame);
        pauseBtn = findViewById(R.id.pause_frame);

        AnimationDrawable frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.stop();
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}