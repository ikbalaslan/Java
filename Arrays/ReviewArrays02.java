package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewArrays02 {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

        int str[] = {0, 2, 3, 0, 12, 0};

        int art[]  = new int[6];

        int k = 0;

        for (int i =0;i<str.length;i++){
            if (str[i]!=0){
                art[k]=str[i];
                k++;

            }
        }
        System.out.println(Arrays.toString(art));

        // Example 2: Type code to check if a specific element exists in an array or not
        //            int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr[] = {-12, 23, 5, 23};
     int  counter = 0;
        for (int w : crr){
            if (w==23){
                counter++;
            }
        }
        if (counter > 0){
            System.out.println(counter + " times 23 exists ");
        }else{
            System.out.println("23 Is not exists");
        }

        //Example 1:09/20/2022 is given, print the data like "Month:09   Day:20   Year:2022"

        String arrma = "09/20/2022";
        String sarma[] = arrma.split("/");

        System.out.println("Month:" +  sarma[0] +"day: " + sarma[1]+ "Year " + sarma[2]);



        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

        Scanner input  =new Scanner(System.in);
        System.out.println("Enter a code");
        String strr = input.nextLine();
        String kamas[] = strr.split(" ");
        System.out.println(kamas.length);
















    }
}
