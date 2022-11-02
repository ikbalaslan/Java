package day05ternarystringmanipulations;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Type Java code by using nested ternary.
        Write a program to check if a year is "leap year" or not.
        1)if the year is divisible by 100 then it must be divisible by 400.
        2)If a year is not divisible by 100 then it must be divisible by 4.
         */
        //MY TRY


        // Real solution

        int yearr =-4;
        Object leapyear   =  (yearr>0) ?  (yearr%100==0 ? (yearr%400==0 ? "Leap year" : "Not leap year") : (yearr%4==0 ? "Leap year" : "Not leap YEAR")) : ("Invalid");


        System.out.println(leapyear);

       //Type code to check the password
        // If it has more than 8 characters, inital should be 'i'
        // If it has no more than 8 characters initial should be 'K'
        // Solve the task by using nested-ternary

        String pwd = "K212";

        Object password = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "it is okey" : "it is not okey") : pwd.charAt(0)=='K' ? "It is okay" : "it is not okey";
        System.out.println(password);


























    }





}
