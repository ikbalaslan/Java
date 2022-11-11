package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime02 {
    public static void main(String[] args) {

        //Example 1:
        //Type code to find out how many months Ali lived. Date of birth Ali is 4th June 1997
        LocalDate dobAli = LocalDate.of(1997, Month.MAY,4);
        LocalDate currentDate = LocalDate.now();

        long numOfMonths = ChronoUnit.MONTHS.between(dobAli,currentDate);//When you use between method first one should be "before" then the second one
        System.out.println(numOfMonths);

        //Example 2:Tom was born 45years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years,  2 months and 11 days before 15 September 1993.
        // Type code to calculate the exact date of birth of Tom and Veli
        // Type code to check if the date of birth Tom and Veli is the same or not.

        LocalDate dobTom = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dobTom);

        LocalDate dobVeli = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobVeli);
        boolean check = dobTom.isEqual(dobVeli);
        System.out.println(check);

        //Example 3: Type code to find the time difference in hours between Japan time zone and Germany time zone.
        LocalDateTime localInTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localInTokyo);
        LocalDateTime localInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localInGermany);

        long diffrenceGJ = ChronoUnit.HOURS.between(localInGermany,localInTokyo);
        System.out.println(diffrenceGJ);










    }
}
