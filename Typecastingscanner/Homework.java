package day02typecastingscanner;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Area of square
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght twice");

        double l = input.nextDouble();
        System.out.println(l*l);



 //First and last name
        System.out.println("Enter the First and Last name");

        String F = input.nextLine();

        String L = input.nextLine();

        System.out.println(F+L);

        System.out.println("Enter the addresses");

        String A = input.nextLine();

        System.out.println(A);

        System.out.println(( F+L ) + A);








    }


}
