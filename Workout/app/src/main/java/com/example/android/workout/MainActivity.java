package com.example.android.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListener{

    public void itemClicked(long id){
        View v = findViewById(R.id.fragment_container);
        //IF 'V' IS PRESENT, IT MEANS THE DEVICE IS A TABLET
        if(v != null) {

            WorkoutDetailFragment workoutDetailFragment = new WorkoutDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            workoutDetailFragment.setWorkout(id);
            ft.replace(R.id.fragment_container, workoutDetailFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("id", (int)id);
            startActivity(intent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PASSING INFORMATION TO WORKOUTDETAIL FRAGEMNT BY PASSING WORKOUT ID. FROM THE WORKOUT ID, WE CAN
        // OBTAIN WORKOUT TITLE AND DESCRIPTION FROM WORKOUT.JAVA
     //   WorkoutDetailFragment frag = (WorkoutDetailFragment)getSupportFragmentManager().findFragmentById(R.id.workoutdetailfragment);
        // this was static ----- frag.setWorkout(1);
    }
}
