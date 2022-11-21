package day25exceptions;

public class E05 {
    public static void main(String[] args) {
getCharFromString("xdt", 3);
    }
    //Create a method to get any character from a String
    public static char getCharFromString(String str,int idx){
      char x = '\u0000';
       try{
           x=str.charAt(idx);
       }catch(StringIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
       }return  x;
    }




}
