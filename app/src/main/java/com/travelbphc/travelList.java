package com.travelbphc;


public class travelList {

    private String mProfileName;

    private String mTime;

    private int mProfileImage;

    private int mNumber;
    public travelList(String defaultTranslation, String Time, int ProfileImage, int Number) {
        mProfileName = defaultTranslation;
        mTime = Time;
        mProfileImage = ProfileImage;
        mNumber = Number;

    }

    public String getmProfileName() {

        return mProfileName;
    }

    public int getmProfileImage() {

        return mProfileImage;
    }



    public String getmTimeTravel() {

        return mTime;
    }

    public int getmNumber () {
        return mNumber;
    }
}

