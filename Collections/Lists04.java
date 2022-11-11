package day17listsbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

        // Example 1: Type code to mate all elements in a list unique
        //    [2,3,2,2,5]==>[2,3,5]---------COMMON INTERVIEW QUESTION.-----------
        List<Integer> a = new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        int idx = 0;
        for (Integer w : a){
            if (!b.contains(w)){
                b.add(w);

            }
        }
        System.out.println(b);
        //Example 2: Ask user to enter a letter, if the letter exist inside the list, convert to element to "Got it"
        //          otherwise, add the element into the list
        //          [A,K,R,S] ==> User --> K==>[A,Got it, R,S]
        //          [A, K, R, S] ==> User -->P==>[A,K,R,S,P]

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String userAnswer = input.next();

        List<String> sym = new ArrayList<>();
        sym.add("A");
        sym.add("K");
        sym.add("R");
        sym.add("S");
        sym.add("A");

            if (sym.contains(userAnswer)){
              int user1 =  sym.indexOf(userAnswer); //indexOf() method returns -1 for non existing elements.
              sym.set(user1,"Got it");
            }else {
                sym.add(userAnswer);
            }
        System.out.println(sym);

            //Note : How can you understand the existence of a spesific element in a List.
            //       i)Use indexOf() method if the result is "-1" it means the element does not exists.
            //       If the result is not is "-1" it means the element exists
            //       ii)Use contains()
        System.out.println(sym.lastIndexOf("A"));//LastIndexOf() method gives you the index of last occurence of a spesific element
                                                     //LastIndexOf() method returns "-1" for non-existing elements



    }

}
