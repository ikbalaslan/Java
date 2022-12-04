package practice.day11;

public class Q01_String_Manipulations {
    public static void main(String[] args) {
        //Get the inital from full name.(Middle Name out of scope.)




///* QuestionBank  Side 66 - 26) Get a String and a character from user
//Count the number of characters between the first occurrence and the last occurrence of the
//given character in the String
//Do not count the space characters
//If the character which user selected is displayed just once in the String return -1
//If the character which user selected does not exist in the String return -1
//For example; "Java  is easy" - 'a' ==> 5
// "Java is easy" - 'w' ==> -1
// "Java is easy" - 'e' ==> -1
// */

        //Verilen metin icinde a harfinden kac adet oldugunu bulan kodu yaziniz

        //String metin = "Merhaba dünya bu java örnekleri";

           String str ="Merhaba dünya bu java örnekleri";
           String b= "";

           for (int i =0;i<=str.length();i++){
               char a = str.charAt(i);
             if (a=='a'){
                 if (!b.contains("a")){
                     b=b+"a";
                 }
               }


           } System.out.print(b.length());

















    }
}
