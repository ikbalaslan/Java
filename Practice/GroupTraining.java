package practice.withagroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GroupTraining {
    public static void main(String[] args) {
        /*  AtbashCode ; It is a simple method based on the Hebrew alphabet to encrypt or decrypt a text.
 The first letter of the alphabet is used instead of the last letter.
"abcdefghijklmnopqrstuvwxyz"; 26 character
"zyxwvutsrqponmlkjihgfedcba";
 */
        String a = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i<a.length();i++) {

            switch (a.substring(i,i+1)){
                case "a" :
                    a.replace("a","z");

            }

        }

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        //Find how many elements are there in the given array.


        //By using Iterator remove a specific element from an Integer List
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(19);
        list.add(21);
        list.add(35);

       ListIterator<Integer> n =  list.listIterator();
   int removeIt = 19;
     while(n.hasNext()){
         if (n.next()==removeIt){
             n.remove();
         }
     }
        System.out.println(list);
      /*
    Write the Java code that evaluates the test results of the students using the method
     // students' answers
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // answer key
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    output:
     Student 1 has 7 correct answers.
     Student 2 has 6 correct answers.
        " "
        " "
        " "
     Student 8 has 7 correct answers.
*/

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int k =1;

        for (char[] w : answers){
            int idx=0;


            for (int i =0; i<w.length ; i++){

                if (w[i] == keys[i]){
                    idx++;
                }
            }
            System.out.println("Student " +  k + "has " + idx + "Correct answer");
            k++;
        }




    }
}
