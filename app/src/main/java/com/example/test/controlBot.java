package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class controlBot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_bot);
    }

    public void moveForwad(View view) {
        //send 'F' signal
    }

    public void moveReverse(View view) {
        //send 'R' signal
    }
}
