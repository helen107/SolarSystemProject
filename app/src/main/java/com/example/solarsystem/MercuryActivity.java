package com.example.solarsystem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.solarsystem.util.SwipeListener;

public class MercuryActivity extends AppCompatActivity {

    ConstraintLayout prewLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mercury_prew);

        prewLayout = findViewById(R.id.mercury_contraint_layout);

        // initialize swipe listener
        swipeListener = new SwipeListener(prewLayout,
                this,
                "SunActivity",
                "VenusActivity",
                "content.MercuryContentActivity");
    }
}
