package day27exceptionscollections;

public class CustomExceptions01 {
   /*
   Normally, Java has many Exception Classes which cover many issues
   Sometimes we need Custom Exceptions for 2 reasons;
       1) To make Java exceptions more specific
          "FileNotFoundException" has 2 reason in it i)path can be wrong ii)file doesn't exist
       2) To create some Exceptions for our application
          "IllegalGradeException" can be created for a school management system application
       3) Custom Exceptions directs the developers not to break the application rules.
   */
   public static void main(String[] args) {
       try {
           printGrades(-1);
       } catch (IllegalGradeException e) {
           System.out.println(e.getMessage());
       }
       System.out.println(checkNameFormat("tom"));

   }
   public static void printGrades(double grade) throws IllegalGradeException {
       if (grade<0 || grade>100){
           throw new IllegalGradeException("Grade cannot be less then 0 and more than 100");
       }else {
           System.out.println(grade);
       }
   }
   public static boolean checkNameFormat(String name){
       if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
          return true;
       }else{
           throw new IllegalNameException("Names cannot starts with lowercase");
       }

   }
}
