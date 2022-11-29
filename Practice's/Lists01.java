package javaquestionbank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
      //  Find the sum of all list elements in an integer list
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum=0;

        for (Integer w : myList){
            sum = sum + w;
        }
        System.out.println(sum);

       // Find the sum of all list elements before the first occurrence of 13 in an integer list
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(12);
        myList1.add(31);
        myList1.add(7);
        myList1.add(13);
        myList1.add(10);
        int sum1 = 0;


        for (Integer w : myList1){

            if (w ==13){
                break;
            }
                sum1 = sum1 + w;

}
        System.out.println(sum1);

       // 3) Find the multiplication of all even list elements in an integer list
        //1.Way:
        List<Integer> myList3 = new ArrayList<>();
        myList3.add(12);
        myList3.add(31);
        myList3.add(7);
        myList3.add(13);
        myList3.add(10);
        int multi = 1;
        for (Integer w : myList3){
            if (w%2==0)
            multi = multi*w;
        }
        System.out.println(multi);

       // 4) Check if elements are in descending order in a list
       // Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        // (Yellow, Red, Green, Blue) ==> Output: It is in descending order

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for(int i=0; i<size; i++){
            if(f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
            System.out.println("It is in descending order");
        }else{
            System.out.println("It is not in descending order");
        }

       // 5) If the list has 15 as element, change all 15s to 51
        //Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);

        for (Integer w: g){
            if (w==15){
                int idx = g.indexOf(w);
                g.set(idx,51);

            }

        }
        System.out.println(g);

     //   6) If a list has 15 or 13, remove them.
       //         Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
        List<Integer> anotherOne = new ArrayList<>();
        anotherOne.add(10);
        anotherOne.add(31);
        anotherOne.add(15);
        anotherOne.add(13);
        anotherOne.add(54);

        if (anotherOne.contains(15) || anotherOne.contains(13)){
            for (Integer w : anotherOne){
                if (w==13){
                    int idx1 = anotherOne.indexOf(w);
                    anotherOne.remove(idx1);
                }
            }
            for (Integer w : anotherOne){
                if (w==15){
                    int idx2 = anotherOne.indexOf(w);
                    anotherOne.remove(idx2);
                }
            }
        }
        System.out.println(anotherOne);

      //  7) Find the closest 2 integers in an Integer List
      //  Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13


        List<Integer> closest = new ArrayList<>();
        closest.add(12);
        closest.add(31);
        closest.add(15);
        closest.add(13);
        closest.add(54);
        int s = 0;
        for (int i = 0; i<closest.size();i++){




        }




















    }
        }










