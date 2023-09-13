package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class TrendingWebView extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_web_view);
        webView = findViewById(R.id.webViewIdTrending);

        int position = getIntent().getIntExtra("news_story_trending", 0);
        if (position == 0) {
            webView.loadUrl("https://www.ndtv.com/india-news/air-india-unveils-new-logo-the-vista-and-aircraft-livery-4287455#trendingnow");
        } else if (position == 1) {
            webView.loadUrl("https://www.ndtv.com/india-news/no-trust-vote-is-always-lucky-for-us-pm-modi-takes-dig-at-opposition-4286642#trendingnow");
        } else if (position == 2) {
            webView.loadUrl("https://www.ndtv.com/noida-news/on-camera-man-2-daughters-kidnapped-in-their-suv-a-crash-saves-them-4288151#trendingnow");
        } else if (position == 3) {
            webView.loadUrl("https://www.ndtv.com/entertainment/jailer-review-rajinikanth-is-a-star-for-all-seasons-and-all-regions-2-5-stars-4286279#trendingnow");
        } else if (position == 4) {
            webView.loadUrl("https://www.ndtv.com/india-news/parliament-live-lok-sabha-no-confidence-motion-pm-narendra-modi-jyotiraditya-scindia-india-their-hearts-dont-meet-their-parties-have-j-scindia-mocks-i-4286311#trendingnow");
        }else if (position == 5) {
            webView.loadUrl("https://www.ndtv.com/india-news/misplaced-priorities-mahua-moitra-attacks-smriti-irani-on-flying-kiss-row-4286168#trendingnow");
        }else if (position == 6) {
            webView.loadUrl("https://www.ndtv.com/india-news/when-you-bring-no-trust-vote-in-2028-pm-modi-mocks-opposition-4286879#trendingnow");
        }else if (position == 7) {
            webView.loadUrl("https://www.ndtv.com/india-news/getting-children-high-125-kg-ganja-laced-chocolates-seized-in-mangaluru-4287833#trendingnow");
        }else if (position == 8) {
            webView.loadUrl("https://www.ndtv.com/india-news/congress-adhir-chowdhury-suspended-from-lok-sabha-over-misconduct-4287317#trendingnow");
        }else if (position == 9) {
            webView.loadUrl("https://www.ndtv.com/india-news/in-terrifying-video-chennai-schoolgirl-returning-home-brutally-attacked-by-cow-4287308#trendingnow");
        }
    }
}