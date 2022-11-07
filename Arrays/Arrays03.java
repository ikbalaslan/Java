package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
       //Example 1:Let user to enter student names into the application
        //         (Create an Array together with the user)


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students you want to enter ");
        int numOfStd = input.nextInt();
        //1.Step: Create an Array

        String names[] = new String[numOfStd];
        System.out.println(Arrays.toString(names));

        //2.Step: Insert the elements into the Array
        for (int i = 0;i<numOfStd;i++){
            System.out.println("Enter the student name");
            String stdName = input.next();
            names[i]= stdName;

        }
        System.out.println(Arrays.toString(names));








































    }
}
