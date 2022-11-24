package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
          ///INTERVIEW ALERRRRTTTTTTTTTTTTTTTTT
        //Type code to print the number of occurrences of words in a sentence
        // "I like to move it, move it do you like it?" => I=1, like=1, to1, move=2,it=3,do=1, you=1

        String sentence = "I like to move it, move it do you like it?";

        sentence = sentence.replaceAll("\\p{Punct}", "");

        //Get the words from the sentence by using split() with space
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occurenceMap = new HashMap<>();

        for (String w : words){
            Integer numOfOccurrence = occurenceMap.get(w);//get() method in Hashmap gives the value of a key.
            if (numOfOccurrence==null) {

               occurenceMap.put(w,1);

            }else{
                occurenceMap.put(w,numOfOccurrence+1);
            }
        }
        System.out.println(occurenceMap);

        //Type code to print the number of occurrences of letters in a sentence
       sentence = sentence.replaceAll(" ", "");

       HashMap<String,Integer> letterOnMap = new HashMap<>();

       String[] letters = sentence.split("");
       for (String w : letters){
           Integer numOfLetters = letterOnMap.get(w);
           if (numOfLetters==null){
               letterOnMap.put(w,1);

           }else{
               letterOnMap.put(w,numOfLetters+1);
           }
       }
        System.out.println(letterOnMap);
    }
}
