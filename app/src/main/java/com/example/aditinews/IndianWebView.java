package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class IndianWebView extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_web_view);

        webView = findViewById(R.id.webViewIdIndian);

        int position = getIntent().getIntExtra("news_story_india", 0);

        if (position == 0) {
            webView.loadUrl("https://www.ndtv.com/india-news/lets-work-together-for-restoring-peace-in-manipur-pm-pm-to-opposition-4288235");
        } else if (position == 1) {
            webView.loadUrl("https://www.ndtv.com/india-news/congress-leaders-to-meet-today-to-discuss-upcoming-rajasthan-polls-4288218");
        } else if (position == 2) {
            webView.loadUrl("https://www.ndtv.com/india-news/in-a-first-fuel-outlet-run-by-women-convicts-opens-in-chennai-4288180");
        } else if (position == 3) {
            webView.loadUrl("https://www.ndtv.com/india-news/jadavpur-university-student-falls-from-hostel-dies-friend-alleges-ragging-4288111");
        } else if (position == 4) {
            webView.loadUrl("https://www.ndtv.com/india-news/schools-in-haryanas-nuh-to-open-tomorrow-4288064");
        }else if (position == 5) {
            webView.loadUrl("https://www.ndtv.com/india-news/businessman-linked-to-mumbai-covid-centre-scam-seeks-to-withdraw-statement-4288008");
        } else if (position == 6) {
            webView.loadUrl("https://www.ndtv.com/india-news/narayana-murthy-warns-about-impact-of-indias-high-population-growth-4287984");
        } else if (position == 7) {
            webView.loadUrl("https://www.ndtv.com/india-news/no-one-in-manipur-blames-pm-amit-shah-assam-chief-minister-on-violence-4287961");
        } else if (position == 8) {
            webView.loadUrl("https://www.ndtv.com/india-news/air-india-not-just-another-business-but-a-passion-tata-sons-chairman-4287938");
        }else if (position == 9) {
            webView.loadUrl("https://www.ndtv.com/india-news/suspended-special-court-judge-sudhir-parmar-arrested-by-probe-agency-4287935");
        }
    }
}