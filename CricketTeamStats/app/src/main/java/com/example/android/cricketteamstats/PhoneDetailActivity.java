package com.example.android.cricketteamstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhoneDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_detail);

        PlayerDetail pd = (PlayerDetail)getSupportFragmentManager().findFragmentById(R.id.playerdetailfragment);
        int id = getIntent().getExtras().getInt("playerid");
        pd.setmyId(id);
    }
}
