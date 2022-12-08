package practice;

import java.util.Scanner;

public class QO3_ifElse02 {
    public static void main(String[] args) {
        //1.Step: Create Scanner object
        Scanner input = new Scanner(System.in);

        //2.Step Give message to the user
        System.out.println("Enter your age please");

        //3.Create container according to data type.

        Integer age = input.nextInt();

        if (age>=0 && age<=4){
            System.out.println("baby");
        }else if (age>=5 && age<=12){
            System.out.println("child");
        }else if (age>=13 && age<=20){
            System.out.println("Teenager");
        }else if (age>=21 && age<30){
            System.out.println("adult");
        }else{
            System.out.println("Not expected age");

        }

         //Note: "&&" and for Java it is different from "||" beacuse when we type "&&" it must true both side . But in "||" if 1 side it will be true for Java


        byte a = 4;
                byte b = 5;
                System.out.println("a+b+c");





    }


}


