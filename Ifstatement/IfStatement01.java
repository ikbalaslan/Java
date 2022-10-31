package day03ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //if statement : We sometimes need to execute some codes under some spesific conditions
        //               If it rains I will cancel the picnic

        //Example 1: Type code to print negative for the numbers less than zero, non negative for the numbers greater than or equal to zero

        double d = 2.3;
        if(d<0){
            System.out.println("Negative");
        }
        if(d>0){
            System.out.println("Non-negative");
        }
        // Example 2: Type code to print "Divisible by 5" if the number can be divided by 5, otherwise print "Not Divisible by 5" if the number cannot be divided by 5

        //Note: "%" in Java is an operator gives you the remainder in division operation
        //       "%" is called "modulus" operator

        //Note: "!" in Java means "not"
        //    !true==>false !false==>true
        // 1.Way:
        int c = 16;

        if(c%5 == 0){

            System.out.println("Divisible by 5");
        }
        if(c%5 != 0){
            System.out.println("Not divisible by 5");

        }

        //2.Way:If else statement => Use it if you gave just two conditions
        // In the second way Java checked 1 condition but in the first way Java checked 2 condition which is bad for us.

        int k = 20;
        if(k%5==0){
            System.out.println("divisible by 5");

        }else{
            System.out.println("Not divisible by 5");

        }



















    }
}
