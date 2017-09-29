package com.example.android.workout;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {


    public static interface WorkoutListListener{
        void itemClicked(long id);
    }
    private WorkoutListListener listener;


    public void onAttach(Context context){
        super.onAttach(context);
        this.listener = (WorkoutListListener)context;
    }

    public WorkoutListFragment() {
        // Required empty public constructor
    }


    public  void onListItemClick(ListView l, View v, int position, long id){
        if(listener != null){
            listener.itemClicked(id);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ArrayAdapter<Workout> adapter = new ArrayAdapter<Workout>(
                inflater.getContext(),android.R.layout.simple_list_item_1,Workout.workout);

        setListAdapter(adapter);

        return  super.onCreateView(inflater, container, savedInstanceState);
        //  LAYOUT NOT NEEDED FOR LIST FRAGMENT. IT HAS ITS OWN INBUILT LAYOUT.
        // return inflater.inflate(R.layout.fragment_workout_list, container, false);
    }

}
