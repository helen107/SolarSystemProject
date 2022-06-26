package com.example.solarsystem.content;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.solarsystem.R;
import com.example.solarsystem.util.SwipeListener;

public class MercuryContentActivity extends AppCompatActivity {

    ConstraintLayout swipeLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mercuty_content);

        swipeLayout = findViewById(R.id.mercury_content_contraint_layout);

        // initialize swipe listener
        swipeListener = new SwipeListener(swipeLayout,
                this,
                "SunActivity",
                "VenusActivity");
    }
}
