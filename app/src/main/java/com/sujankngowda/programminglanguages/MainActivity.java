package com.sujankngowda.programminglanguages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView=(WebView)findViewById(R.id.webview);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.w3schools.com");
    }
    public  void onBackPressed(){
        if (mywebView.canGoBack()){
            mywebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}