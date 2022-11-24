package day29maps;

import java.util.HashMap;

public class HashMap02 {
    /*
    1)When you create a HashMap, Java creates 16"bucket"s in memory and index them from 0 to 15
    2)When you use "put()" method, Java creates an Integer Hashcode and calculates Hashcode%16
    3)The result of Hashcode%16 will be the index to select bucket
    4)After selecting bucket, Java will put the entry into the selected bucket as a node of a linked list.
    5)Every node will have 4 parts in it i)HashCode ii)Key iii)Value iv)Pointer
    6) java makes every Hashcode unique but sometimes Java can create same Hashcode accidentally, this is called "HashCode Collision".
    7)HashCode Collision"'s are common phenomena of hashing functions.
    8)If the key is "null" hashcode will be zero, that's why the entry whose is "null" will be put in to the bucket whose index is zero

     */
    public static void main(String[] args) {

        HashMap<String, Double> coursePrices = new HashMap<>();
        coursePrices.put("Full Stack Java Development", 6000.00);//Integer Hash code -> 33    33%16 =1 Java goes to index 1 of 16 Buckets.
        coursePrices.put("Full Stack Automation Engineer", 5800.00);//Integer Hash code -> 65   65%16 =1 Java goes to index 1 of 16 Buckets
        coursePrices.put("SalesForce Development", 4500.00);//Integer Hash code -> 33    21%16 =5 Java goes to index 5 of 16 Buckets


    }
}
