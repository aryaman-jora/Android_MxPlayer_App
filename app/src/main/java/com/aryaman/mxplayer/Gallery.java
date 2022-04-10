package com.aryaman.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class Gallery extends AppCompatActivity {

    ImageView imageView;
    MediaPlayer mp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mp = new MediaPlayer().create(Gallery.this, R.raw.dontworry);
        mp.start();
    }

    public void onBackPressed() {

        super.onBackPressed();
        mp.stop();
    }
    }