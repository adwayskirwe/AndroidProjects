package com.example.android.cricketteamstats;


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
public class PlayerList extends ListFragment {

    public PlayerList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //USE AN ARRAY ADAPTER BECAUSE THIS IS A LIST FRAGMENT. SO NO NEED OF LAYOUT.XML FOR THIS...
        //USE ARRAY ADAPTER FOR NON STATIC RESOURCES LIKE ARRAYS
        ArrayAdapter<Player> adapter = new ArrayAdapter<Player>(
                inflater.getContext(), android.R.layout.simple_list_item_1, Player.player
        );
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
        // Inflate the layout for this fragment
        //  LAYOUT NOT NEEDED FOR LIST FRAGMENT. IT HAS ITS OWN INBUILT LAYOUT
        // return inflater.inflate(R.layout.fragment_player_list, container, false);
    }


    public static interface TeamListener{
         void itemClicked(long id);
    }
    TeamListener listen;

    public void onAttach(Context con){
         super.onAttach(con);
        this.listen = (TeamListener)con;
    }

    public void onListItemClick(ListView l, View v, int position, long id){
        if(listen != null){
            listen.itemClicked(id);
        }
    }


}
