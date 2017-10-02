package com.example.android.cricketteamstats;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerDetail extends Fragment {
    private long id;

    public PlayerDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_player_detail, container, false);
    }

    public void setmyId(long id){
        this.id = id;
    }

    public  void onStart(){
        super.onStart();
        View view = getView();
        if(view != null) {
            TextView player_id = view.findViewById(R.id.t1);
            TextView player_name = view.findViewById(R.id.t2);
            TextView batting_type = view.findViewById(R.id.t3);
            TextView bowling_type = view.findViewById(R.id.t4);

            Player play = Player.player[(int) id];
            player_id.setText(String.valueOf(play.getId()));
            player_name.setText(play.getPlayer_name());
            batting_type.setText(play.getBatting_type());
            bowling_type.setText(play.getBowling_type());
        }
    }

}
