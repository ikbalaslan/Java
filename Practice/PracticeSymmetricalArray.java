package practice;

public class PracticeSymmetricalArray {
    //Type a method to check if an Array is symmetrical or not .
    //palindrome

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1};

        System.out.println(symmetrical(arr));
        System.out.println(symmetricalOrNot(arr));

    }

 //My Way
    public static boolean symmetricalOrNot(int [] arr){
boolean result=false;

        for (int i=0 ;i<=arr.length-1;i++){
            int count =0;
            if (arr[i]==arr[arr.length-1-i]){
               result=true;
                }else{
                result=false;
                break;
            }
        }
        return result;
    }
    //Teacher Way

    public static boolean symmetrical(int [] arr){
        boolean result =false;
        for(int i =0;i<=arr.length-1;i++){
            if (arr[i]==arr[arr.length-1-i]){
                result=true;

            }else{
                result=false;
                break;
            }
        }
return result;
    }








}
