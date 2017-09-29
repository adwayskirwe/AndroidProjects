package com.example.android.bitsandpizzas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        android.app.ActionBar actionBar = getActionBar();
        if(getActionBar()!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
}
