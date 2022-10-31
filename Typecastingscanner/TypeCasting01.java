package day02typecastingscanner;


public class TypeCasting01  {

    public static void main(String[] args) {

      //Example 1: Create 2 integer variables and 1 String variable.
         int s1 = 214, s2=241;
         String Civconame = "vicik";
        System.out.println(Civconame+ s1+ s2);
        System.out.println(s1 + s2 + Civconame);
        System.out.println(Civconame+ s1*s2);
        /*
        Order of Operations in Math
        1)Calculate exponantial
        2)Do the operations insite parenthesis
        3)do multiplications and divisions
        4)Do additions and subtractions
            */

        int result = 3-2*(5*251);
        System.out.println(result);
        // Autowidening:
        int a = 12;
        System.out.println(a);

        double b =a;
        System.out.println(b);

        /*
        Java does not put large data types to small data types

        */

        int n = 15;
        byte d = (byte)n;


  








































    }
}
