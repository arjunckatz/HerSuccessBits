package com.example.arjun.hersuccessbits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public WebView appWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appWebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = appWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        appWebView.loadUrl("https://hersuccessbits.wixsite.com/website/");
        appWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (appWebView.canGoBack()){
            appWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
