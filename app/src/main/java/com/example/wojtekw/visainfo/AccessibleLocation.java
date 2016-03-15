package com.example.wojtekw.visainfo;

/**
 * Created by Wojtek w on 2016-03-10.
 * <p>
 * com.example.wojtekw.visainfo
 */
public class AccessibleLocation {
    //private int locationImageId;
    private int visaPeriod;
    private String locationName;
    private boolean visaRequired;

    public AccessibleLocation(){this("Default location",30,true);}

    public AccessibleLocation(String locationName, int visaPeriod, boolean visaRequired)
    {
        this.locationName = locationName;
        this.visaPeriod = visaPeriod;
        this.visaRequired = visaRequired;
    }
    public int getVisaPeriod() {return visaPeriod;};
    public String getLocationName(){return locationName;}
    public boolean getVisaRequired(){return visaRequired;}
}
