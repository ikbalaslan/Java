package day30maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        /*
        We have for-loop, while loop, do-while loop and for each loop.
        for each loop is better to use because it is easier to use and its performance is better than the others.(It works faster)
        But by using for each loop it is impossible to remove or modify a collection.
        Therefore, Java created a new structure to be able to remove some elements from a collection or modify a collection.
        The new is called "Iterators".
        There 2 iterators i)Iterator :Has one direction, from right to left.Iterator is just for removing elements
                          ii)List Iterator:Has two directions from right to left and from left to right.
                                           ListIterator can be used for update as well .
         for-each-loop and iterators have same performance but iterators are the best to remove elements or to modify elements in a collection
         */
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        //Example 1: Update every element by putting "!" to the end
        //1.Way: for-each-loop could not update the collection without using set() method
        for (String w: list1){

            w=w+"!";
            list1.set(1,"X");
        }
        System.out.println(list1);

        //2.Way: By using iterator
        ListIterator<String> itr = list1.listIterator();
        while(itr.hasNext()){
            String el = itr.next();

            itr.set(el + "*");
        }
        System.out.println(list1);//[Ali*, X*, Aliye*]

        while(itr.hasPrevious()){
            String el = itr.previous();
            itr.remove();
        }
        System.out.println(list1);// [Ali*, X*, Aliye*] Nothing changed because pointer at the end of the list from last operation.
        System.out.println(list1);//  []                After the changing hasNext() to hasPrevious() It actually works.

        //Remove elements by using iterator
//        Iterator<String> itr1 = list1.iterator();
//        while(itr1.hasNext()){
//            String el = itr1.next();
//
//            itr1.remove();
//        }
//        System.out.println(list1);//[]








    }
}
