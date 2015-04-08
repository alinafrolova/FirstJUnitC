package com.frolova;

/**
 * Created by иарвар on 14.03.2015.
 */
public class Minus implements Operation {


    @Override
    public double exec(double myValueOne, double myValueTwo) {
        return myValueOne-myValueTwo;
    }

}
