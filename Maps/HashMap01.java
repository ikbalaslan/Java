package day29maps;

import java.util.*;

public class HashMap01 {
    /*
    1)Maps have key-value structure.
    2)Key's are unique but value's are not
    3)Every element in a Map is called as "Entry"
    4)All elements are called "EntrySet"
    5)Key cannot be "null" in maps , except "HashMap" but value can be.
    6)HashMap's

     */
    public static void main(String[] args) {
        //How to create a HashMap
        HashMap<String,Integer> stdAges = new HashMap<>();
        //How to put entries into a HashMap
        stdAges.put("Ali Can",13);
        stdAges.put("Tom Hanks",46);
        stdAges.put("Brad Pit",55);
        stdAges.put("Angelina Julie",48);

        System.out.println(stdAges); //{Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ali Can=13}

        //How to get just keys from a Map
        Set<String> keys = stdAges.keySet();
        System.out.println(keys);//[Tom Hanks, Brad Pit, Angelina Julie, Ali Can]

        //How to get just values from a Map
        Collection<Integer> ages = stdAges.values();
        System.out.println(ages);//[46, 55, 48, 13]

        //Can I put null into key
        //Yes you can use null just in HashMap Key
        stdAges.put(null,23);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ali Can=13}

        //Can I put null into key
        //Yes you can put null into the values in Maps.
        stdAges.put("Ajda Pekkan",null);
        stdAges.put("Beyonce",null);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ajda Pekkan=null, Ali Can=13}

        //What happens if you use same key repeatedly ?
        //Java accepts the final value for the key(overwriting).
        stdAges.put("Angelina Julie",23);
        System.out.println(stdAges);

        //How to get a value of a key?
        Integer tomAge = stdAges.get("Tom Hanks");
        System.out.println(tomAge);//46

        //If the key does not exist when you use get() method what happens ?
        //It returns null for non-existing keys
        Integer unknownAge = stdAges.get("Abc xyz");
        System.out.println(unknownAge);//null
        //getOrDefault("Abc xyz", 0); method returns the value of "Abc Xyz" if Abc Xyz exists among the keys
        //                            returns the values of second parameter if Abc Xyz does not exist among the keys.
        Integer unknownAge2 = stdAges.getOrDefault("Abc xyz", 0);
        System.out.println(unknownAge2);//0

        //I want to put an entry if the does not exist, if the entry exists I will not put it.
         stdAges.putIfAbsent("Brad Pit", 44);
        System.out.println(stdAges);//ıt didn't change because Key(Brad Pit) exists.

        stdAges.putIfAbsent("Cuneyt Arkin", 44);
        System.out.println(stdAges);//It has come to map . Because it doesn't exist before this adding operation.

        //How to update the value of a key
        stdAges.replace("Tom Hanks", 56);
        System.out.println(stdAges);//Tom Hanks=56

        //How to update the value of a key after checking key and the existing value
        stdAges.replace("Tom Hanks", 56,66);
        System.out.println(stdAges);//Tom Hanks=66 updated because "56" is the right value. if we type a wrong old value it will not change

        //How to remove an entry from a Map
        stdAges.remove("Beyonce" ); //Beyonce is deleted.

        stdAges.remove("Ajda Pekkan",null);
        System.out.println(stdAges);//Ajda Pekkan is removed. Because both the info's are true.

        //How to get entries one by one from a Map
        Set<Map.Entry<String,Integer>> entries = stdAges.entrySet();
        for (Map.Entry<String,Integer> w : entries){
            System.out.println(w+"!");
        }




    }
}
