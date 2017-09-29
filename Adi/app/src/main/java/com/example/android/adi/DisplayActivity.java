package com.example.android.adi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent in = getIntent();
        String username = in.getStringExtra("username");
        String gender = in.getStringExtra("gender");
        String country = in.getStringExtra("country");

        TextView tview = (TextView)findViewById(R.id.name);
        tview.setText("hello : "+username);

        TextView tview2 = (TextView) findViewById(R.id.gender);
        tview2.setText("your gender is : "+gender);

        TextView tview3 = (TextView)findViewById(R.id.country);
        tview3.setText("your country is :"+country);

    }


}
