package com.example.mobile_programming_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class SillanetActivity extends AppCompatActivity {
    WebView webView5;
    Button back5;

    public SillanetActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sillanet);


        webView5 = (WebView) findViewById(R.id.webView5);
        WebSettings settings = webView5.getSettings();
        settings.setJavaScriptEnabled(true);

        webView5.loadUrl("https://nsti.silla.ac.kr/nsti/index.php?pCode=login&url=%2Fnsti%2Findex.php%3FpCode%3DS-001000141");

        back5 = (Button) findViewById(R.id.goback5);

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}