package javaquestionbank;

import java.time.LocalTime;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //If the hour is
        //i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
        //ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
        //iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
        //iv) For the others print ‘Personal time’ on the console


        Scanner input = new Scanner(System.in);
        System.out.println("enter hour");
        int hour = input.nextInt();
        System.out.println("Enter minute");
        int min = input.nextInt();

        LocalTime lctNow = LocalTime.of(hour,min);
        int lctNew = lctNow.getHour();
        if (lctNew>0 && lctNew<5){
            System.out.println("Sleeping Time");
        }else if (lctNew >=8 && lctNew<16){
            System.out.println("Working Time");
        }else if (lctNew>19 && lctNew<22){
            System.out.println("Family Time");
        }else{
            System.out.println("Personal time");
        }


        //Type code to find time difference between Japan time zone and Germany time zone








    }
}
