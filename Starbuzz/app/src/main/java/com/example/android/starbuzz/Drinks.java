package com.example.android.starbuzz;

/**
 * Created by Kirwe-Macbook on 21/09/17.
 */

public class Drinks {
    private String name, description;
    private int imageResourceId;

    private Drinks(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return  description;
    }
    public  String getName(){
        return  name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
     public  String toString(){
        return this.name;
    }

    public static final Drinks drinks[]={
            new Drinks("Pepsi","Taste the Thunder",R.drawable.pepsi),
            new Drinks("Coca cola","Aaj kuch toofani krte hai",R.drawable.cocacola),
            new Drinks("Maaza","Raseela bina gutli waala aam",R.drawable.maaza),
    };
}
