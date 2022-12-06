package practice.withagroup;

import java.util.Arrays;

public class Practic01 {
    public static void main(String[] args) {


        /*  Question 5

0 1 2 3 4
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8

*/

/*

        int x =4;
        for (int i = 0;i<=x;i++){
            for (int k =i;k<=i+4;k++){
                System.out.print(k);
            }
            System.out.println();
        }

 */


        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */







  /*  Question 9

    0
   1 1
  2 2 2
 3 3 3 3
4 4 4 4 4


  */


/*
      int n=5;

        for(int i=0; i<n; i++) {

        for(int j=n-i-1; j>0; j--) {
            System.out.print(" ");          //tek bosluk
        }

        for(int k=0; k<=i; k++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15


                */
      /*  int i,j,k=1;
        for (i =1;i<6;i++){
            for (j=1;j<i+1;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }

       */


/*  Question 8

/*
         *
       * *
     * * *
   * * * *
 * * * * *

 */
        int m=5;
        for (int b=0;b<5;b++) {
            for (int k = 4- b ; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int c = 0; c <=b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }


//4-2) Find the smallest positive element and greatest negative element in an integer array
//Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
      //  9:53
        int[] a1 = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        int minimumPositive = a1[a1.length-1];
        int greatestNegative = a1[0];
        for (Integer w : a1){
            if (w>0){
                minimumPositive = Math.min(minimumPositive,w);
            }
            if (w<0){
                greatestNegative = Math.max(greatestNegative,w);
            }
        }
        System.out.println("Minimum Positive : " + minimumPositive);
        System.out.println("Greatest Negative : " + greatestNegative);

















    }}

