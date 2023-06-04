package com.example.mobile_programming_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class StepActivity extends AppCompatActivity {
    WebView webView4;
    Button back4;
    public StepActivity() {

    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step);

        webView4 = (WebView) findViewById(R.id.webView4);
        WebSettings settings = webView4.getSettings();
        settings.setJavaScriptEnabled(true);

        webView4.loadUrl("https://step.silla.ac.kr/");

        back4 = (Button) findViewById(R.id.goback4);

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}