package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WorldWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_web_view);

        webView = findViewById(R.id.webViewIdWorld);

        int position = getIntent().getIntExtra("news_story_world", 0);

        if (position == 0) {
            webView.loadUrl("https://www.ndtv.com/world-news/hawaii-wildfire-looks-like-a-warzone-tourists-narrate-escape-from-burning-hawaii-4288580");
        } else if (position == 1) {
            webView.loadUrl("https://www.ndtv.com/world-news/i-miss-the-sun-australian-journalist-cheng-lei-jailed-in-china-4288462");
        } else if (position == 2) {
            webView.loadUrl("https://www.ndtv.com/world-news/29-dead-16-missing-after-severe-floods-in-chinas-hebei-4288442");
        } else if (position == 3) {
            webView.loadUrl("https://www.ndtv.com/world-news/china-claims-to-have-arrested-alleged-cia-spy-recruited-in-italy-report-4288384");
        } else if (position == 4) {
            webView.loadUrl("https://www.ndtv.com/world-news/emergency-declared-in-ecuador-after-presidential-candidate-shot-dead-4288375");
        }else if (position == 5) {
            webView.loadUrl("https://www.ndtv.com/world-news/6-0-magnitude-earthquake-hits-japans-hokkaido-report-4288345");
        } else if (position == 6) {
            webView.loadUrl("https://www.ndtv.com/world-news/russia-launches-lunar-spacecraft-to-find-water-on-moon-4288327");
        } else if (position == 7) {
            webView.loadUrl("https://www.ndtv.com/world-news/joe-biden-calls-china-a-ticking-time-bomb-due-to-economic-troubles-4288314");
        } else if (position == 8) {
            webView.loadUrl("https://www.ndtv.com/world-news/warehouse-near-russia-president-vladimir-putins-residence-in-moscow-is-on-fire-report-4288301");
        }else if (position == 9) {
            webView.loadUrl("https://www.ndtv.com/world-news/north-korea-developing-nuclear-weapons-evading-sanctions-2023-un-report-4288300");
        }
    }
}