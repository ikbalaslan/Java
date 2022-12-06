package practice.withagroup;

import java.util.Arrays;
import java.util.Comparator;

public class Questions {
    public static void main(String[] args) {
     //1-  // Type code to check if a password is valid or not for the following conditions;
       // Password must have at least 8 characters different from space character
       // Password must have at least 1 symbol


        String spwd = "a1 !2   s def ";
        boolean firstRule = spwd.replaceAll("\\s", "").length()>7;

        //Password must have at least 1 symbol

        //boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]","").length()>0;

        //Following can be used to remove space as well but it is difficult to notice space was removed, because of that above is better to use
        boolean secondRule = spwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        System.out.println("Is the password valid? " + (firstRule && secondRule));

//2-    //Type code to check the password
       // If it has more than 8 characters, inital should be 'i'
        // If it has no more than 8 characters initial should be 'K'
       // Solve the task by using nested-ternary

       String pwd = "K212";

      Object password = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "it is okey" : "it is not okey") : pwd.charAt(0)=='K' ? "It is okay" : "it is not okey";
      System.out.println(password);
      //3-  //Example 4: Type code to find the longest word in the sentence.
        String s="I want to go university to learn more";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);

        //4-2) Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        Integer minPositive = a[a.length-1];
        Integer maxNegative = a[0];
        System.out.println(maxNegative);
        for(Integer w : a){
            if(w>=0){
                minPositive = Math.min(minPositive, w);
            }
            if(w<0){
                maxNegative = Math.max(maxNegative, w);
            }
        }
        System.out.println("Minimum positive: " + minPositive);
        System.out.println("Maximum negative: " + maxNegative);

        //5- 16) Type all characters before the first occurrence of 'm' in a String
        String sd = "Christmas";
        String result = "";
        for(int i=0; i<sd.length(); i++){
            String c = sd.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;
        }
        System.out.println(result);










    }

}
