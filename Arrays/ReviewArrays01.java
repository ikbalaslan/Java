package day14arraysforeachloop;

import java.util.Arrays;

public class ReviewArrays01 {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0],

        int numeros[] = {0,2,3,0,12,0};
        int brr[] = new int[numeros.length];
       int idx=0;
        for (int i =0;i<numeros.length;i++){
            if (numeros[i]!=0){
               brr[idx]=numeros[i];
             idx++;
            }

        }System.out.print(Arrays.toString(brr));
    }
}
