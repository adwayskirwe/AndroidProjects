package com.example.android.adi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayData(View view){
        //fetch value from radio button
        RadioGroup radio = (RadioGroup) findViewById(R.id.gen);
        int id = radio.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton)findViewById(id);
        String radioText = (String) radioButton.getText();

        //fetch value from edittext
        EditText editText = (EditText)findViewById(R.id.name);
        String username = editText.getText().toString();

        // spinner value
        Spinner spinner = (Spinner)findViewById(R.id.nationality_spinner);
        String country = spinner.getSelectedItem().toString();

        String ans = radioText + "\n" + username  +"\n" + country ;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, ans);
        Intent chosenIntent = Intent.createChooser(intent, "Send message...");

        startActivity(chosenIntent);

    }
}
