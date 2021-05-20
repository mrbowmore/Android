package com.example.exeger;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://tranquil-anchorage-62557.herokuapp.com/api");
    }

    @Override


    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        }
        else{
        super.onBackPressed();
    }
    }


}