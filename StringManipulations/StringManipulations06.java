package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        String str = "Ali is is 13 years old, I like Ali, Ali does not like me!...";

        //Example 1: How many punctutation marks are used in the given String
        // All punctuation marks: \\p{Punct}


        int numOfAllChars = str.length();
        int numofAllCharsDiffFromPunctuationsMarks = str.replaceAll("\\p{Punct}", "").length();
        System.out.println(numOfAllChars - numofAllCharsDiffFromPunctuationsMarks);
        //Example 2: Ask user to enter his full name, and fix if the user enters space at the begining and at the end.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String d1 = input.nextLine();
        String d2 = d1.trim(); //trim() method removes spaces from the begining and from the end, it does not touch spaces in the middle.
        System.out.println(d2);
























    }
}
