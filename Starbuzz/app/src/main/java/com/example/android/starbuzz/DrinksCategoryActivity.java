package com.example.android.starbuzz;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DONT USE THIS FOR LIST ACTIVITY
       // setContentView(R.layout.activity_drinks_category);

        ArrayAdapter<Drinks> adaptor = new ArrayAdapter<Drinks>(
                this, android.R.layout.simple_list_item_1, Drinks.drinks
        );

        ListView listView = getListView();
        listView.setAdapter(adaptor);

    }
}
