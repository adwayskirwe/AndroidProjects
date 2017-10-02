package com.example.android.cricketteamstats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements PlayerList.TeamListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemClicked(long id){
        View v = findViewById(R.id.playerdetailfragment);
        if(v != null){
           PlayerDetail pd = new PlayerDetail();
           FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
           pd.setmyId(id);
           ft.replace(R.id.playerdetailfragment, pd);
           ft.addToBackStack(null);
           ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           ft.commit();
        }
        else{ //for phones
            Intent intent = new Intent(this, PhoneDetailActivity.class);
            intent.putExtra("playerid", (int)id);
            startActivity(intent);
        }
    }
}
