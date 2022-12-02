package practice;

import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        String str = "Ali is is 13 years old, I like Ali, Ali does not like me!...";


        int res = str.replaceAll("\\P{Punct}", "").length();
        System.out.println(res);

        int res1 = str.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(res1);
        //Example 3: Type code to find the sum of the unique digits in an integer
        //            For example, 1232,==> 1+3=4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String d1 = input.next();
        int d2 = 0;

        for(int i=0;i<=d1.length()-1;i++){
            String d3 = d1.substring(i,i+1);
            if (d1.indexOf(d3)==d1.lastIndexOf(d3)){
                d2=d2+Integer.valueOf(d3);

            }


        }
        System.out.println(d2);

        /* Example 1: Check if the given password
        i)has "A" in any position
        ii)has"xy" at the begining
        iii)has "W" as 7th character
        iv) has 8 characters in total
                */
        String password = "SZACiaAd";
        boolean res3 = password.contains("A");
        boolean res4 = password.startsWith("xy");
        String res5=  password.substring(6,7);
        boolean res8 = res5=="W";
       int res6 = password.length();
       boolean res7 = res6==8;


        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res8);
        System.out.println(res7);










    }

}
