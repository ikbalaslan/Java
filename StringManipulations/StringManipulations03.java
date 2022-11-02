package day06stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //1.Example: Print the first and the last character of the given String on the console. "Java is easy" ==> Jy
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        //1.Way: By using charAT()
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        System.out.println(firstChar + lastChar);//162 => 65+97 Note: If you use "char" data type in math operation, Java uses ASCII values not the characters
        System.out.println("" + firstChar + lastChar);//Note: When you put "" at the begining it will be concatenation operation and you will get String.


        //2.Way:By using substring()
       String firstCharacter = str.substring(0,1);//substring(0,1) gives you first character everytime

        String lastCharacter = str.substring(str.length()-1);//substring (begining index) gives you the characters from a spesific index to the last index

        System.out.println( firstCharacter + lastCharacter);


        //2.Example: Print just the animal names from the String; "I like lion, horse, laptop and cat"

        String s = "I like lion, horse, laptop and cat";

        String animals = s.substring(7,20);
        String animals2 = s.substring(31);
        System.out.println(animals + animals2);

        //3.Example: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.

        String name1 = "Ali Can";
        String ali = name1.substring(0,1);

       String initialOfLastName =  name1.split(" ")[1].substring(0,1);
        System.out.println(ali + initialOfLastName);

        //4.Example: Type code to find the number of words in a String // ; "I like to move it, move it" ==> 7
       String song = "I like to move it, move it";

       int numOfSong = song.split(" ").length;

        System.out.println(numOfSong);


        int x =12;   int y =25;






























    }
}
