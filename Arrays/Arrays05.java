package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1:09/20/2022 is given, print the data like "Month:09   Day:20   Year:2022"

        String date = "09/20/2022";
       //split() method returns Array
        String dateArray[] = date.split("/");
        System.out.println(Arrays.toString(dateArray));
        System.out.println("Month:" + dateArray[0] + " Day:" + dateArray[1] + " Year:" + dateArray[2] );

        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        String arraystr[] = str.split(" ");
        System.out.println("The number of the word is " + arraystr.length);

        //Example 3 : Count the number of words starts with "a" in the string.
        System.out.println("Enter a sentence2");
        String attr = input.nextLine();
        String attrarray[] = attr.split(" ");
        int counter = 0;// This is called "flag"

        for (String w : attrarray){

            if (w.startsWith("a") || w.startsWith("A")){
                counter ++;
            }
        }
        System.out.println(counter);


        //Example 4: Type code to find the longest word in the sentence.
        //My Way.

        System.out.println("Enter the sentence ");
        String srrt = input.nextLine();
       String arraysrrt[] = srrt.split(" ");
       String empty = "";
       for (String w : arraysrrt){

           if (w.length()>empty.length()){
               empty = w;
           }
       }
        System.out.println(empty);
       //Teacher's Way.
        String s="I want to go university to learn more";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);






































    }
}
