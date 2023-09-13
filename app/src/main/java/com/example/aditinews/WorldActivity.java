package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class WorldActivity extends AppCompatActivity {

    ListView listView;
    ArrayList list;
    WorldAdapter worldAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listView = findViewById(R.id.list_view_world);
        listShow();
        worldAdapter = new WorldAdapter(this, list);
        listView.setAdapter(worldAdapter);
    }

    private void listShow() {

        list = new ArrayList();
        list.add(new WorldPojo("\"Looks Like A Warzone\": Tourists Narrate Escape From Burning Hawaii",R.drawable.wn_burning_hawaii));
        list.add(new WorldPojo("\"I Miss The Sun\": Australian Journalist Jailed In China",R.drawable.wn_australian_journalist));
        list.add(new WorldPojo("29 Dead, 16 Missing After Severe Floods In China's Hebei",R.drawable.wn_china_flood));
        list.add(new WorldPojo("China Claims To Have Arrested Alleged CIA Spy Recruited In Italy: Report",R.drawable.wn_cia_spy));
        list.add(new WorldPojo("Emergency Declared In Ecuador After Presidential Candidate Shot Dead",R.drawable.wn_emergency_declared));
        list.add(new WorldPojo("6.0 Magnitude Earthquake Hits Japan's Hokkaido: Report",R.drawable.wn_earthquake));
        list.add(new WorldPojo("Russia Sends Spacecraft To Moon, Weeks After Chandrayaan-3 Launch",R.drawable.wn_chandryaan3));
        list.add(new WorldPojo("Biden Calls China A \"Ticking Time Bomb\" Over Economic Troubles",R.drawable.wn_biden));
        list.add(new WorldPojo("Warehouse Near Putin's Residence In Moscow Is On Fire: Report",R.drawable.wn_putin));
        list.add(new WorldPojo("North Korea Developing Nuclear Weapons, Evading Sanctions 2023: UN Report",R.drawable.wn_north_korea));
    }
}