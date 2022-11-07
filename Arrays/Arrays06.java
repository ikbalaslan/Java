package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a spesific elements exist in Array or not.

        String str[] = {"Ali", "Tom", "Carl", "Angie"};
        //1.Way
        int counter = 0;
        String elements = "Angie";
        for (String w : str){
            if (w.equals(elements)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(counter +" times Angie exist" );
        }else{
            System.out.println("Angie not exist");
        }
        //2.Way: We will use binarySearch() method
        //       i)If the elements exist binarySearch() method returns index of the elements.
        Arrays.sort(str);//Ali - Angie - Carl - Tom
        int idx = Arrays.binarySearch(str, "Carl");
        System.out.println(idx);//If the index is zero or more it means the elements exists.


















    }
}
