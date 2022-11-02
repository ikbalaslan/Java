package day05ternarystringmanipulations;

import java.nio.file.attribute.BasicFileAttributes;

public class Ternary01 {//"Ternary" does the same with "if else" by using more simple syntax
    public static void main(String[] args) {
        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        int i =12;

        //1.Way:
        if(i>0){
            System.out.println("The integer is positive");

        }else{
            System.out.println("The integer is not positive");
        }
            //2.Way:Ternary
                           //Condition              ?         Will be selected of true condition     :  Will be selected of false condition
            String result = i>0                     ? "The integer is positive"                       : "The integer is not positive";
            System.out.println(result);

            //Type a program to print the minimum of 2 integers on the console. Use ternary...
             //    12,23==>12      345,12==>12


        double  d= 12 , e=345 ;

        double num = d<e ? d : e ;//":" means "else"
        System.out.println(num);

        //Type code to calculate the absolute value of number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by-1

        double f= -0;

        double value = f>=0 ? f : -1*f;
        System.out.println(value);

        /*
        You have 2 integers;
        If both of the integers are positive do multiplication
        Otherwise, return "I do not how to multiply"
         */

        int n = -2;
        int m=2;
        Object numeros = n>0 && m>0 ? n*m : "I do not how to multiply" ;
        System.out.println(numeros);

























































        }
    }

















