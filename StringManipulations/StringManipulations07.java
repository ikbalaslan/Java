package day07stringmanipulations;

import java.util.Locale;

public class StringManipulations02 {
    public static void main(String[] args) {
        String str = "Java is OOP";
        String a1 = str.replace('O', 's' );
        System.out.println(a1);

        String a2 = str.replace("Java","*");
        System.out.println(a2);

        String st = "Ali is years 13 years old, I think he seems 15.";

        //Example 1: Change all digits to "x" in the given String
       //1.Way : Not reccomended, beacuse there is repetition
        String b1 = st.replace('0', '*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(b1);
        //Note: If your code does not work for all values, it is called "Hard coding" and "Hard coding" cannot be accepted.

        //2.Way Reccomended

       String b2 =  st.replaceAll( "[0-9]","*" );
        System.out.println(b2);

        /*
        Regex means Regular expressions
        Regex represents a group of date
        All digits: [0-9]
        All lowercase letters: [a-z]
        all uppercase letters: [A-Z]
        All lower and uppercase letters: [a-zA-z]
        all lower and uppercase letters and digits: [a-zA-Z0-9]
        Some multiple characters like a, e, i, o, u: [aeiou]

        All characters different from digits:[^0-9]
        All characters different from letters:[^a-zA-Z]
        All characters different from vowels:[^aeiou]
        [^a-z] : is different from letters. For example String a = "I love 12"   String b = a.replaceAll([^a-z],[*]) this means //I love **

          Space character :  \\s
          All characters different from space character: \\S
          All digits : \\d
          All characters different from  digits: \\D

          All uppercase and lowercase letters and digits and _:\\w
          Different from  All uppercase and lowercase letters and digits and _:\\W

          All punctuation marks: \\p{Punct}
         */

         /*
                Example 2: Type code to check if a password is valid or not for the following conditions;
                           Password must have at least 8 characters different from space character
                           Password must have at least 1 symbol
         */

        String pwd = "1a23b4  es";
        //My WAY BITCH
         // Password must have at least 8 characters different from space character
       String d2 = pwd.replaceAll("\\s", "");
      int d3 = d2.length();
      String d4 =pwd.replaceAll("\\w", "").replaceAll("\\s", "");
      int d5 =d4.length();
        System.out.println("your symbol" + d5);

        if ((d3>=8)&&(d5>=1)){
          System.out.println("Password is okey");

      }else
          System.out.println("Not okey");
      //Teachers WAY
        String spwd = "a1 !2   s def ";
        //Password must have at least 8 characters different from space character
        boolean firstRule = spwd.replaceAll("\\s", "").length()>7;

        //Password must have at least 1 symbol

        //boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]","").length()>0;

        //Following can be used to remove space as well but it is difficult to notice space was removed, because of that above is better to use
        boolean secondRule = spwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        System.out.println("Is the password valid? " + (firstRule && secondRule));






















    }
}
