package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //how to create a List(ArrayList)
        //1.Way:
        ArrayList<Integer> myList1 = new ArrayList<Integer>();

        //2.Way:
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.Way:
        List<Integer> myList3 = new ArrayList<>();

        //How to print a list on the console
        System.out.println(myList3); // []

        // How to add elements in to a list
        // Note: add() method puts the elements in by insertion order.
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);

        System.out.println(myList3);// [12, 7, 23]

        //How to add an element into a spesific index.
        myList3.add(1,50);

        System.out.println(myList3);// [12, 50, 7, 23]

        myList3.add(3,99);

        System.out.println(myList3);// [12, 50, 7, 99, 23]

        //how to join two lists
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);//[A,B,X,Y,Z]
        System.out.println(b);//[X,Y,Z]
        a.addAll(1, b);
        System.out.println(a);//[A, X, Y, Z, B, X, Y, Z]

        //How to get number of elements in a List.
       int sizeOfA = a.size();
        System.out.println(sizeOfA);// 8
        int sizeOfB = b.size();
        System.out.println(sizeOfB);// 3

        //Note: When you talk number of elements in an Array use "length() of the array"
        //        When you talk about number of elements in a Lists use "size() of the array";

        //Example 1 : Type code to check if the given Lists is empty or not.

        //1.Way
        if (a.size()!=0){
            System.out.println("That lists is not empty");
        }else{
            System.out.println("That lists is empty list");
        }

        //2.Way
        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');
        int sizeOfC = c.size();
        if (sizeOfC==0){
            System.out.println("The list is empty");

        }else{
            System.out.println("The list is not empty");
        }
        //3.Way: java created a method to check if a list is empty or not
        //isEmpty() method returns "true" if the list does not have any element.
        //isEmpty() method returns "false" if the list has at least 1 element.
        boolean f = c.isEmpty();
        if (f){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }
        //Note: If Java has a method for spesific functionality using the method is preferable.

        //Example 2: Type code to check if the list doesnt have any element different from space or the list does not have any element .
        //           []==> acceptable        [ , , ] ==> Acceptable        [a]==>Not Acceptable


        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add("a");
        d.add(" ");
        System.out.println(d); // [ , a,]
       // To be able to use removeALl() method you need List, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
      e.add(" ");

     //removeALL() method is use to remove multiple element from a list.
        //When you use removeAll() method, you will need a list stores the element you want to remove
      d.removeAll(e);
        System.out.println(d);// [a]
        if (d.isEmpty()){
            System.out.println("The list is empty or has just space character");
        }else{
            System.out.println("The list has character/s different from space");
        }









































    }
}
