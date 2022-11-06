package day12variabletypesstaticblockarrays;

/*
        1)If you dont assign any value for "static" and "non static" variables, Java assign's "default" values to them.
        but Java doesnt assign default value for "local variables".

        2)Default values are "0" for numeric data types, it is "null" for String, it is false for "boolean".

 */                                       //Java Class loader:Makes the class ready to use for you.
public class StaticBlock01 {
    /*
    1)Java Class Loader makes the classes ready to use
    2)When the classes make ready, class members are loadeded according to some order.
      main method is the first to be loaded normally
      3)Sometimes we need something to be loaded before main method, for this scenerio we use "StaticBlock".
        The code inside the "static block" is executed before everything in the class . Even before the main method.
      4)Rule:"static" structures can work just with the static class members.
              Do not put non-static class members into static method, it will give error
       5)"static block" can be used just with the "static" variables, because of the rule in 4th step.
        6)"static block" is used to initialize(assigning first value" "static variables"


           Note: When we create a variable inside the main method, we do not use "static" keyword, because Java knows everthing
           inside the main is "static".
     */

    public static double pi;


    public static void main(String[] args) {
        System.out.println("This is main method");


    }
    static{
        System.out.println("This is static block");
        pi = 3.14;//initializing pi variable

    }
    static{
        System.out.println("This is static block2");

    }


















}
