package day33lambda;

import day32lambdafp.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

//reduce() method is final method those methods called "terminal method"
public class FunctionalProgramming04 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
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
        System.out.println();
        getSumOfAllElements02(l);
        System.out.println();
        getSumOfIntFrom7to100A(); //5029
        System.out.println();
        getSumOfIntFrom7to100B();
        System.out.println();
        getProductOfIntegersTwoToEleven(l);
        System.out.println();
        findFactorial(-1);
        System.out.println();
        sumOfGivenIntegersDifference(2,10);
        System.out.println();
        sumOfDigitsBetweenTwoInteger(11,13);










    }
    //1)Create a method to find the sum of all elements in the list
    public static void getSumOfAllElements(List<Integer> l){
       Integer sum = l.stream().reduce(0,Math::addExact);
        System.out.println(sum);
    }
    public static void getSumOfAllElements02(List<Integer> l){
       Integer sum = l.stream().reduce(0,UtilsClass::sumOfElements);
        System.out.println(sum);
    }
    //2)Create a method to find the sum of Integers from 7 to 100
    //1.Way
    public static void getSumOfIntFrom7to100A(){
        Integer sum = IntStream.range(7,101).reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //2.Way
    public static void getSumOfIntFrom7to100B(){
       Integer sum = IntStream.rangeClosed(7,100).sum();
        System.out.println(sum);//sum ==> Returns the sum of elements in this stream
    }
    //3)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static void getProductOfIntegersTwoToEleven(List<Integer> l){
        Integer sum =IntStream.range(2,12).reduce(1,Math::multiplyExact);
        System.out.println(sum);
    }

    //INTERVIEW ALERT
    //4) Create a method to calculate the factorial of a given number.(5 factorial = 5! )
    public static void findFactorial(int x){
       if (x>=0) {
           Integer sum = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
           System.out.println(sum);
       }else{
           System.out.println("Negative numbers cannot have factorial");
       }
    }
    //5)Create a method to calculate the sum of even integers between given two integers
    public static void sumOfGivenIntegersDifference(int a , int b){
        Integer sum = IntStream.rangeClosed(a+1,b-1).filter(day33lambda.UtilsClass::checkToBeEven).reduce(0,Math::addExact);
        System.out.println(sum);
    }

    //6)Create a method to calculate the sum of digits of every integer between given two integers

    public static void sumOfDigitsBetweenTwoInteger(int a , int b){
       Integer sum =  IntStream.rangeClosed(a,b).map(day33lambda.UtilsClass::getSumOfDigits).sum();
        System.out.println(sum);
    }


}
