package day27exceptionscollections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/*
   Collections are for storing multiple data in the same data type.
   Collections flexible in length.
   Collections have many useful methods.

   There are 3 main Collections: i)List ==> a)ArrayList:Successful in "search operations" but not good at "adding" and "removing"
                                            b)LinkedList:Successful in "adding" and "removing" not good at "search operations"
                                 ii)Queue ==> a)PriorityQueue b)Deque(Double ended queue)
                                 iii)Set  ==> a)HashSet b)LinkedHashSet c)TreeSet
 */
public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");
        System.out.println(visitors);//[Tom, Jane, Mary, Carl, Ali]
        visitors.addLast("Mahmut");
        System.out.println(visitors.indexOf("Jane"));
        System.out.println(visitors); //[Tom, Jane, Mary, Carl, Ali, Mahmut]
        LinkedList<String> kids = new LinkedList<>();

        visitors.add("kids1");
        visitors.add("kids2");


        visitors.addAll(kids);
        System.out.println(visitors); //[Tom, Jane, Mary, Carl, Ali, Mahmut, kids1, kids2]

        visitors.add(2,"Miami"); //Normally LinkedList does not use "indexes" Jva displays it as index to make usage easy for us.
        System.out.println(visitors); //[Tom, Jane, Miami, Mary, Carl, Ali, Mahmut, kids1, kids2]

        visitors.addAll(2,kids);
        System.out.println(visitors);

        visitors.remove(2);
        System.out.println(visitors);

        visitors.remove("Jane");//remove(); method remove firstOccurrence of the "object"
        System.out.println(visitors);

        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("kids1");
        System.out.println(visitors);


        //Example 1: Change all names start with "A" to "****"
        for (String w : visitors){

            if (w.startsWith("A")){
                visitors.set(visitors.indexOf(w), "*****");
            }

            System.out.println(visitors);
    }

        //Example 2: If the number of characters is more than 4, remove them from the linked list
       //Interview Question
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
       for (int i=0; i<names.size();i++){
           if (names.get(i).length()>4){
               names.remove(names.get(i));
               i--;
           }
       }
        System.out.println(names);





}}
