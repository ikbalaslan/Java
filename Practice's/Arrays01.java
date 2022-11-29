package javaquestionbank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
       // 1) Find the middle element in an integer array
       // Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

    int Arr[]  = {12, 5, 8, 13,25};
        Arrays.sort(Arr);
        if (Arr.length%2!=0){
            Integer indexOfMiddle = Arr.length/2;
            System.out.println(Arr[indexOfMiddle]);

        }else {
            Integer indexOfMiddle = Arr.length/2;
            System.out.println((Arr[indexOfMiddle]+Arr[indexOfMiddle-1])/2);
        }

        // ) Find the smallest positive element and greatest negative element in an integer array
        // Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int Array01[] = {-12, 18, -5, 23, -2};
        Arrays.sort(Array01);
        System.out.println("Smallest element is  " + Array01[0] + " Greatest element is " + Array01[Array01.length-1]);
        int x=0;
        int y=0;
        for (int w : Array01){
            if (w>0){
                x=w;

            }
        }

     /*   int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (Integer i=0;i<a.length;i++){
            if (a[i]<0 && a[i+1]>0) {
                System.out.println("Maximum negative: " + a[i]);
                System.out.println("Minimum positive: " + a[i+1]);


            }
        }
*/
        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        Integer minPositive = a[a.length-1];
        Integer maxNegative = a[0];
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





     //   Find the total number of characters used in String array elements
     //   Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

        String Ara[] = { "Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int num = 0;
        for (String w : Ara){
            num = num + w.length();
        }
        System.out.println(num);



     //   Count how many words start with 'a' or 'A' in a given String
        String s = "Apex is an object oriented aprogramming language";
       String sar[] =  s.split(" ");
     int  counter = 0;
       for (String w : sar){
           if (w.startsWith("a") || w.startsWith("A")){
               counter=counter +1;
           }
       }
        System.out.println(counter + " times word start with an 'A' or 'a' ");


       // Find the number of vowels in a String
        String sak = "Apex is an object oriented programming language";
        String[] arr = s.toLowerCase().split("");
        int counter1 = 0;
        for (String w : arr){
            switch (w){
                case "a":
                case"e":
                case "o":
                case "u":
                case"i":
                    counter1++;

            }
        }
        System.out.println(counter1 + " vowels in this sentence");





       // Type code to find array elements whose first and last characters are same
        String[] arrma = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        String ok = "";
        for (String w : arrma){
            if (w.indexOf(0)==w.indexOf(w.length()-1)){
                ok  = ok +" " + w;
            }
        }
        System.out.println(ok);

        //2.Way
        for (int i =0;i<arrma.length;i++){
            String firstChar = arrma[i].substring(0,1);
            String lastChar = arrma[i].substring(arrma[i].length()-1);
            if (firstChar.equals(lastChar)){

            }
        }

       // 9) Type code to find if a given element exists in a given array or not
        String[] arrmag = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String ssd = "object";
        int counter2 =0;
        for (String w: arrmag){
            if (w.equals(ssd)){
                counter2++;
            }
        }
        if (counter2>0){
            System.out.println("The element exists");

        }else{
            System.out.println("The element not exists");

        }

        // 10) Type code to find sum of the number of characters of array elements

        String[] kaka = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int sum =0;
        int counter4 = 0;
        for (String w : kaka){
          sum = sum + w.length();
        }
        System.out.println(sum);

       // 1) Type code to put all zeros to end in an integer array.
       //  Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        int kra[] = {5, 0, 2, 0, 3};
       int krar2[] = new int[5];
       int idx = 0;
       for (int sr =0; sr<kra.length;sr++){
           if (kra[sr]!=0){
               krar2[idx]=kra[sr];
               idx++;
           }
       }
        System.out.println(Arrays.toString(krar2));

       // 12) Create an integer array by getting the elements from the user then print the difference
        // between the smallest and the greatest elements on the console.






























    }
}
