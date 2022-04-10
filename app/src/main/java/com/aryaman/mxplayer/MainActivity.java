//3 activities

//firstpage
//1st activity has 3 buttons aboutus,music,gallery
//image in horizontal view (right)
//on click aboutus -> new page(aboutus)

//aboutus page
//CEO image and disc below in card view
//manager image and disc below in card view

//music
//songname , play song
//if clicked on song 2 then song 1 will be paused

//galary
//backgroud song
//images in card view name below
//song stops after back button


package com.aryaman.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AboutUs.class);
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, Music.class);
                startActivity(switchActivityIntent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, Gallery.class);
                startActivity(switchActivityIntent);
            }
        });
    }
}