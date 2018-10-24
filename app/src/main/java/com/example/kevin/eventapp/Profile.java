package com.example.kevin.eventapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private TextView user;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity2", "onCreate: Activity Created");
        setContentView(R.layout.activity_profile);
        user = (TextView)findViewById(R.id.user_name);
        name = getIntent().getStringExtra("username");
        user.setText(name);

    }


    protected void onResume() {
        super.onResume();
        Log.d("Activity2", "onStart: Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity2","onPause: Acitvity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity2", "onStop: Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity2", "onDestroy: Activity Destroyed");
    }
}
