package practice.withagroup;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Question 1)Type the code to print number by increasing 3 starting from 10 up to 61
//61 will be included

        for (int k=3;k<=61;k=3+k){
            System.out.println(k);
        }

        //
       //Type code to print to reverse a String
        //   i)by using loop
        //   ii)by using a method from StringBuilder Class
        //
        //  String str = "Tom Hanks";  ==> "sknaH moT"

        String str = "Tom Hanks";
        String str1 = "";
        for (int i = str.length()-1;i>=0;i--){
            str1=str1 + str.charAt(i);

        }
        System.out.println(str1);



//Type code to find the sum of the digits of an Integer by using loop
// int n = -3558;   ==> 3+5+5+8=21
        String a = "-3558";
        String nn = a.replaceAll("\\p{P}", "");
        int x =0;
        for (int i =0;i<nn.length();i++){
            String c = nn.substring(i,i+1);
            x= x + Integer.valueOf(c);

        }
        System.out.println(x);


        //Type code to print characters before the last occurrence of "p" in a String
// String str = "Mississippi";   Output ==> "Mississip"
        String str12 = "Mississippi";
       int xy = str12.lastIndexOf('p');
        for (int i = 0;i<xy;i++){

            System.out.println(str12.charAt(i));
        }

        //Ask user to enter a positive integer and then find and print  the sum of the digits of that number by using while loop.
  Scanner input  = new Scanner(System.in);




        //Ask user to type a positive  Integer and type code to find the sum of the unique digits of that integer


        String xd = input.next();

        int n1 = 0;
        for (int i =0;i<xd.length();i++){
          String cd = xd.substring(i,i+1);
            if (xd.indexOf(i)==xd.lastIndexOf(i)){

                n1=n1 + Integer.valueOf(cd);
            }
        }System.out.println(n1);


        //Ask user to enter an integer and then type a code that prints all prime numbers less than a given number.
// Example: If user enters 20 output will be 2, 3, 5, 7, 11, 13, 17, 19

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = scan.nextInt();

        String numbers = "";
        int counter =0;
        for(int i= 2; i<n; i++){

            for(int k=1; k<=i; k++){
                if(i%k==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.print(i + " ");
            }
            counter = 0;
        }
//Type code to print repeated characters in a String by using do while loop
//Example: String str = "accessories";   ==>  ces

        String str4 = "accessories";
       String str5= "";
        for (int i =0; i<str4.length();i++){
            if (str4.indexOf(str4.charAt(i))!=str4.lastIndexOf(str4.charAt(i))){
                str5 = str5 + str4.charAt(i);
            }
        }
        System.out.println(str5);






    }
}
