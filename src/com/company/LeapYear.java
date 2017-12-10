package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class LeapYear {

    /**
     * @param year -> the year to be checked if it is leap or not
     * @return -> boolean (if the year is leap or not)
     */
    private boolean isLeap(int year){
        if(year%4 ==0 || year%100==0 && year%400 == 0){
           return true;

        }else
            return false;
    }

    /**
     * @param number - > number of next years to be displayed
     * @return -> an ArrayList which includes the leap years
     */
    public ArrayList findLeapYears(int number){
        ArrayList<Integer> leapYears = new ArrayList<Integer>();
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Current year is "+year);
        while(true){
            if(isLeap(year)){
                leapYears.add(year);
            }
            if(leapYears.size() == number){
                return leapYears;
            } else{
                year++;
            }
        }
    }
}
