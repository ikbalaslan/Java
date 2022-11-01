package day04nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // Create a calculator which does addition , calculation , subtraction, multiplication, division, percentage calculation.

        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter the first number...");
        double firstNum = input.nextDouble();

        System.out.println("Enter the second number...");
        double secondNum = input.nextDouble();

        System.out.println("Enter the operation amoung +,-,*,/");
        char operation = input.next().charAt(0);

        switch(operation) {
            case '+':
                System.out.println(firstNum + secondNum);
                break;

            case  '-':
                System.out.println(firstNum - secondNum);
                break;

            case  '*':
                System.out.println(firstNum * secondNum);
                break;

            case  '/':
                System.out.println(firstNum / secondNum);
                break;
            case '%':
                System.out.println((firstNum * secondNum) / 100);
                break;

            default:
                System.out.println("That operation is not supported by this calculator");
        }


















        }
}
