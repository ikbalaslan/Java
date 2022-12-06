package practice.withagroup;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyTraining08 {
    public static void main(String[] args) {

//Question 1- What is the output?


        int x=5;
        System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
        //Question-2 : What is the result of a, b, c, d?


        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;
        b = --a;
        a = --c;
        d = b--;
        //c=3     d=5     b=4 a=3 d=4
        //Question 3- For this array : {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};

//a) Find index of "Sigrund" and  output must be like that --> Index for "Sigrund" is : 2
//b) Find index of "Einar" and  output must be like that --> Index for "Einar" is : 3

//c) Sort the array elements in ascending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//d) Sort the array elements in descending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};



        String arr[] = {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String brr[] = new String[arr.length];
       int idx=0;
        for (int i=arr.length-1;i>=0;i--){
            arr[i]=brr[idx];
            idx++;
        }
        System.out.println(Arrays.toString(brr));
/*
        int a = 5; //
        int b = 2;
        int c;
        int d;
        c = ++b;// c=3 b=3
        d = a++;// d=5 a=6
        c++;    // c=4
        d = b--;//d=3 b=2
        b= a++; // b=6 a=7
        c = --b+ (--a);// c=11    a6 b5 c11 d3

        System.out.println(a+b+c+d);

 */

        int sayi1 = 10;
        int sayi2 = sayi1 + 1; //11

        sayi2 += 5; // 16
        int sayi3 =  sayi2++; // sayi3=16 sayi2=17
        int sayi4 = ++sayi1;  // sayi1=11 sayi4=11


        System.out.println(sayi1+sayi2+sayi3+sayi4);


        //4-2) Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int[] a1 = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a1);
        int minimumPositive = a1[a1.length-1];
        int greatestNegative = a1[0];
        for (Integer w : a1){
            if (w>=0){
                minimumPositive = Math.min(minimumPositive,w);
            }
            if (w<0){
                greatestNegative = Math.max(greatestNegative,w);
            }

        }System.out.println("Minimum positive" + minimumPositive);
        System.out.println("Maximum negative" + greatestNegative);





    }
}
