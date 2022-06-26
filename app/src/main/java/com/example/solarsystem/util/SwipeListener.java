package com.example.solarsystem.util;

import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SwipeListener implements View.OnTouchListener {

    //initialize variables
    GestureDetector gestureDetector;
    AppCompatActivity currentActivity;


    //constructor
    public SwipeListener(View view, AppCompatActivity currentActivity, String activityNameWhenSwipeRight, String activityNameWhenSwipeLeft, String activityNameWhenSwipeDown) {
        // Initialize threshold value
        int threshold = 100;
        int velocity_threshold = 100;

        GestureDetector.SimpleOnGestureListener listener = new GestureDetector.SimpleOnGestureListener() {

            @Override
            public boolean onDown(MotionEvent e) {
                // Pass true value
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                // Get x and y diff
                float xDiff = e2.getX() - e1.getX();
                float yDiff = e2.getY() - e1.getY();
                try {
                    if (Math.abs(xDiff) > Math.abs(yDiff)) {
                        if (Math.abs(xDiff) > threshold
                                && Math.abs(velocityX) > velocity_threshold) {
                            if (xDiff > 0) {
                                //When swipe right
                                switchActivities(activityNameWhenSwipeRight);
                            } else {
                                //When swipe left
                                switchActivities(activityNameWhenSwipeLeft);
                            }
                            return true;
                        }
                    } else {
                        // When y > x
                        //Check condition
                        if (Math.abs(yDiff) > threshold
                                && Math.abs(velocityY) > velocity_threshold) {
                            if (yDiff > 0) {
                                // When swiped down

                                switchActivities(activityNameWhenSwipeDown);
                            } else {
                                // When swiped up
                                switchActivities("MainActivity");
                            }
                            return true;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }
        };
        // Initialize gesture detector
        gestureDetector = new GestureDetector(listener);
        // Set listener on view
        view.setOnTouchListener(this);
    }

    //constructor
    public SwipeListener(View view, AppCompatActivity currentActivity, String activityNameWhenSwipeRight, String activityNameWhenSwipeLeft) {
        // Initialize threshold value
        int threshold = 100;
        int velocity_threshold = 100;

        GestureDetector.SimpleOnGestureListener listener = new GestureDetector.SimpleOnGestureListener() {

            @Override
            public boolean onDown(MotionEvent e) {
                // Pass true value
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                // Get x and y diff
                float xDiff = e2.getX() - e1.getX();
                float yDiff = e2.getY() - e1.getY();
                try {
                    if (Math.abs(xDiff) > Math.abs(yDiff)) {
                        if (Math.abs(xDiff) > threshold
                                && Math.abs(velocityX) > velocity_threshold) {
                            if (xDiff > 0) {
                                //When swipe right
                                switchActivities(activityNameWhenSwipeRight);
                            } else {
                                //When swipe left
                                switchActivities(activityNameWhenSwipeLeft);
                            }
                            return true;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }
        };
        // Initialize gesture detector
        gestureDetector = new GestureDetector(listener);
        // Set listener on view
        view.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        // return gesture event
        return gestureDetector.onTouchEvent(event);
    }

    private void switchActivities(String secondActivityName) throws ClassNotFoundException {
        Class<?> activityWhenSwipe = Class.forName("com.example.solarsystem" + secondActivityName);
        Intent prewAct = new Intent(currentActivity, activityWhenSwipe);
        currentActivity.startActivity(prewAct);
    }
}
