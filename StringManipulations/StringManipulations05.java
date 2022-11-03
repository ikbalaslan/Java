package day07stringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Java is easy";
        String str1 = str.toLowerCase(Locale.ROOT);

       boolean strl = str1.contains("java");
        System.out.println(strl);

        boolean res = str1.startsWith("J");
        System.out.println(res);

        // If you use startsWith() method with 2 parameters, second parameter means skip the first characters.
        boolean res1 = str.startsWith("i", 5);// toffset = after skipping first 5 characters is the first character is "i"
        System.out.println(res1);

        /*
        Example 1: Check if the given password
        i)has "A" in any position
        ii)has"xy" at the begining
        iii)has "W" as 7th character
        iv) has 8 characters in total
         */

        String pwd = "xy1AmSW?";

        boolean hasAIn = pwd.contains("A");
        System.out.println(hasAIn);

        boolean xyBegining = pwd.startsWith("xy");
        System.out.println(xyBegining);

       boolean wAs = pwd.startsWith("W", 6);// To check 7th character i have to skip 6 character at the begining.
        System.out.println(wAs);

        boolean howMany = pwd.length()==8;
        System.out.println(howMany);

        System.out.println("Is the password valid " + (hasAIn && xyBegining && wAs && howMany));

        String s = "Do practice to be better";

         boolean res2 = s.endsWith("r");
        System.out.println(res2);

        String res3 = s.concat("!").concat("...");// concat() method is same with the "+" in Java. -
                                                  // If you use multiple method side by side it is called method chain.
        System.out.println(res3);// Do practice to be better!













































    }
}
