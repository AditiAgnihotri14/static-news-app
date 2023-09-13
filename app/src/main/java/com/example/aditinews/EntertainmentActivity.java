package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentActivity extends AppCompatActivity {

    ListView listView;
    ArrayList list;
    EntertainmentAdapter entertainmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listView = findViewById(R.id.list_view_entertainment);
        listShow();
        entertainmentAdapter = new EntertainmentAdapter(this, list);
        listView.setAdapter(entertainmentAdapter);
    }

    private void listShow() {

        list = new ArrayList();
        list.add(new EntertainmentPojo("Gal Gadot was ‘extremely caring’, would keep reminding Alia Bhatt to stay hydrated: ‘I felt too comfortable’",R.drawable.en_gal_gadot));
        list.add(new EntertainmentPojo("Meghna Naidu says she got ‘a lot of flak’ for ‘Kaliyon Ka Chaman’: ‘People said look at her clothes, her dance’",R.drawable.en_meghna_naidu));
        list.add(new EntertainmentPojo("Yaariyan 2 teaser: Divya Khosla Kumar, Yash Daasguptaa-starrer celebrates bond of love, friendship",R.drawable.en_yaariyan2));
        list.add(new EntertainmentPojo("Ishita Dutta-Vatsal Seth reveal their son’s name, watch his ‘naamkaran’ ceremony video",R.drawable.en_ishita_dutta));
        list.add(new EntertainmentPojo("Heart of Stone movie review: A big waste of Alia Bhatt’s talents, the new Netflix film is beautifully filmed but badly written",R.drawable.en_heart_of_stone));
        list.add(new EntertainmentPojo("Jailer box office collection Day 1: Rajinikanth-starrer collects Rs 52 crore in India, becomes biggest Tamil opener of the year",R.drawable.en_jailer));
        list.add(new EntertainmentPojo("OMG 2 movie review: Akshay Kumar, Pankaj Tripathi’s laugh-out-loud film sneaks in a timely message",R.drawable.en_omg2));
        list.add(new EntertainmentPojo("Abhishek Bachchan hopes the ‘two ladies’ of his family mom Jaya Bachchan, wife Aishwarya Rai ‘do more work’: ‘There’s so much more to give’",R.drawable.en_abhishek_bachchan));
        list.add(new EntertainmentPojo("Red, White and Royal Blue movie review: Prime Video’s new rom-com is progressive, but feels like a relic of the pandemic era\n",R.drawable.en_red_white));
        list.add(new EntertainmentPojo("Shweta Tripathi calls Mirzapur’s Golu Gupta her most ‘challenging’ role, shares update on Yeh Kaali Kaali Ankhein season two",R.drawable.en_shweta_tripathi));
    }
}