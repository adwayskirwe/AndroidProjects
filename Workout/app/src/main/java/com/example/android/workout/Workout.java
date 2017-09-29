package com.example.android.workout;

/**
 * Created by Kirwe-Macbook on 26/09/17.
 */

public class Workout {
    private String name, description;
    public static final Workout workout[]={
            new Workout("Workout 1", "This is the easiest workout."),
            new Workout("Workout 2", "This is the medium workout."),
            new Workout("Workout 3", "This is the hardest workout.")
    };

    private Workout(String title, String description){
        this.name = title;
        this.description = description;
    }

    public String getTitle(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return this.name;
    }
}
