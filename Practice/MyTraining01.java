package practice;

public class MyTraining01 {
    public static void main(String[] args) {
        //3.Example: Type all integers from 44 to 11 in the same line with a space between consecutive integers.

        for (int i = 44; i>10; i-=1){
            System.out.print(i + " ");
        }

        System.out.println();
        //5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers
        // Odd integers is when dividing 2 remainder should be 1

        for (int i = 68; i>12;i-=1){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }









    }
}
