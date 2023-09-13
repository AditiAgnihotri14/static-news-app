package com.example.aditinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class PoliticalActivity extends AppCompatActivity {

    ListView listView;
    ArrayList list;
    PoliticalAdapter politicalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listView = findViewById(R.id.list_view_political);
        listShow();
        politicalAdapter = new PoliticalAdapter(this, list);
        listView.setAdapter(politicalAdapter);
    }

    private void listShow() {

        list = new ArrayList();
        list.add(new PoliticalPojo("Modi govt wants to ensure 'control' over EC in poll year: Congress",R.drawable.pn_modi_govt));
        list.add(new PoliticalPojo("NCP MLA Jitendra Awhad caught on camera threatening dean of hospital in Thane",R.drawable.pn_jitendra_awhad));
        list.add(new PoliticalPojo("Delhi services Act: A look at BJP’s changing stand on Capital’s powers, and another Bill",R.drawable.pn_delhi_service_act));
        list.add(new PoliticalPojo("Illegal payments of Rs 1.72 cr made to Kerala CM’s daughter, claims report, triggers political firestorm",R.drawable.pn_kerala_cm));
        list.add(new PoliticalPojo("Power of no-trust motion brought PM to House, says Adhir",R.drawable.pn_power_no_truest_motion));
        list.add(new PoliticalPojo("Tensions still simmering, BJP plans Tiranga Yatras across Haryana",R.drawable.pn_tiranga_yatras));
        list.add(new PoliticalPojo("Mizo MP ‘cut off’ as he rises to speak on Manipur issue, says ‘tribal people not Myanmarese’",R.drawable.pn_mizo_mp));
        list.add(new PoliticalPojo("As ED knock ‘surprises’ Gopal Kanda, aides say ‘nothing decided on joining BJP’",R.drawable.pn_gopal_kanda));
        list.add(new PoliticalPojo("Today in Politics: Will Narendra Modi hit a last-ball six? PM set to take guard in LS in no-trust motion debate",R.drawable.pn_narendra_modi));
        list.add(new PoliticalPojo("BJP unveils new Bihar team: Mix of old and new faces; leaders from across castes, regions",R.drawable.pn_bjp));
    }
}