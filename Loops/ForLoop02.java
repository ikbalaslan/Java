package day09loops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: type code to print characters except "m" in a String.
        //           For example, Andromeda ==>Androeda
        String str = "Mama";
        //1.Way:
        for (int i=0;i<(str.length() ); i++) {
            char ch = str.charAt(i);
            if (ch != 'm') {
                System.out.print(ch);
            }
        }


            //1.Way:
            for (int i=0;i<(str.length() ); i++) {
                char ch = str.charAt(i);
                if (ch=='m'){
                    continue;//If you want to skip any value in a loop use "continue;"
                }
                System.out.print(ch);
            }
        System.out.println();
        //Example 2: type code to print characters before "m" in a String.
        String chz ="Luxembourg";
       for(int i =0; i<=chz.length()-1; i++){
           char d1 = chz.charAt(i);
           if (d1 == 'm') {
               break;//If you want to break any loop under some conditions you can use break keyword.
           }
           System.out.print(d1);
       }

        //Example 3: Type code to find the sum of the unique digits in an integer
        //            For example, 1232,==> 1+3=4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");
        String num = input.next();
        int sum = 0;

        for (int i=0;i<=num.length()-1;i++) {
            String digit = num.substring(i,i+1);
            if(num.indexOf(digit)==num.lastIndexOf(digit)){

             sum = sum + Integer.valueOf(digit);
            }

        }

        System.out.println(sum);





    }

}
