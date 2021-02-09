package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    EditText geturl;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
        geturl=(EditText)findViewById(R.id.geturl);
    }

    public void gotopage(View view) {
        url=geturl.getText().toString();
        wv.loadUrl(url);
        System.out.println("ok dude what now?  " + url);
    }
}


