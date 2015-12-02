package com.example.android.twoscreenapp.model;

/**
 * Created by hernandez on 12/2/2015.
 */
public class Squared {

    private float mSquare;

    public float getSquare (float number){

        mSquare = number*number;
        return mSquare;
    }
}
