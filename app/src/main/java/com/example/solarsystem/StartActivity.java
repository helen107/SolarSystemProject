package com.example.solarsystem;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        startButton = (ImageButton) findViewById(R.id.start_button);
    }

    public void onStartButtonClick() {
        setContentView(R.layout.main_activity);
    }
}