package practice;

import java.util.Scanner;

public class PracticeQuestions {
    ////Question-4-What is the result of   y<2 ? y <-1 ? z <-5 ? y <-1 ? z<5 ? 4 : 10 : -2 :  8 : 7  : 10
    public static void main(String[] args) {

        for (int i =1;i<=9;i++){
            for (int k=1; k<=9;k++){
                System.out.println(i + "*" + k + "=" + i*k);
            }
        }
        //Question-6-Type code to find sum of the numbers from 3 to 12, except 5
int y = 0;
        for (int i =3; i<=12;i++){
    if (i!=5){
        y=y+i;
    }
}
        System.out.println(y);
int i =3;
int sum=0;
        do {
            if (i!=5){
                sum+=i;

            }
            i++;
        }while( i <=12);

        System.out.println(sum);
        /*Question-7-- Check PERFECT NUMBER using for Loop
A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number
*/

        int x=6;
        int summ=0;

        for(int k=1;k<x;k++){
            if (x%k==0){
                summ=summ+k;

            }
        }
        if (x==summ){
            System.out.println("Perfect");
        }else {
            System.out.println("Not so perfect");

        }

//Question-8-Two numbers are entered through the keyboard. Write a program to find
        // the value of one number raised to the power of another. (Do not use Java built-in method)
//base=2-->power 3-->result = 2*2*2=8

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numero1");
        int num1 = input.nextInt();
        System.out.println("Enter numero2");
        int num2 = input.nextInt();
        int numSum = 1;
       for (int t =1;t<=num2;t++ ){
           numSum=numSum*(num1);
       }
        System.out.println(numSum);





    }
}
