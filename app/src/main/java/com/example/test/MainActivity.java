
package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void controlBot(View view) {
        //add buttons and send data via webRTC
        Intent intent = new Intent(this, controlBot.class);
        startActivity(intent);
    }

    public void sendVideo(View view) {
        //capture video from camera and transmit via webRTC
        Intent intent = new Intent(this, sendVideo.class);
        startActivity(intent);
    }
}