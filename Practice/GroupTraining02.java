package practice.withagroup;

import java.util.*;

public class GroupTraining02 {
    public static void main(String[] args) {
         /*
  Create a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
*/
      String orgX = "adam";
        String x = "adam";
    List<String> l1 = new ArrayList<>();
    l1.add("mada");


         boolean r =  reverseOfAString(x).equals(l1.stream().findFirst().get());
         System.out.println(r);

       String res1 = l1.stream().findFirst().get();
        System.out.println(res1);

    }
    public static String reverseOfAString(String str){
       String templet = "";
        for (int i =str.length()-1;i>=0;i--){

           templet = templet + str.charAt(i);
        }
        return templet;

    }
}
