package day02typecastingscanner;

import java.math.BigDecimal;
import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Get the width and lenght of  a rectangle from user and calculate the are of rectangle

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width");

        Double width =  input.nextDouble();

        System.out.println("Enter the length");

        Double length = input.nextDouble();

        System.out.println("Area is " + width*length);





    }












}
