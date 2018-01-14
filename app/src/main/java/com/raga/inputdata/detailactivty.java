package com.raga.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class detailactivty extends AppCompatActivity {

    TextView text11, text22;
    ImageView gambar1;
    WebView wvbrowser;
    WebSettings webset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivty);

        text11 = (TextView)findViewById(R.id.text);
        text22 = (TextView)findViewById(R.id.text2);
        gambar1 = (ImageView)findViewById(R.id.image1);
        wvbrowser= (WebView)findViewById(R.id.web1);

        Bundle tampungdata = getIntent().getExtras();

        String text1 =tampungdata.getString("judul");
        String tex2= tampungdata.getString("subjudul");
        Integer image1 = tampungdata.getInt("gambar");
        String url = tampungdata.getString("url");

        text11.setText(text1);
        text22.setText(tex2);
        gambar1.setImageResource(image1);
        webset = wvbrowser.getSettings();
        webset.setJavaScriptEnabled(true);
        wvbrowser.setWebViewClient(new WebViewClient());
        wvbrowser.loadUrl(url);

    }
}
