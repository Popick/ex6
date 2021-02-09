package com.example.ex6;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    public boolean shouldOverideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
