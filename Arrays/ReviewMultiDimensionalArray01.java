package day15multidimensionalarraylists;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ReviewMultiDimensionalArray01 {
    public static void main(String[] args) {




        //Example 2: Print the elements which have “a” from a 2 dimensional String array. { {“learn”, “java”, “it”}, {“is”, “easy”} }

        String arr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w : arr){
            for (String s : w){
                if (s.contains("a")){
                    System.out.print(s);
                }
            }
        }
        System.out.println();
        //Example 2: Create an integer multidimensional array then find the sum of the elements.
        int brr[][] = {{12,54},{3,2,7},{21}};
        int sum =0;
        for(int[] w : brr ){
            for (int s : w){
                sum = sum + s;
            }
        }
        System.out.println(sum);

        //Example 1: Convert multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }
        String srr[][] =  {{"learn", "java", "it"}, {"is", "easy"} };
int sumOf = 0;
        for(String[] w : srr){
          sumOf = sumOf + w.length;
            }
        String srr2[] = new String[sumOf];

       int idx = 0;
        for (String[] w : srr) {

            for (String s : w){
                srr2[idx]=s;
                idx++;
            }
    }
        System.out.println(Arrays.toString(srr2));


        //Example 1: Find the maximum element in a two-dimensional array
        //           { {5, 0}, {-2, 4}, {65, -12, 23} }

        int arr3[][] = {{5,0},{-2,4},{65,-12,23}};
       int max = arr3[0][0];
        for (int[] w: arr3){

            for (int s : w){
    if (max<s){
        max = s;
    }
}
        }
        System.out.println(max);






























    }
}