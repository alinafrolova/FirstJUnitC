package com.frolova;

/**
 * Created by иарвар on 14.03.2015.
 */
public class Divis implements Operation {


    public Divis divis;

    @Override
    public double exec(double myValueOne, double myValueTwo) throws Exception {
if (myValueTwo ==0 ){
    ArithmeticException exception;
    System.out.println("Делить на ноль нельзя!!!");
}
        return myValueOne / myValueTwo;

    }


}
