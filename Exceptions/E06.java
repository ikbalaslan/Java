package day25exceptions;

public class E06 {
    public static void main(String[] args) {
       // doCombo(null,3 );//str.length(); will throw NullPointerException, execution will be stopped in line 16.
        //doCombo("12a",3 );//Integer.valueOf(str);; will throw NumberFormatException, execution will be stopped 17.
       // doCombo("12",0 );//convertedStr/given; will throw ArithmeticException, execution will be stopped in line18.
        doCombo2(null,3 );
        doCombo2("12a",3 );
        doCombo2("12",0 );
    }

    //Create a method i)Find the length of the String ii)Convert the String to an integer iii)Divide the integer by a given number
    public static void doCombo(String str,int given){

        try{
           int lengthOfString =str.length();
           int  convertedStr = Integer.valueOf(str);
           int  result = convertedStr/given;
        }catch (NullPointerException e){
            System.out.println("There is a problem finding length");
        }catch (NumberFormatException e){
            System.out.println("There is a problem in conversion");
        }catch (ArithmeticException e){
            System.out.println("There is a problem in division");
        }

        System.out.println("Execution didn't stop");
    }
    public static void doCombo2(String str,int given){

        try{
            int lengthOfString =str.length();
            int  convertedStr = Integer.valueOf(str);
            int  result = convertedStr/given;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Execution didn't stop");
    }









}
