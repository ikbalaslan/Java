package practice.withagroup;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PracticesGroup {
/*Question-1  Write java code checking the number is Perfect number or not.

    * Any number can be a Java Perfect Number if the sum of its positive divisors
    excluding the number itself is equal to that number.
 */



    public static void main(String[] args) {

        //Question 2) Type a code  to find the duplicate values of an array of integer values.

//        Integer[] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67};


//        for (int i = 0; i < arr.length; i++) {
//
//            for (int k = i + 1; k < arr.length; k++) {
//
//                if (arr[i] == (arr[k])) {
//                    System.out.println(arr[i] + " ");
//
//                }
//            }
//
//        }

        //Question 3 )Type a program which gets integer values from the user and
        //  stops by displaying "Done" when the sum of these values is grater than 100
        Scanner input = new Scanner(System.in);
    /*   int sum=0;
        do {
            int x = input.nextInt();

            sum = sum + x;
            if (sum>100){
                System.out.println("Done");
                break;
            }
        }while(true);

     */

        //Question 4) A four-digit number ABCD is called  Lucky if A+B = C+D
        //   Write a program that asks the user to enter a four-digit number and
        //   tell if the number is a lucky number or not
        //    Example: 3719 ==> 3+7 = 1+9  This is a Lucky number
//        System.out.println("Enter a  number");
//        String x = input.next();
//        int sum1 = 0;
//        int sum2 = 0;/////     12345 2.5 2 0,1,2             1234 4 || 2   0,1  <
//        int sum3 = 0;
//        int sum4 = 0;
//        if (x.length()%2==0) {
//            for (int i = 0; i < x.length() / 2; i++) {
//                sum1 = sum1 + Integer.valueOf(x.substring(i,i+1));
//
//            }
//            for (int k = x.length()/2; k< x.length();k++){
//                sum2=sum2 + Integer.valueOf(x.substring(k,k+1));
//            }
//            if (sum1 == sum2){
//                System.out.println("lucky");
//            }
//        }
//
//        if (x.length()%2==1){
//            for (int i = 0; i < x.length() / 2; i++) {
//                sum3 = sum3 + Integer.valueOf(x.substring(i,i+1));
//
//            }
//            for (int k = x.length()/2+1; k< x.length();k++){
//                sum4=sum4 + Integer.valueOf(x.substring(k,k+1));
//            }
//            if (sum3 == sum4){
//                System.out.println("Lucky B");
//            }
//        }

       // Question 5 )Create a method to count all words in a string
        // get the string from user

        System.out.println();



        // Question 5 )Create a method to count all words in a string
//  get the string from user


        String str = "Ali Ali came to to";

        str = str.replaceAll("\\p{Punct}", "");     //Ali came to school and Ayse came to school
        // or replaceAll("\\W", "")

        String wordArray[] = str.split(" ");
        Arrays.sort(wordArray);

        System.out.println(Arrays.toString(wordArray));             //[Ali, came, to, to]

//1
//        for (int i = 0; i < wordArray.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < wordArray.length; j++) { // came to
//                if (wordArray[i].equals(wordArray[j])) {
//                    count++;
//
//                    if (j == wordArray.length-1) {
//                        i = j;
//                    }
//
//                } else {
//                    i = j - 1;
//                    break;
//                }
//            }
//            System.out.println(wordArray[i] + " = " + count);
//
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digit number, please");
        int  number = scan.nextInt();

        String numb = String.valueOf(number);
        String arr[] = numb.split("");

        int ab =0;
        int cd =0;

        for (int i = 0; i < numb.length() / 2; i++) {

            ab += Integer.valueOf(arr[i]);

        }


        for (int j = numb.length() / 2+1; j < numb.length(); j++) {

            cd += Integer.valueOf(arr[j]);
        }

        if (ab == cd) {
            System.out.println("Lucky Number");
        } else {
            System.out.println("Not Lucky");
        }

    }

    }






















