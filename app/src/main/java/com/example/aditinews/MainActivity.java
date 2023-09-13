package com.example.aditinews;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i);
                }

            }

        };thread.start();
    }
}