package practice.withagroup;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MyTraining08Lists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */

        // 3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
// arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }

        //Type code to find the common elements between two String Arrays.
        //(Without case sensitivity)
        //input1 : {John,Brad,Anger,Sofia,Emily} input2 : {sofia,brad,grace,emily,hazel}


        String input1[] = {"John","Brad","Anger","Sofia","Emily"};
        String input2[] = {"sofia","brad","grace","emily","hazel"};
        int counter=0;
        for (int i = 0; i<input1.length;i++){
            for (int k=0;k<input2.length;k++){
                if (input1[i].equalsIgnoreCase(input2[k])){

                    counter++;

                }
            }
        }
int idx = 0;

        String input3[] = new String[counter];
        for (int i = 0; i<input1.length;i++){
            for (int k=0;k<input2.length;k++){
                if (input1[i].equalsIgnoreCase(input2[k])){

                    input3[idx]= input2[k];
                    idx++;

                }
            }
        }
        System.out.println(Arrays.toString(input3));


          /*
       If the list has 15 as element, change all 15s to 51
       Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
       */
        List<Integer> lis1 = new ArrayList<>();
        lis1.add(15);
        lis1.add(12);
        lis1.add(15);
        lis1.add(34);
        lis1.add(43);

        for (Integer w : lis1){
            if (w==15){
                lis1.set(lis1.indexOf(15),51 );
            }
        }
        System.out.println(lis1);


        //15) String shirtPrice = ‘$12.99’;
        //String bookPrice = ‘$35.99’;
        //Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";

        String bookPrice = "$35.99" ;

       double x =  Double.valueOf(shirtPrice.replace("$",""));
       double y = Double.valueOf(bookPrice.replace("$",""));

        System.out.println(x+y);

//Type code to get initials of the first name and the last name of a given name. Middle name
//is out of scope.
//Example: Tom Hanks ==> TH, Mary Star ==> MS

        String str = "Tom Hanks";
        String btr = "Mary Star";
        String strSplitted = str.split(" ")[1];
        System.out.println("" + str.charAt(0) + strSplitted.charAt(0));
        String btrSplitted = btr.split(" ")[1];
        System.out.println("" + btr.charAt(0) + strSplitted.charAt(0));

            //Type a code to find the number of punctuation marks used in a String ("\\p{Punct}", "")
        String str1 = "123.,.,.,124421:";
        String str1Re = str1.replaceAll("\\p{Punct}", "");
       int k =  str1.length()-str1Re.length();
        System.out.println(k);

        //1) Type the code that finds out how many days Ali lived.
        //Date of birth of Ali is 12th of May 2002

        LocalDate AliDate = LocalDate.of(2002, Month.MAY,12);
        LocalDate now = LocalDate.now(ZoneId.of("Asia/Istanbul"));
        System.out.println(now);

       long HowMany = ChronoUnit.DAYS.between(AliDate,now);
        System.out.println(HowMany);


       //Type the code that finds out how many months Ali lived.
        //Date of birth of Ali is 4th of June 199

        LocalDate Tom = LocalDate.of(1999,06,4);
        long between1 = ChronoUnit.MONTHS.between(Tom,now);
        System.out.println(between1);

        //) Date of birth of Ali is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
        //and 12 days after Ali's birth date.
        LocalDate Tom1 = LocalDate.of(1999,06,4).plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(Tom1);

        //4) Ali was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code to calculate the exact date of birth of Ali and Veli
        //Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate Memo = LocalDate.of(1923, Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate Ato = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("Memo date is " + Memo    + "Ato Date is : " + Ato);
        boolean s = Memo.isEqual(Ato);
        System.out.println(s);

        //Veli was born 3 years and 11 days after Ali.
        //Ali gave you his date of birth as 24th of November 2012
        //Type code to calculate Veli’s date of birth
        LocalDate Veli = LocalDate.of(2012, Month.NOVEMBER,24).plusDays(11).plusYears(3);

        LocalDate Ali3 =  LocalDate.of(2012, Month.NOVEMBER,24);

        System.out.println("Veli " + Veli);


        //) Create a Date Value for your birth date and create Date Value for your kid's birth date then
        //calculate the difference in days.
        LocalDate Veli1 = LocalDate.parse("2022-12-24");
        LocalDate Veli2 = LocalDate.parse("2010-02-01");
       long difference1 = ChronoUnit.DAYS.between(Veli1,Veli2);
        System.out.println(difference1);

        //Get the last 2 digits of the year in current date
        LocalDate myDob = LocalDate.of(1996, 8, 21);
        int lastTwoDigits = myDob.getYear()%100;
        System.out.println("Last 2 digits of the year is " + lastTwoDigits);

        //
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MMMM/yy");

        System.out.println(Veli1);
        String k1 = formatted.format(Veli1);
        System.out.println(k1);

        //8) Type code to check if a given year is “Leap year” or not
        //Leap Year:
        //i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900
        //is not
        //ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007
        //is not

        //Ternary

        int year = 1904;
       Object leapyear = year%100==0 ? year%400==0 ? "Leap Year" : "Not leap year" : year%4==0 ? "leap year" : "not leap year";
        System.out.println(leapyear);

        //Date
        LocalDate leap = LocalDate.parse("1904-12-12");
        if (leap.getYear()%100==0&&leap.getYear()%400==0){
            System.out.println("leapppp ");
        }else if ((leap.getYear()%100!=0)&&(leap.getYear()%4==0)){
            System.out.println("leapppp ");
        }else{
            System.out.println("FAILED");
        }

        //0) Find the difference in hours for two different dates


        LocalDateTime Velii1 = LocalDateTime.of(2014,9,9,19,46,45);
        LocalDateTime Velii2 = LocalDateTime.of(2015,3,12,19,46,45);
        long between = ChronoUnit.HOURS.between(Velii1,Velii2);
        System.out.println(between);


        LocalDateTime timeInJapan = LocalDateTime.now(ZoneId.of("Asia/Istanbul"));
        System.out.println(timeInJapan);
        LocalDateTime timeInGermany = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(timeInGermany);
        long difference = ChronoUnit.HOURS.between(timeInGermany, timeInJapan);
        System.out.println(difference);


        //1) Type code to print
        // a) "Winter" for December, January, February
        // b) "Spring" for March, April, May
        // c) "Summer" for June, July, August
        // d) "Fall" for September, October, November
        // e) "Invalid month name" for all the other

        String month = "December";

        switch(month.toLowerCase(Locale.ROOT)){
            case "january":
                System.out.println("1");
                break;
            case "february":
                System.out.println("1");
                break;
            case "march":
                System.out.println("1");
                break;
            case "april":
                System.out.println("2");
                break;
            case "may":
                System.out.println("2");
                break;
            case "june":
                System.out.println("2");
                break;
            case "july":
                System.out.println("3");
                break;
            case "august":
                System.out.println("3");
                break;
            case "september":
                System.out.println("3");
                break;
            case "november":
                System.out.println("4");
                break;
            case "december":
                System.out.println("4");
                break;

            default:
                System.out.println("bam güm");


        }















    }
}
