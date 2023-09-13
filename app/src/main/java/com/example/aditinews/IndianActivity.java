package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class IndianActivity extends AppCompatActivity {

    ListView listView;
    ArrayList list;
    IndianAdapter indianAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listView = findViewById(R.id.list_view_indian);
        listShow();
        indianAdapter = new IndianAdapter(this, list);
        listView.setAdapter(indianAdapter);
    }

    private void listShow() {

        list = new ArrayList();
        list.add(new IndianPojo("\"Let's Work Together For Restoring Peace In Manipur\": PM To Opposition",R.drawable.in_lets_work_together));
        list.add(new IndianPojo("Congress Leaders To Meet Today To Discuss Upcoming Rajasthan Polls",R.drawable.in_congress_leader));
        list.add(new IndianPojo("In A First, Fuel Outlet Run By Women Convicts Opens In Chennai",R.drawable.in_in_a_fuel));
        list.add(new IndianPojo("Jadavpur University Student Falls From Hostel, Dies; Friend Alleges Ragging",R.drawable.in_jadavpur_university));
        list.add(new IndianPojo("Schools in Haryana's Nuh to open Tomorrow",R.drawable.in_schools_in_hariyana));
        list.add(new IndianPojo("Businessman Linked To Mumbai Covid Centre Scam Seeks To Withdraw Statement",R.drawable.in_businessman_linked_to_mumbai));
        list.add(new IndianPojo("Narayana Murthy Warns About Impact Of India's \"High Population Growth\"",R.drawable.in_narayana_murthy));
        list.add(new IndianPojo("No One In Manipur Blames PM, Amit Shah: Assam Chief Minister On Violence",R.drawable.in_amit_shah));
        list.add(new IndianPojo("\"Air India Not Just Another Business But A Passion\": Tata Sons Chairman",R.drawable.in_air_india));
        list.add(new IndianPojo("Suspended Special Court Judge Sudhir Parmar Arrested By Probe Agency",R.drawable.in_sudhir_parmar));
    }
}