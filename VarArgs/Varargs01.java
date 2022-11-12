package day18datetimeclassvarargs;

public class Varargs01 {
     /*
        1)If you want to make number of parameters flexible in a method, use "varargs"
        2)To create a varargs "Data Type + ... + space + a name for the varargs"
        3)"Varargs" use Arrays behind. When you work with varargs you may think you are working with Arrays.
        4)"Varargs" can accept zero or more elements.
        5)Can i use another regular parameter after "varargs"
          No, because "varargs" cannot be made full, second parameter will be unreachable, it will give error.
          "varargs" must be last parameter everytime.

        6)Can I use another regular parameter before "varargs" ?

          Yes, you can use many regular parameters before varags.
        7)Can I use multiple "varargs" parameter in a method ?
          No you can use only 1 varargs parameter inside the method."Varargs" parameter must be the last in the list.
      */


    public static void main(String[] args) {
        System.out.println(add(3, 5));//8
        System.out.println(add(3,5,2));//10
        System.out.println(add());//0
    }
//Create a method adds two integers

    public static int add(int... a){
 int sum = 0;
 for (int w: a){
    sum = sum +w;

  }  return sum;

    }





}

