package day03ifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Example 1: Get first , miidle, last names, and the SSN from the user then print them like the given format
        // Tom jim Hanks
        // 214123525

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = input.next();

        System.out.println("Enter your middle name");

        String middleName = input.next();

        System.out.println("Enter your last name");

        String lastName = input.next();

        System.out.println("Enter your SSN");
         String ssn = input.next();

        System.out.println(firstName + " " + middleName +   " " + lastName );
        System.out.println(ssn);




    }

}
