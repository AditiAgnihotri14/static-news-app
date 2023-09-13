package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class TrendingActivity extends AppCompatActivity {
    ListView listView;
    ArrayList list;
    TrendingAdapter trendingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listView = findViewById(R.id.list_view_trending);
        listShow();
        trendingAdapter = new TrendingAdapter(this, list);
        listView.setAdapter(trendingAdapter);
    }
    private void listShow() {

        list = new ArrayList();
        list.add(new TrendingPojo("New Air India Logo, Aircraft Livery Unveiled. These Are The Changes",R.drawable.tn_new_air_india_logo));
        list.add(new TrendingPojo("PM Modi's Peace Assurance For Manipur And A 2028 Prediction For Opposition",R.drawable.tn_pm_modi_peace));
        list.add(new TrendingPojo("On Camera, Man, 2 Daughters Kidnapped In Their SUV. A Crash Saves Them",R.drawable.tn_on_camera));
        list.add(new TrendingPojo("Jailer Review: Rajinikanth Is A Star For All Seasons And All Regions",R.drawable.tn_jailer_review));
        list.add(new TrendingPojo("\"Your Ideology To See India Divided\": J Scindia Slams Ex Boss Rahul Gandhi",R.drawable.tn_your_ideology));
        list.add(new TrendingPojo("\"What About Your MP?\" Mahua Moitra Attacks Smriti Irani On 'Flying Kiss' Row",R.drawable.tn_what_about_your_mp));
        list.add(new TrendingPojo("\"When You Bring No-Trust Vote In 2028...\": PM Modi Mocks Opposition",R.drawable.tn_when_you_bring_no_trust));
        list.add(new TrendingPojo("Future Up In Smoke? Shop Owners Sell Ganja-Laced Chocolates To Children",R.drawable.tn_smoke));
        list.add(new TrendingPojo("Congress' Adhir Chowdhury Suspended From Lok Sabha Over 'Misconduct'",R.drawable.tn_adhir_chowdhury));
        list.add(new TrendingPojo("In Terrifying Video, Chennai Schoolgirl Returning Home Brutally Attacked By Cow",R.drawable.tn_cow_attacked));
    }
}