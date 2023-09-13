package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PoliticalWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political_web_view);

        webView = findViewById(R.id.webViewIdPolitical);

        int position = getIntent().getIntExtra("news_story_political", 0);

        if (position == 0) {
            webView.loadUrl("https://economictimes.indiatimes.com/news/politics-and-nation/modi-govt-wants-to-ensure-control-over-ec-in-poll-year-congress/articleshow/102635372.cms");
        } else if (position == 1) {
            webView.loadUrl("https://economictimes.indiatimes.com/news/politics-and-nation/ncp-mla-jitendra-awhad-caught-on-camera-threatening-dean-of-hospital-in-thane/videoshow/102634932.cms");
        } else if (position == 2) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/delhi-services-bill-bjp-changing-capital-powers-political-pulse-8887150/");
        } else if (position == 3) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/pinarayi-vijayan-kerala-cm-daughter-illegal-payments-crores-8887077/");
        } else if (position == 4) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/power-of-no-trust-motion-brought-pm-to-house-says-adhir-8886804/");
        }else if (position == 5) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/tensions-still-simmering-bjp-plans-tiranga-yatras-across-haryana-8886626/");
        } else if (position == 6) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/mizo-mp-k-vanlalvena-cut-off-as-he-rises-to-speak-on-manipur-issue-8886481/");
        } else if (position == 7) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/ed-knock-surprises-gopal-kanda-aides-nothing-decided-joining-bjp-8886089/");
        } else if (position == 8) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/today-in-politics-pm-modi-speech-lok-sabha-rahul-gandhi-8885105/");
        } else if (position == 9) {
            webView.loadUrl("https://indianexpress.com/article/political-pulse/bjp-unveils-new-bihar-team-old-new-faces-caste-region-diversity-8885110/");
        }
    }
}