package com.example.solarsystem.util;

import android.content.Context;
import android.webkit.WebView;

import androidx.annotation.NonNull;

public class GifAnimationWebView extends WebView {

    public GifAnimationWebView(@NonNull Context context, String path) {
        super(context);
        loadUrl(path);
    }
}