package com.example.solarsystem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.solarsystem.util.SwipeListener;

public class UranusActivity extends AppCompatActivity {

    ConstraintLayout prewLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uranus_prew);

        prewLayout = findViewById(R.id.uranus_constraint_layout);

        // initialize swipe listener
        swipeListener = new SwipeListener(prewLayout,
                this,
                "MainActivity",
                "MercuryActivity",
                "content.SunContentActivity");

    }
}
