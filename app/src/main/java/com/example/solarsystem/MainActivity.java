package com.example.solarsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton sunButton;
    ImageButton mercuryButton;
    ImageButton venusButton;
    ImageButton earthButton;
    ImageButton moonButton;
    ImageButton marsButton;
    ImageButton jupiterButton;
    ImageButton saturnButton;
    ImageButton uranusButton;
    ImageButton neptuneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        sunButton = (ImageButton) findViewById(R.id.sun_button);
        mercuryButton = (ImageButton) findViewById(R.id.mercury_button);
        venusButton = (ImageButton) findViewById(R.id.venus_button);
        earthButton = (ImageButton) findViewById(R.id.earth_button);
        moonButton = (ImageButton) findViewById(R.id.moon_button);
        marsButton = (ImageButton) findViewById(R.id.mars_button);
        jupiterButton = (ImageButton) findViewById(R.id.jupiter_button);
        saturnButton = (ImageButton) findViewById(R.id.saturn_button);
        uranusButton = (ImageButton) findViewById(R.id.uranus_button);
        neptuneButton = (ImageButton) findViewById(R.id.neptune_button);

    }

    public void onMercuryButtonClick() {

        Intent intent = new Intent(this, MercuryActivity.class);
        this.startActivity(intent);
    }

    public void onVenusButtonClick() {

        Intent intent = new Intent(this, VenusActivity.class);
        this.startActivity(intent);
    }

    public void onEarthButtonClick() {

        Intent intent = new Intent(this, EarthActivity.class);
        this.startActivity(intent);
    }

    public void onMoonButtonClick() {

        Intent intent = new Intent(this, MoonActivity.class);
        this.startActivity(intent);
    }

    public void onMarsButtonClick() {

        Intent intent = new Intent(this, MarsActivity.class);
        this.startActivity(intent);
    }

    public void onJupiterButtonClick() {

        Intent intent = new Intent(this, JupiterActivity.class);
        this.startActivity(intent);
    }

    public void onSaturnButtonClick() {

        Intent intent = new Intent(this, SaturnActivity.class);
        this.startActivity(intent);
    }


    public void onUranusButtonClick() {

        Intent intent = new Intent(this, UranusActivity.class);
        this.startActivity(intent);
    }


    public void onNeptuneButtonClick() {

        Intent intent = new Intent(this, NeptuneActivity.class);
        this.startActivity(intent);
    }
}
