package practice;

import java.sql.SQLOutput;
import java.time.MonthDay;
import java.util.Scanner;

public class MyTraining02 {
    public static void main(String[] args) {
        //Example 1: Get first , miidle, last names, and the SSN from the user then print them like the given format
        // Tom jim Hanks
        // 214123525
        Scanner input = new Scanner(System.in);

        /*System.out.println("Enter your first middle and last name");
        String name = input.next();
        System.out.println("Enter your SSN");
        String SSN = input.next();
        System.out.println(name);
        System.out.println(SSN);

         */

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        /*System.out.println("Enter your age");
        Integer age = input.nextInt();
        if (age>=0&&age<=4){
            System.out.println("baby");
        }else if (age>=5&&age<=12){
            System.out.println("child");
        }else if (age>=13&&age<=20) {
            System.out.println("teenager");
        }else if (age>=21&&age<=30) {
            System.out.println("adult");
        }else System.out.println("Not expected age");

         */

       /* Ask user to enter a password

        If the initial of the password is uppercase
        Check if it is ‘A’ or not.
        If it is ‘A’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

        If the initial of the password is lowercase
        Check if it is ‘z’ or not.
        If it is ‘z’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
                */

       /* System.out.println("Enter the password");
        char psw = input.next().charAt(0);

        if (psw>='A' && psw<='Z'){

        }if (psw=='A'){
            System.out.println("Valid password");

        }else System.out.println("Invalid password");

        */

        //Get the number of days from user and print the name of the day
        //For example; 1 ==> Sunday, 2 ==> Monday, etc.
       /* System.out.println("Enter the day number");
        int day = input.nextInt();
        switch (day){
            case 1 :
                System.out.println("Sunday");
                break;
                case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter valid number");
        }
        */

        // Create a calculator which does addition , calculation , subtraction, multiplication, division, percentage calculation.
      /*  System.out.println("Enter the number1");
        double calculation1 = input.nextDouble();
        System.out.println("Enter the number2");
        double calculation2 = input.nextDouble();
        System.out.println("Enter your operation sign");
        char symbol = input.next().charAt(0);


        switch (symbol){
            case '-' :
                System.out.println(calculation1-calculation2);
                break;
            case'%':
                System.out.println((calculation1*calculation2)/100);

        }
        /*
        Type Java code by using nested ternary.
        Write a program to check if a year is "leap year" or not.
        1)if the year is divisible by 100 then it must be divisible by 400.
        2)If a year is not divisible by 100 then it must be divisible by 4.
         */
       /* System.out.println("Enter the year number");
        int yearNum = input.nextInt();

      Object leapyear =   yearNum%100==0 ? (yearNum%400==0 ? "leap year" : "not leap year") : (yearNum%4==0 ? "leap year" : "Not leap year");
        System.out.println(leapyear);
        */

        //Type code to check the password
        // If it has more than 8 characters, inital should be 'i'
        // If it has no more than 8 characters initial should be 'K'
        // Solve the task by using nested-ternary

       /* System.out.println("Enter the password");
        String password = input.next();
       Object pw = password.length()>8 ? (password.charAt(0)=='i' ? "Valid Pass" : "Invalid pass") : (password.charAt(0)=='K' ? "Valid with a different way" : "Non-Valid");

        System.out.println(pw);
        */

        //1.Example: Print the first and the last character of the given String on the console. "Java is easy" ==> Jy

       /* String s = "Java is easy";
      char c = s.charAt(0);
      char d = s.charAt(s.length()-1);
        System.out.println("" +c+d);
       String e = s.substring(0,1);
       String f = s.substring(s.length()-1);
        System.out.println(e+f);

        //4.Example: Type code to find the number of words in a String // ; "I like to move it, move it" ==> 7
        String dot = "I like to move it, move it";
       int not = dot.split(" ").length;
        System.out.println(not);

        //3.Example: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.
        String n = "Ali can";
        char firstName = n.charAt(0);
       String lastName = n.split(" ")[1].substring(0,1);
        System.out.println(firstName + lastName);

        */
        //Example 1: Type code to see the order number of the first occurance of the  character 'a'
       /* String Java = "I love Java, bam bam Java";
      int num =  Java.indexOf('a')+1;
        System.out.println(num);

        //Example 3: Type a code to check if a String has 'a' in it or not. Print appropriate messages for the scenerios.

        boolean trueOrNot = Java.contains("a");
        System.out.println(trueOrNot);

        // Example 4: Type code to find the order number of last occurence of "Java".
      int firstOc =  Java.lastIndexOf("Java")+1;
        System.out.println(firstOc);
        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique, l isnt unique beacuse it repeats.


        */
        /*
        String str = "Hello";
        if (str.indexOf('l')==str.lastIndexOf('l')){
            System.out.println("unique");
        }else
            System.out.println("Not unique");

         */
        /*
        String str = "123345";
        int dx=0;

        for (int i =0;i<=str.length()-1;i++){
            String d2 =str.substring(i,i+1);
            if(str.indexOf(d2) == str.lastIndexOf(d2))
            dx = dx + Integer.valueOf(d2);
        }
        System.out.println(dx);

        Example 2: Type code to check if a password is valid or not for the following conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol
                */
     /*   String psw = "12  4gfag";
       boolean d2 = psw.replaceAll(" ", "").length()>=8;
        System.out.println(d2);
        boolean d3 = psw.replaceAll("[a-zA-Z0-9 ]", "").length()>=1;
        System.out.println(d3);

      */
       /* String str = "Ali is is 13 years old, I like Ali, Ali does not like me!...";

        //Example 1: How many punctutation marks are used in the given String
        // All punctuation marks: \\p{Punct}

        String dot = str.replaceAll("[^\\p{Punct}]", "");
        System.out.println(dot.length());

        */

       /* //Example 2: Ask user to enter his full name, and fix if the user enters space at the begining and at the end.
        String i =input.nextLine();
        String d =i.trim();
        System.out.println(d);
         */

        //Example 1:Check if a String has just letters and spaces in it
       /* String str = "Java is Easy";
        boolean d =str.replaceAll("[a-zA-Z0-9 ]", "").length()==0;
        System.out.println(d);


        */
       // Example 1:Type code to print "Hi" Five times on the console
       /* String str = "Hi";
        for (int i=0;i<5;i++) {
            System.out.print(str);
        }

        */
        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        //4.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

       /* for (int i = 11; i<45;i++){
            if (i%2==0){
                System.out.print(i + " ");

        */
        //1.Example: Put "*" between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*
      /*  String J = "Java";
        String d = "";
        for (int i =0;i<=J.length()-1;i++){
            System.out.print(J.charAt(i)+"<3");

        }

       */
//2.Example: Type code to print unique characters in a String. Hello ==> Heo
      /*  String S= "Hello";

        for (int i =0; i<=S.length()-1;i++){

            if (S.indexOf(S.charAt(i))==S.lastIndexOf(S.charAt(i))){
                System.out.print(S.charAt(i));

            }

        }
         //2.Example: Type code to print unique characters in a String. Hello ==> Heo
       */

              /*
        Example 2: Swap the integers
        a=12, b=23 ==> a=23   b=12
         */

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo
      /*  String s = "Hello";
        for (int i =0;i<=s.length()-1;i++){
      if (( s.indexOf(s.charAt(i)))==(s.lastIndexOf(s.charAt(i)))){
                System.out.print(s.charAt(i));
            }
                Example 2: Swap the integers
        a=12, b=23 ==> a=23   b=12
       */
       /* int a =12;
        int b =23;
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println(a);
        System.out.println(b);

        */

        //Example 1: Type code to reverse a String
        //           For Example: Tom ==> moT
        /*String a = "Tom";
        String rev= "";
        for (int i = a.length()-1;i>=0;i-- ){
            char ch = a.charAt(i);
            rev = rev + ch;


        }
        System.out.print(rev);

         */
        //Example 2: Find the sum of the integers from 3 to 6
       String str = "3456";
       int sum = 0;
       for (int i = 0; i<=str.length()-1;i++) {
          String s = str.substring(i,i+1);

        sum=  sum + Integer.valueOf(s);


       }
        System.out.println(sum);


        // //Example 3: Find the multiplication of the integers from 3 to 6,
        int d =1;
        for (int i =3;i<=6;i++){
            d=d*i;

        }
        System.out.println(d);

        //Example 1: type code to print characters except "m" in a String.
        //           For example, Andromeda ==>Androeda
 String d3 = "Andromeda";
 for (int i = 0; i<=d3.length()-1;i++){                      //SOR

     if (d3.charAt(i)=='m'){
         continue;

     }


 }System.out.println(d3);

        //Example 3: Type code to find the sum of the unique digits in an integer
        //            For example, 1232,==> 1+3=4

        String sd = "1232";
        String f1 = "";
        int f2=0;
        for (int i=0;i<=sd.length()-1;i++){
            String digits = sd.substring(i,i+1);

           if (sd.indexOf(digits)==sd.lastIndexOf(digits)){
               f2=f2 + Integer.valueOf(digits);


            }
        }
        System.out.println(f2);





        String d6 = "Andromeda";
        for (int i = 0; i<=d3.length()-1;i++){                      //SOR

            if (d6.charAt(i)=='m'){
                continue;

            }System.out.println(d6.charAt(i));


        }




















































































    }
}
