package com.aryaman.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {

    MediaPlayer mp1,mp2;
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        mp1 = new MediaPlayer().create(Music.this, R.raw.dontworry);
        mp2 = new MediaPlayer().create(Music.this, R.raw.maafiastyle);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.pause();
                mp1.start();
                /*if (bt2.isActivated()) {
                    mp2.stop();
                    mp1.start();
                }else {
                    mp1.start();
                }*/
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.pause();
                mp2.start();
                /*if(bt1.isActivated()) {
                    mp1.stop();
                    mp2.start();
                }else {
                    mp2.start();
                }*/
            }
        });
    }
}