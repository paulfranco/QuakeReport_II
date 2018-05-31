package com.example.android.quakereport;

public class Earthquake {

    /** Magnitude of the Earthquake */
    private double mMagnitude;

    /** Location of the Earthquake */
    private String mLocation;

    /** Date of the Earthquake */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude of the Earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the date of the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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
}
