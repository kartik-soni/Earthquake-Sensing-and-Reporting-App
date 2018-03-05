package com.example.kartik.earthquakesensor;

/**
 * Created by KARTIK on 2/13/2018.
 */

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private Long mTimeInMillisecond;
    private String mUrl;

    public Earthquake(Double magnitude,String location, Long timeInMillisecond,String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMillisecond=timeInMillisecond;
        mUrl=url;
    }

    public Double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public Long getTimeInMilliseconds(){
        return mTimeInMillisecond;
    }
    public String getUrl(){
        return mUrl;
    }
}
