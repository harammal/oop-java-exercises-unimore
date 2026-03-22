package com.harammal.exercises.warmup;

/*
    Simple Interest Rate
    I = (C × r × t) / 100

    Where:
    I = total interest
    C = initial capital
    r = annual interest rate (in percentage)
    t = time in years
 */

public class InterestRate {

    public static void main(String[] args){
        double C = 1000;
        final double r = 5;

        System.out.println("Balance after 1 year: "+ (C + (C * r * 1)/100));
        System.out.println("Balance after 2 year: "+ (C + (C * r * 2)/100));
        System.out.println("Balance after 3 year: "+ (C + (C * r * 3)/100));
    }
}
