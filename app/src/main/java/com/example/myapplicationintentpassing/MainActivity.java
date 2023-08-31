package com.example.myapplicationintentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button NextBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NextBtn = findViewById(R.id.NextBtn);

        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext;  // Intent class ka ek object bnaya ha

                inext= new Intent(MainActivity.this, NextPage.class);  // yaha intent ka new object bnaya ha jaha par value initialize hogi

                startActivity(inext); // ya laazmi on click listener mai aaega waja ya ha ka jaha par ya next page par laikar jaae ga wo click ka baad hoga
            }
        });
    }
}