package practice;

import java.util.Scanner;

public class MyTraining03 {
    public static void main(String[] args) {

         /*
            3.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
        */

     /*   System.out.println("Enter the number of the rows");
        int numOfRows = input.nextInt();
        for (int i =1;i<=numOfRows;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();

      */
        /* Type code for this pattern

1****
2***
3**







         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int numOfRows = input.nextInt();
        for (int i =1;i<=numOfRows; i++){
            System.out.print(i);
            for (int k =numOfRows-i; k>0;k--){
                System.out.print("*");

            }
            System.out.println();
        }






    }
}
