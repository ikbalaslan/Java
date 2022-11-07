package day13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1:Create a String Array and print the elements in alphabetical order on the console in different lines
        String cities[] = new String[5];
        cities[0]="Tokyo";
        cities[1]="Berlin";
        cities[2]="Istanbul";
        cities[3]="Jacsonville";
        cities[4]="Calgary";
        System.out.println(Arrays.toString(cities));//[Tokyo, Berlin, Istanbul, Jacsonville, Calgary]

        //How to put elements in alphabetical order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));//[Berlin, Calgary, Istanbul, Jacsonville, Tokyo]

        for (String w : cities){
            System.out.println(w);
        }
        //Note: To get the number of characters from a String use "length()"
        //      To get the number of elements from on Array use "length"

        //Example 2:Create a String array and print the elements whose length is less than 5.
        //Short way to create an array and add elements into the array.
        String names[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        System.out.println(Arrays.toString(names));//[Ali, Thomas, Mark, Jackson, Tom, Martin]

        for (String w : names){
            if (w.length()<=5){
                System.out.print(" "+ w);
            }
        }
        System.out.println();
        //Example 3: Create a String array and print the elements before "Tom"
        String students[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        for (String w: students){
          if (w.equals("Tom")) {
              break;
          }
            System.out.print(" "+ w);


        }

        System.out.println();
        //Example 3: Create a String array and print the elements before "Tom" and "Tom"
       //My way
        String students1[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        for (String w: students1){
            if (w.equals("Tom")){
                System.out.print(w);
                break;
            }
            System.out.print(w);
        }

        System.out.println();
        //Teachers Way

        for (String w: students1) {
            System.out.print(w);
            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();
        //Example 5 : Create a String Array and print the elements different from "Tom".
        for (String w: students1){

            if (w.equals("Tom")) {
                continue;
            }
            System.out.print(" " + w);
        }


























    }
}
