package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class EntertainmentWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_web_view);

        webView = findViewById(R.id.webViewIdEntertainment);

        int position = getIntent().getIntExtra("news_story_entertainment", 0);

        if (position == 0) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/bollywood/gal-gadot-was-extremely-caring-would-keep-reminding-alia-bhatt-to-stay-hydrated-i-felt-too-comfortable-8887163/");
        } else if (position == 1) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/bollywood/meghna-naidu-got-flak-for-kaliyon-ka-chaman-people-said-look-at-her-clothes-8887142/");
        } else if (position == 2) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/bollywood/yaariyan-2-teaser-divya-khosla-kumar-yash-daasguptaa-starrer-celebrates-bond-of-love-friendship-8887105/");
        } else if (position == 3) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/bollywood/ishita-dutta-vatsal-seth-reveal-their-sons-name-watch-his-naamkaran-ceremony-video-8887087/");
        } else if (position == 4) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/movie-review/heart-of-stone-movie-review-waste-of-alia-bhatt-gal-gadot-netflix-film-8886082/");
        }else if (position == 5) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/tamil/jailer-box-office-collection-day-1-rajinikanth-rs-52-crore-highest-tamil-opener-of-2023-8887058/");
        } else if (position == 6) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/movie-review/omg-2-movie-review-akshay-kumar-pankaj-tripathi-laugh-out-loud-film-8887084/");
        } else if (position == 7) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/bollywood/abhishek-bachchan-hopes-two-ladies-jaya-bachchan-aishwarya-rai-do-more-work-8885890/");
        } else if (position == 8) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/movie-review/red-white-royal-blue-movie-review-taylor-zakhar-perez-nicholas-galitzine-prime-video-8883974/");
        }else if (position == 9) {
            webView.loadUrl("https://indianexpress.com/article/entertainment/bollywood/shweta-tripathi-calls-mirazapur-golu-gupta-her-most-challenging-role-shares-update-on-yeh-kaali-kaali-ankhein-season-2-8886486/");
        }
    }
}