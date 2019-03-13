package com.example.appcoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    private WebView webViewku;
    private WebSettings webSettingku;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        webViewku = (WebView)findViewById(R.id.webView1);
        webSettingku = webViewku.getSettings();
        webViewku.setWebViewClient(new WebViewClient());
        webViewku.getSettings().setJavaScriptEnabled(true);
        webViewku.setWebChromeClient(new WebChromeClient());

        webViewku.loadUrl("http://backoffice.codercoffee.id/");

    }
}
