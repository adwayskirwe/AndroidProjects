package com.example.android.cricketteamstats;

/**
 * Created by Kirwe-Macbook on 29/09/17.
 */

public class Player {
    private long id;
    private String player_name, batting_type, bowling_type;
    public final static Player player[] = {
            new Player(1,"Rohit Sharma", "RHBatsman", "RHOffSpin"),
            new Player(2, "Shikhr Dhawan", "LHBatsman", "RHOffspin"),
            new Player(3, "Virat Kohli", "RHBatsman", "RHMediumPace"),
            new Player(4, "Mahendra Singh Dhoni", "RHBatsmanKeeper", "None"),
            new Player(5, "Kuldeep Yahdav", "LHBatsman", "LHChinaman"),
            new Player(6, "Jasprit Bumrah", "RHBatsman", "RHPace"),
            new Player(7, "Bhuvneshwar Kumar", "RHBatsman", "RHPace")
    };

    private Player(long id, String player_name, String batting_type, String bowling_type){
            this.id = id;
            this.player_name = player_name;
            this.batting_type = batting_type;
            this.bowling_type = bowling_type;
    }

    public String toString(){
        return this.player_name;
    }
    public String getPlayer_name(){
        return player_name;
    }
    public long getId(){
        return id;
    }
    public  String getBatting_type(){
        return  batting_type;
    }
    public String getBowling_type(){
        return bowling_type;
    }
}
