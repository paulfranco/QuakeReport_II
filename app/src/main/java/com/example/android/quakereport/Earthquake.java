package com.example.android.quakereport;

public class Earthquake {

    /** Magnitude of the Earthquake */
    private String mMagnitude;

    /** Location of the Earthquake */
    private String mLocation;

    /** Date of the Earthquake */
    private String mDate;

    /**
     * Constructs a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude of the Earthquake
     * @param location is the location of the earthquake
     * @param date is the date of the earthquake
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Returns the magnitude of the Earthquake.
     */
    public String getMagnitude() { return mMagnitude; }

    /**
     * Returns the location of the earthquake
     */
    public String getLocation() { return mLocation; }

    /**
     * Returns the date of the earthquake
     */
    public String getDate() { return mDate; }
}
