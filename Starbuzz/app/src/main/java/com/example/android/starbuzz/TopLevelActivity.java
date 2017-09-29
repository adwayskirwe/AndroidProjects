package com.example.android.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import  android.view.View;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener listen = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?>listView, View itemView, int position, long id) {
                if (position == 0) { //Drinks clicked
                    //WHY ?
                    Intent intent = new Intent(TopLevelActivity.this, DrinksCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        //Add listener to listview
        ListView listView = (ListView)findViewById(R.id.list_options);
        listView.setOnItemClickListener(listen);
    }
}
