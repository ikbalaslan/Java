package day25exceptions;

public class E04 {
    public static void main(String[] args) {
       int r1 = convertStringToInt("123");
        System.out.println(r1 +1);
        convertStringToInt("q");//NumberFormatException: If you use "valueof()"method with a String has non-digit character
                                //in it, you will have NumberFormatException
    }

    //Convert a method to convert a String to integer
    public static int convertStringToInt(String str){
       int x =0;
        try{
        x = Integer.valueOf(str);
       }catch (NumberFormatException e){
            System.out.println("A problem occured while I convert the String to integer - " + e.getMessage());
        }return x;
    }


}
