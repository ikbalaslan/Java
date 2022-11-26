package day30maps;

import java.util.*;

public class Iterators02 {
    public static void main(String[] args) {

        //Example 1: Increase the numbers in a List by 20 percent than print the elements in the reverse order of the given order
        //           [20,60,30,100] ==> [24,72,36,120]

        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(60);
        list1.add(30);
        list1.add(100);

        ListIterator<Integer> itr =  list1.listIterator();
        //That code moves to pointer to the end
        while(itr.hasNext()){
             itr.next();


        }
        //Even you do the update from right to left, order of list elements doesn't changed.
        //If you want to change the order of the elements use "Collections.reverse(list1)"
        while(itr.hasPrevious()){
              Integer el = itr.previous();
              itr.set(el*120/100);
        }
        Collections.reverse(list1);
        System.out.println(list1);//[120, 36, 72, 24]







    }
}
