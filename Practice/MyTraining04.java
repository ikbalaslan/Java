package practice;

import java.util.Scanner;

public class MyTraining04 {
    public static void main(String[] args) {
        /*//Example 4: Type code to find the sum of the digits of an integer
        //           584 ==> 5+8+4=17
        int num = -584;
        num = Math.abs(num);
        System.out.println(num);

       int  summerOfDigits = 0;

        for (int i =num;i>0;i=i/10){
            summerOfDigits = summerOfDigits + i%10;
        }
        System.out.println(summerOfDigits);

         */

        //Example 1: type code to print characters except "m" in a String.
        //           For example, Andromeda ==>Androeda
       /* String m = "Andromeda";
        for (int i=0;i<=m.length()-1;i++){
            if ((m.charAt(i))=='m'){
                continue;

            }
            System.out.print(m.charAt(i));
        }

        */
       /* Example 5: Type java code by using while loop,
                Write a program that prompts the user to input a number.
        It should then print the multiplication table of that number.
        3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30

        */
       /* Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int i = 1;

        while(i<11){
            System.out.println(r + "x" + i + "=" + i*r);
            i++;
        }

        */
          /*
        1.Example:Type code to get the output like
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                          .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                          ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                          ....
         */


        /*for (int i =1 ; i<4;i++){
            System.out.println("Week :" + i);

            for (int k =1;k<8;k++){
                System.out.println("Day :" + k);

            }


        }

         */
           /*
            2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the row");
        int num= input.nextInt();
        System.out.println("Enter the column");
        int column = input.nextInt();
        for (int i =1;i<=num;i++) {


            for (int k = 1; k <= column; k++) {
                System.out.print("*");

            }
            System.out.println();
        }

         */
     /*
            3.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
        */
      /*  for (int i =1; i<=5;i++){
            for (int k =1; k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }

       */
/*Type code for this pattern
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1          */
        //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers
       /* for (int i =120;i>11;i--){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        */

        //2.Way
       /* String s = "";
        int d=120;
        while(d>11){
            if (d%4==0 && d%6==0){
                s = s + d + " ";
            }d--;
        }
        System.out.print(s);

        */


        //3.Way
       /* String s = "";
        int i = 120;
        do {
            if (i%4==0 && i%6==0){
                s = s + i + " ";

            }i--;
        }while(i>10);
        System.out.println(s);

        */

        // Type code to print repeated characters in a String. For example; accessories ⇒ ces
        //1.Way
        /*
        String s = "accessories";
        String d = "";
        for (int i =0; i<=s.length()-1;i++){
             String c = s.substring(i,i+1);
             if (s.indexOf(c)!=s.lastIndexOf(c)){
                 if (!d.contains(c)){
                     d = d + c;
                 }


            }

        }


        System.out.print(d);
        */
        //2.Way
       /* String s = "Accessories";
        String d = "";

        int i =0;
        while(i<s.length()){
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if (!d.contains(c)){
                    d = d + c;
                }
            }
            i++;
        }
        System.out.println(d);

        */
       /* String s = "Accessories";
        String d = "";

        int i = 0;
        do {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d=d+c;


                }



            }i++;
        }while(i < s.length()) ;
        System.out.println(d);*/
    }
}

