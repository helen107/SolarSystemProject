package com.example.solarsystem.content;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.solarsystem.R;
import com.example.solarsystem.util.SwipeListener;

public class VenusContentActivity  extends AppCompatActivity {

    ConstraintLayout swipeLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venus_content);

        swipeLayout = findViewById(R.id.venus_content_constraint_layout);

        // initialize swipe listener
        swipeListener = new SwipeListener(swipeLayout,
                this,
                "MercuryActivity",
                "EarthActivity");
    }
}
