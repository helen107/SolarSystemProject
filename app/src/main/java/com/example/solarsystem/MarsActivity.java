package com.example.solarsystem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.solarsystem.util.SwipeListener;

public class MarsActivity extends AppCompatActivity {

    ConstraintLayout prewLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mars_prew);

        prewLayout = findViewById(R.id.mars_prew_layout);

        // initialize swipe listener
        swipeListener = new SwipeListener(prewLayout,
                this,
                "EarthActivity",
                "JupiterActivity",
                "content.MarsContentActivity");
    }
}
