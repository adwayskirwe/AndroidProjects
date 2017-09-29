package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayData(View view){
        /**TextView name = (TextView)findViewById(R.id.btn01); */
        TextView tv=(TextView)findViewById(R.id.str);
        tv.setText("Button clicked");

        Spinner s = (Spinner)findViewById(R.id.nationality_spinner);
        String n = String.valueOf(s.getSelectedItem());
        tv.setText("nnn");


    }
}
