package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyTraining06 {
    public static void main(String[] args) {

        /*  Question 2

         * * * * *
         * * * *
         * * *
         * *
         *

         */

       /* int x =5;
        for (int i = 1;i<=x;i++){
            for (int k =5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();


        }

        */
        /*  Question 3


         *
         * *
         * * *
         * * * *
         * * * * *

         */
/*
        int x = 5;
        for (int i=1;i<=x;i++){
            for (int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

 */

/*  Question 4


0
1 1
2 2 2
3 3 3 3
4 4 4 4 4


 */


                /*int i, j, rows;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of rows you want to print: ");
                rows = sc.nextInt();
                for (i = 1; i <= rows; i++)
                {
                    for (j = 1; j <= i; j++)
                    {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }

                 */

           /*     int s =7;
        for (int m=s;m>=1;m--){
            for (int n=m;n>=1;n--){
                System.out.print(n);
            }
            System.out.println();
        }



            */

             /*   int i, j, rows=9;
                for (i = 1; i <= rows; i++)
                {
//Prints first half of the row
                    for (j = 1; j <= i; j++)
                    {
                        System.out.print(j+" ");
                    }
//Prints second half of the row
                    for (j = i-1; j >= 1; j--)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }

              */
        /*  Question 5

0 1 2 3 4
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8

*/
        int row= 4;
        for (int i =0;i<=row;i++){
            for (int k =i;k<=i+4;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        /*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


 */
        /*
Type code to find array elements whose first and last characters are same
*/
        String kutu[] = new String[5];

        //Example 8: Type code to increase all salaries in an Integer List 10 percent.
        //           [5000, 6000, 4500, 3900, 7200]

        List<Double> k = new ArrayList<>();
        k.add(5000.0);
        k.add(6000.0);
        k.add(4500.0);
        k.add(3900.0);
        k.add(7200.0);
        for (int i =0;i<k.size();i++){
            k.set(i,(k.get(i))*1.1);

        }
        System.out.println(k);






















    }
}
