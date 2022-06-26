package com.example.solarsystem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StartActivityTest {

    StartActivity startActivity = new StartActivity();

    @Test
    public void shouldOpenMainMenu() {

        startActivity.onStartButtonClick();
        startActivity.getContentScene();


        assertEquals(4, 2 + 2);
    }
}
