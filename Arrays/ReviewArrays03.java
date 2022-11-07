package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ReviewArrays03 {
    public static void main(String[] args) {
        //Example 3 : Count the number of words starts with "a" in the string.
        String str = "aslan kamas yaman yamyam abama Abama";
        String ass[] = str.split(" ");
        int counter = 0;
        for (String w: ass){
            if (w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter + " times word starts with an a");

        //Example 4: Type code to find the longest word in the sentence.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String ham = input.nextLine();
        String yamyam[] = ham.split(" ");
        Arrays.sort(yamyam, Comparator.comparingInt(String :: length));
        System.out.println(yamyam[yamyam.length-1]);


















    }
}
