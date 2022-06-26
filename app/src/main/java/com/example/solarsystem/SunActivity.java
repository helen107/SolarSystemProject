package com.example.solarsystem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.solarsystem.util.SwipeListener;

public class SunActivity extends AppCompatActivity {

    ConstraintLayout prewLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_prew);

        prewLayout = findViewById(R.id.sun_constraint_layout);

        // initialize swipe listener
        swipeListener = new SwipeListener(prewLayout,
                this,
                "MainActivity",
                "MercuryActivity",
                "content.SunContentActivity");
    }
}
