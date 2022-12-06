package practice.withagroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestions02 {
    public static void main(String[] args) {
        //Question-9--Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        // (kullanicidan ard arada sayi isteyecegiz, kendisi cikis yapmak isteyene kadar sayilari almaya devam edecegiz.
        // En son ekrana girdigi cift sayilarin toplamini verecegiz. ardindan girdigi negatif sayilarin toplamini verecegiz.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers When you want to stop press q");
        int sumEvens=0;
        do {
            String numeros = input.next();
            if (numeros.equalsIgnoreCase("q")){
                break;
            }
            if (Integer.valueOf(numeros)%2==0){

                sumEvens = Integer.valueOf(numeros) + sumEvens;
            }

        }while(true);
        System.out.println(sumEvens);


/*
class Test
{
    int i;
    public Test(int k)
    {
        i=k;
    }
    public Test(int k, int m)
    {
        System.out.println("Hi I am assigning the value max(k, m) to i");
        if(k>m)
        {
            i=k;
        }
        else
        {
            i=m;
        }
    }
}
public class Main
{
    public static void main (String args[])
    {
        Test test1 = new Test(10);
        Test test2 = new Test(12, 15);
        System.out.println(test1.i);
        System.out.println(test2.i);
    }
}
 */

        //From a given array find all pairs whose sum is a given number
        //{4, 6, 5, -10, 8, 5, 20} ==> 10
        //For example;   4+6=10, 5+5=10, -10+20=10
        int arr[]={4, 6, 5, -10, 8, 5, 20};

        for (int i=0;i< arr.length;i++){
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==10){
                    System.out.println(arr[i]+" + "+arr[j]);
                }
            }
        }








    }
}
