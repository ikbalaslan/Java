package practice;

import java.util.Scanner;

public class QO2IfElseStatement  {
    public static void main(String[] args) {
        /*

  Ask user to enter his weight and height. Calculate body index of the user.
  To calculate body mass index use "bodyMassIdx = weight / squareOfHeigth" formula.
   ** 1) body mass inx less than 18.5 ==> "You are weak".
   ** 2) bodyMassInx between 18.5 -25 ==> Your weight is ideal
   ** 3) bodyMassIndex between 25-30 ==> You are fat
   **4) bodyMassIndex greater than 30 ==> Obese

  */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight");
        double weight = input.nextDouble();

        System.out.println("Enter the height");
        double hsq = input.nextDouble();
        double d2 = (hsq*hsq);

        double bodymass = weight/d2;

        System.out.println("Your IBM is" + bodymass);


        if(bodymass>0 && bodymass<=18.5){
            System.out.println("You are week");

        }else if(bodymass>=18.5 && bodymass <= 25){
        System.out.println("your weight is ideal");

        }else if(bodymass>25 && bodymass<=30){
            System.out.println("You are fat");

        }else if(bodymass>30) {
            System.out.println("obese");
        }else
            System.out.println("Unexpected situtation");



    }
}
