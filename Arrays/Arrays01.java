package day13arrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    When we create byte, short , long, float ,double, char, boolean containers we can store just  a single value
    Sometimes we need to store multiple values in a single container.
    To be able to store multiple values Java created a new structure, its name is "Array".

      Note: Arrays are to store multiple data in single data type
      You cannot store different data types in an array
     */
    public static void main(String[] args) {
        //How to create a Array
        String names[] = new String[5];
        //How to print an Array
        System.out.println(Arrays.toString(names));//[null, null, null, null, null]
        //                  (Array:Class name)   (toString : method)

       //How to put elements into an array
        names[0]= "Jim";
        names[1]= "Tom";
        names[2]= "Mary";
        names[3]= "Susan";
        names[4]="Mark";
        System.out.println(Arrays.toString(names));

        //How to print a spesific element in an Array
        System.out.println(names[3]);
        //Example 1: Create an integer array and print the sum of the first and the last elements on the console


        int num[] = new int[4];
        num[0]= 3;
        num[1]=2;
        num[2]=1;
        num[3]=4;
        System.out.println(num[0] + num[num.length-1]);

        //Example 2: Create a double array and find the summ of all elements in the array

        double sumOfdouble[] = new double[4];
        sumOfdouble[0]=1.2;
        sumOfdouble[1]=2.3;
        sumOfdouble[2]=5.0;
        sumOfdouble[3]=4.51;
        System.out.println(Arrays.toString(sumOfdouble));
        //1.Way
        double sum =0;
        for (int i =0;i<=sumOfdouble.length-1;i++){
            sum= sum + sumOfdouble[i];
        }
        System.out.println(sum);
        //2.Way: We will solve the task by using for-each-loop
        //       for-each-loop can be used with Arrays and Collections.

        double summy = 0;
        for (double w : sumOfdouble){
            summy = summy + w;


        }
        System.out.println(summy);









    }
}
