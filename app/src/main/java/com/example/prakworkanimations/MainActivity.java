package com.example.prakworkanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goToFrame;
    private Button goToTween;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToFrame = findViewById(R.id.go_to_frame);
        goToTween = findViewById(R.id.go_to_tween);

        Animation slideAnim = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);

        goToTween.startAnimation(slideAnim);
        goToFrame.startAnimation(slideAnim);

        goToFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frameIntent = new Intent(getApplicationContext(), FrameAnimActivity.class);
                startActivity(frameIntent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        goToTween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tweenIntent = new Intent(getApplicationContext(), TweenAnimActivity.class);
                startActivity(tweenIntent);
            }
        });


    }
}