package com.example.wojtekw.visainfo;

import java.util.ArrayList;

/**
 * Created by Wojtek w on 2016-03-09.
 * <p>
 * com.example.wojtekw.visainfo
 */
public class Country {
    ArrayList<AccessibleLocation> locations;
    private String name;
    private int imageId;



    public Country()
    {
       locations = new ArrayList<>();

        addLocations();
    }

    public Country(String name, int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public void addLocations()
    {
        for(int i = 0;i < locations.size();i++) {
            locations.add(new AccessibleLocation());
        }
    }

    public int getImageId(){return imageId;}
    public String getName(){return name;}
    public ArrayList<AccessibleLocation> getVisaLocations(){return locations; }

}
