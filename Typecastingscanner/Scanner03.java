package day02typecastingscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {



        //Example 1: Ask user to enter width , height, and length of a rectangular prism then calculate the area.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter width, length, height");

        double w = input.nextDouble();

        double l = input.nextDouble();

        double h = input.nextDouble();

        System.out.println("Total surface Area is " + (2*w*l + 2*w*h + 2*l*h));

    }
}
