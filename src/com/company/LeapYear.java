package com.company;

/**
 * Created by Liuda on 12/10/2017.
 */
public class LeapYear {

    public boolean isLeap(int year){
        if(year%4 ==0 || year%100==0 && year%400 == 0){
            System.out.println("Leap year");
           return true;

        }else
            System.out.println("Not a leap year");
            return false;
    }
}
