package com.example.android.quakereport;

public class Earthquake {

    /** Magnitude of the Earthquake */
    private double mMagnitude;

    /** Location of the Earthquake */
    private String mLocation;

    /** Date of the Earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude of the Earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the date of the earthquake
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the Earthquake.
     */
    public double getMagnitude() { return mMagnitude; }

    /**
     * Returns the location of the earthquake
     */
    public String getLocation() { return mLocation; }

    /**
     * Returns the date of the earthquake
     */
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
