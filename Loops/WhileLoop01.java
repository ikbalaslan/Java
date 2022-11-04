package day10loops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: Type code to print integers from 3 to 6

        //1.Way:
        for (int i=3;i<=6;i++){
            System.out.print( i + " ");
        }
        System.out.println();
        //2.Way: while-loop
        int i=3;

        while(i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //Example 2: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int l =12;
        while(l<68){
            if (l%2!=0) {
                System.out.print(l + " ");
            }
            l++;

        }
        System.out.println();
        //3.Example: Type code to find the sum of integers from 12 to 67
        int s = 12;
        int b =0;
        while(s<68){
            if (s%2!=0){
                b = b + s;

            }
            s++;
        }System.out.print(b);

        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        ///MY way:
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numeros");
        String digit = input.next();
         int sum = 0;
        int m = 0;
        while(m<digit.length()){
            String dat = digit.substring(m,m+1);
            sum = sum + Integer.valueOf(dat);

            m++;}
        System.out.println(sum);
        System.out.println();
        //Teacher's Way
        int num = input.nextInt();
        int sumOfDigits=0;

        while(num>0){
            System.out.println();
           sumOfDigits= sumOfDigits + num%10;
            num = num / 10;//Increment part is division here.
        }
        System.out.println(sumOfDigits);


  /*
		 Example 5: Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.
	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	  */
        System.out.println("Enter an integer to see multiplication table on the console");
        int n = input.nextInt();
        int p = 1;


        while(p<11){
            System.out.println(n + "x" + p + "=" + n*p);


            p++;
        }



















    }

}
