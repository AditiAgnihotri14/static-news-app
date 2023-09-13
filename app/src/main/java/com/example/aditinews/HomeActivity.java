package com.example.aditinews;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    ImageView imageView;
    GridLayout gridLayout;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gridLayout = findViewById(R.id.mainGridLayout);
        cardView = findViewById(R.id.CCFId);
        imageView = findViewById(R.id.imgId);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        buttonGrid(gridLayout);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TrendingActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);
        builder.setTitle("Exit App");
        builder.setMessage("Do you want exit?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    private void buttonGrid(GridLayout gridLayout) {
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int fi = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fi == 0) {
                        startActivity(new Intent(HomeActivity.this, IndianActivity.class));
                    }else if (fi == 1) {
                        startActivity(new Intent(HomeActivity.this, WorldActivity.class));
                    }else if (fi == 2) {
                        startActivity(new Intent(HomeActivity.this, EntertainmentActivity.class));
                    }else if (fi == 3) {
                        startActivity(new Intent(HomeActivity.this, PoliticalActivity.class));
                    }
                }
            });
        }

    }
}

