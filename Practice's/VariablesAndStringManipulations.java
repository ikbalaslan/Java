package javaquestionbank;

import java.util.*;

public class VariablesAndStringManipulations {
    private static Object ArrayList;

    public static void main(String[] args) {
      //   Type a code to swap two integers.
        int x =12, y=15;
        x=x-y;
        y=x+y;
        x=y-x;
        System.out.println(x+" " + y);


      //  ) Create a short variable and convert it to an int variable.
        short x1 = 13;
        int x2 = x1;
        System.out.println(x2);
        //Create a long variable and convert it to an int variable.


        long age = 12L;
        int newAge = (int)age;
        //1) Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        String cityName = " mIAMI ";
        String citynameUpdated = cityName.trim().toLowerCase();
        System.out.println(citynameUpdated);
        String ct = citynameUpdated.toUpperCase().substring(0,1) + citynameUpdated.substring(1);
        System.out.println(ct);

        //2) Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String Ali = "Ali Can";
        String Ali1 = "Merve Star";
        String Ali2 = "Mark Tom";

        String nAli = Ali.replaceAll("\\s", "");
        String nAli1 = Ali1.replaceAll("\\s", "");
        String nAli2 = Ali2.replaceAll("\\s", "");
        int xy = nAli.length()+nAli1.length()+nAli2.length();
        System.out.println(xy);

//Create a String variable, print the number of non-digit characters in the String on the
//console.
//Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console


        String cd = "1a3Bcf4!...";
        String cd1 = cd.replaceAll("[0-9]", "");
        System.out.println(cd1);

        //5) Create a String variable and print just the last non-space character on the console for any
        //String.
        //Example: For ‘Ali Can’ you should print n
        // For ‘Miami ’ you should print i etc.
        String s = "Miami ";
        int idxOfLastNonSpace = s.trim().length()-1;
        System.out.println(idxOfLastNonSpace);
        String lastNonSpaceChar = s.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
        System.out.println("The non-space last character: " + lastNonSpaceChar);

       // Type code to print the elements whose indexes are odd numbers.

        String[] xd = {"123","23","41", "12" };

      for (int i = 0; i<xd.length;i++){
          if (i%2!=0){
              System.out.println(xd[i]);
          }
      }

        //find the number of elements in a multidimensional array.  //Example:{ {2,3}, {12}, {21,34,56}, {4}}
int idx=0;

       int arr[][] =  { {2,3}, {12}, {21,34,56}, {4}};
      for (int[] w : arr){
          for (int s1 : w){
              idx++;
          }
      }
        System.out.println(idx);

////Convert arr1 to one dimensional array.    !!!!!
//
//
////  { {"learn", "java", "it"}, {"is", "easy"} } ==>  { "learn", "java", "it", "is", "easy" }

String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
int idx2=0;
for (String[] w: brr){
    for (String s2 : w){
        idx2++;
    }
}
String brr2[] = new String[idx2];
    int idx3= 0;
        for (String[] w: brr){
            for (String s2 : w){
                brr2[idx3]= s2;
                idx3++;

            }
        }

        //Find the number of vowels in a String

        String str = "I like to move it move it";

        String str1 = str.toLowerCase().replaceAll( "[^aeiıou]", "");



        System.out.println(str1.length());

      //  8) Type code to find array elements whose first and last characters are same



       String[] arr2 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
   for (String w : arr2){
       if (w.substring(0,1).equals(w.substring(w.length()-1))){
           System.out.print(w + " ");
       }
   }

        //Example: set all elements to 1

    int a[][] = { {5,0}, {-2,4}, {65,-12,230}};
   for(int[] w : a){
       for (int w2 : w){
           w2=1;
       }
   }
        System.out.println(Arrays.deepToString(a));

   //create a String variable and find the sum of the ASCII values of the first and the last
        //characters of the String
        String s2 = "java is easy";
        char s3 = s2.charAt(0);
        char s4 = s2.charAt(s2.length()-1);
        System.out.println(s3 + s4);

        //) Create a String variable and print all characters except the first character on the console.
        // Example:If the String is ‘Java’ you should print ‘ava’ on the console
        String s5 = "Java";
        String allCharsExceptFirstChar = s5.substring(1);
        System.out.println("All characters except the first character: " + allCharsExceptFirstChar);


        //Create a String variable and print all characters except the last character on the console in
        //uppercases.
        //Example:If the String is ‘Java’ you should print ‘JAV’ on the console
String s5Upper = s5.toUpperCase().substring(0,s5.length()-1);
        System.out.println(s5Upper);

        //Create a String variable and print all characters except the first character and the last
        //character on the console in uppercases.
        //Example:If the String is ‘Java’ you should print ‘AV’ on the console.

      String s5UpperDupper = s5.toUpperCase().substring(1,s5.length()-1);
        System.out.println(s5UpperDupper);

        // Type code to check if a String has just a single space character any position in the middle
        //Example: For ‘Ali Can’ your code should print false on the console
        // For ‘ Ali Can ’ your code should print false on the console
        // For ‘ Ali Can ’ your code should print false on the console
        // For ‘Ali Can’ your code should print true on the console
        String Al = "Ali Can";
        if (Al.trim().equals(Al)){
            System.out.println(true);
        }else
        {
            System.out.println(false);
        }


        //2) Type code to check if a String has an uppercase initial and dot at the end.
        //Example: For ‘Ali’ your code should print false on the console
        // For ‘ali.’ your code should print false on the console
        // For ‘ Ali. ’ your code should print false on the console
        // For ‘Ali.’ your code should print true on the console
        // For ‘ALI.’ your code should print true on the consol

        Scanner input = new Scanner(System.in);
        String m1 = input.nextLine();
        System.out.println(m1);
        if (m1.charAt(0) != m1.toLowerCase().charAt(0)) {

            if (m1.charAt(m1.length() - 1) == '.') {
                System.out.println("true");
            }

        } else {
            System.out.println("false");
        }


 /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */













    }
}
