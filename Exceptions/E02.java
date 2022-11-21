package day25exceptions;

public class E02 {
    public static void main(String[] args) {
        String b[] = {"A", "C","B","Z"};
        String r1 = getElement(b,8);
        System.out.println(r1);
    }
    //Create a method to get any element from a String Array.

    public static String getElement(String a[], int idx){
       String k = "";
        try{
             k= a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Get the hell out of here");
            System.out.println(e.getMessage());//Gives technical message about the exception
            e.printStackTrace();//Gives detailed technical message about the exception

        }return k;
    }








}
