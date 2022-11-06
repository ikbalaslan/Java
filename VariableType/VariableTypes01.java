package day12variabletypesstaticblockarrays;

public class VariableTypes01 {
    //"name" is "non-static" or "object" or "instance" variable

    public String name = "Tom Hanks";


    //age is "static" or "class" variable
    public static int age =13;

    //local variables
    //If you create a variable inside the method its called "local variable"
    //When you create a "local variable" it is mendatory to assign a value.
    //If you try to use a local variable without assigning a value it complains.
    //Local variables can be used just inside the method.

    //Note: If the return type different from "void"
    //       you have to use "return" keyword inside the method.
    public int add(int a,int b){    //<-- This is the method.

        int x = 12;//local variable
        System.out.println(name);
        return a+b;
    }

    //Create a method to do multiplication.
    public int mult(int x,int y){
        return x*y;

    }

















}
