package com.example.myapplicationintentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextPage extends AppCompatActivity {
    TextView StudentInfo = findViewById(R.id.StudentInfo);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Intent fromAct= getIntent();
        String Title=fromAct.getStringExtra("Title");
        String StundentName=fromAct.getStringExtra("StudentName");
        int rollnum = fromAct.getIntExtra("roll number", 0);

        StudentInfo.setText("ROLL NUMBER : "+ rollnum+" , NAME: "+StundentName);

        getSupportActionBar().setTitle(Title);





    }
}