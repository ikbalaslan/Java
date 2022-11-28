package day33lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming07 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        getSumOfAllElements(l);
        getSumOfTwoIntegers(7,100);;
    }
    //Create a method to find the sum of all elements in the list
    public static void getSumOfAllElements(List<Integer> l){
       Integer result = l.stream().reduce(0,Math::addExact);
        System.out.println(result);
    }
    //2)Create a method to find the sum of integers from two integers
    public static void getSumOfTwoIntegers(int x,int y){
       Integer result = IntStream.rangeClosed(x,y).reduce(0,Math::addExact);
        System.out.println(result);
    }











}
