package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        // How to get current data by typing Java code
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-28

        //How to get current time by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //How to get "current date and time" by typing Java code
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // How to get "current data" in another country by typing Java code
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);
        LocalDate currentDateInTurkey = LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateInTurkey);

        // How to get "current data and time " in USA by typing code
        LocalDateTime currentDateTimeInUsa = LocalDateTime.now(ZoneId.of("US/Eastern"));
        System.out.println(currentDateTimeInUsa);

        //How to get "current time" in Japan by typing Java code
        LocalTime currentJapanTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentJapanTime);

        // How to get "current data and time " in Japan by typing code
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);
        //How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-28
        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);//If you use multiple method in the same line that usage is called
                                                                          // method chain
        System.out.println(cd1Next);//2025-06-28

        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-23

        //Homework: Type code to learn how to going future and past in time.

        //How to get a spesific part of the time.
        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);//18

        int minute = ct1.getMinute();
        System.out.println(minute);//38

        //How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Uppercase M is for months, lowercase m is for minutes.

        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);//28/09/2022

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");//MMM gives you the first 3 characters of the month name
                                                                        // yy gives you the "last 2 digits" of the year
        String formattedCurrentDate2 = dt.format(cd1);
        System.out.println(formattedCurrentDate2);//28/Eyl/22

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);//28/Eylül/2022

        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a");//hh uses 12 system, HH uses 24 hours system.
                                                                       //Single a is for to display "AM" or "PM"
        LocalTime lt = LocalTime.now();
       String formattedCurrentTime =  mnr.format(lt);
        System.out.println(formattedCurrentTime);// 07:47 ÖS

        //How to create a spesific dates.
        LocalDate dob1 = LocalDate.of(2012,3,13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY,21);

        /*
        Enum is something like class normally in a class you have variables and methods. In enums you may have variables
        and methods as well. But when you create enum we use it to store constant variables. Unchangeable variables. Lİke months...
        Whenever you need Unchangeable variables use enum
        FOr example, you are creating for Honda-Honda has some models like Civic HRV....
        Their names will change anytime honda civic exists many years.
        If you are sure they will remain same for long time. You are creating application for Honda you will use civic model
        many times in your application.
        You put them in enum when you need models you go to enum select it from there and use. You dont need to memorise model name.
        Go to enum and get the one you need. When you create a value in enum you can add values.
        For example, you are working with states in USA create a enum and put states in it. Then you create method to get variables
        from that enum
         */

        //How to compare two dates
        //In is before() method if the first date is before the second date you get true
        //Otherwise(equality and first is after) you will get false
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is = dob2.isBefore(dob1);
        System.out.println(is);//false

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);//true

    }
}
