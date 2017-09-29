package com.example.android.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //WE HAVE TO IMMEDIATELY PASS THE WOKOUT ID TO THE LIST FRAGMENT
       WorkoutDetailFragment workoutDetailFragment  = (WorkoutDetailFragment)getSupportFragmentManager().findFragmentById(R.id.workoutdetailfragment);
        //get id from the intent
        int workoutid = getIntent().getExtras().getInt("id");
        workoutDetailFragment.setWorkout(workoutid);
    }
}
