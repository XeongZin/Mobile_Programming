package com.example.mobile_programming_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class QnaActivity extends AppCompatActivity {
    WebView webView1;
    Button back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);

        webView1 = (WebView) findViewById(R.id.webView1);
        WebSettings settings = webView1.getSettings();
        settings.setJavaScriptEnabled(true);

        webView1.loadUrl("https://www.silla.ac.kr/ko/index.php?pCode=faq01");

        back1 = (Button) findViewById(R.id.goback1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}