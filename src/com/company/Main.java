package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Enter the number of next leap years to be displayed: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        LeapYear year = new LeapYear();
        ArrayList result = year.findLeapYears(number);
        System.out.println(result);
    }


}
